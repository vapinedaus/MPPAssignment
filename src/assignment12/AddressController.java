package assignment12;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AddressController implements EventHandler<ActionEvent> {

	@FXML
	private TextField txtName = new TextField();
	@FXML
	private TextField txtStreet= new TextField();
	@FXML
	private TextField txtCity = new TextField();
	@FXML
	private TextField txtState = new TextField();
	@FXML
	private TextField txtZip = new TextField();
	@FXML
	private Button btnSubmit = new Button("Submit");
	
	
	@Override
	public void handle(ActionEvent event)
	{
		if (event.getSource()==btnSubmit)
		{
			System.out.println(txtName.getText());
			System.out.println(txtStreet.getText());
			System.out.println(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
		}
	}

}
