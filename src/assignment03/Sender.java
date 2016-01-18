package assignment03;

public enum Sender{
	student(0.10),
	senior(0.15),
	na(0);
	
	private double senderDiscount;

	private Sender(double senderDiscount)
	{
		this.senderDiscount = senderDiscount;
	}

	public double getSenderDiscount()
	{
		return senderDiscount;
	}
	
	
	
}


