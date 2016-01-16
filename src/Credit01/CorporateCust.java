package Credit01;

public class CorporateCust extends ACustomer {
	private CreditRating creditRating;
	private double creditlimit;
	
	
	


	public CorporateCust(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
		creditlimit = 5000;
	}

	
	@Override
	public CreditRating getCreditRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}
	
	
	
	
	
	public void setCreditRating(CreditRating creditRating) {
		this.creditRating = creditRating;
	}

	public double getCreditlimit() {
		return creditlimit;
	}
	public void generateMonthlyBill()
	{
		printOrders();
	}

}
