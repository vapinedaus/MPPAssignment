package assignment12.StringUtility;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StringUtilityController implements EventHandler<ActionEvent> {

	 @FXML
	 private TextField txtInput = new TextField();
	 @FXML
	 private TextField txtOutput = new TextField();
	 @FXML
	 private Button btnCountText = new Button();
	 @FXML
	 private Button btnReverse = new Button();
	 @FXML
	 private Button btnRemoveDuplicte = new Button();
	 
	 
	 @Override
	 public void handle(ActionEvent  event)
	 {
		 if (event.getSource()==btnCountText)
		 {
			 txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));
		 }else if (event.getSource()==btnReverse)
		 {
			 txtOutput.setText(String.valueOf(reverse(txtInput.getText())));
		 }
		 else if (event.getSource()==btnRemoveDuplicte)
		 {
			 txtOutput.setText(String.valueOf(removeDuplicates(txtInput.getText())));
		 }
		 
	 }
	 
	 @FXML
	 private String removeDuplicates(String input)
	    {
	    
	    	if (input.length() ==1)
	    	{
	    		return input;
	    	}
	    	else if( input.substring(1).contains(input.substring(0,1)))
	    	{
	    		return removeDuplicates(input.substring(1));
	    	}
	    	else
	    	{
	    		return input.substring(0,1) + removeDuplicates(input.substring(1));
	    		
	    	}
	    		
	   
	    	
	    	
	    }
	    
	    
	    
	 @FXML
	 private int countLetters(String input)
	    {
	    	if (input.isEmpty())
	    	{
	    		return 0;
	    	}
	    	else
	    	{
	    		return 1 +  countLetters(input.substring(0, input.length()-1));
	    	}
	    }
	    
	 @FXML
	 private String reverse(String input)
	    {
	    
	    	if (input.isEmpty())
	    	{
	    		return "";
	    	}
	    	else
	    	{
	    		return input.substring(input.length()-1) +  reverse(input.substring(0, input.length()-1));
	    	}
	    	
	    	
	    }

}
