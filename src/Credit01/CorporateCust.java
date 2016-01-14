package Credit01;

public class CorporateCust extends ACustomer {
	private CreditRating creditRating;
	private double creditlimit;
	
	
	public CorporateCust(String name, String address, String phone, double points) {
		super(name, address, phone, points);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CreditRating getCreditRating() {
		// TODO Auto-generated method stub
		return CreditRating.excelent;
	}
	
	
	public void generateMonthlyBill()
	{
		
	}

}
