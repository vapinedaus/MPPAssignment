package Credit01;

public class CorporateCust extends ACustomer {
	private CreditRating creditRating;
	private double creditlimit;
	
	
	public CorporateCust(String name, String address, String phone) {
		super(name, address, phone);
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
