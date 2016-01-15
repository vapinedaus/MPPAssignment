package Credit01;

public class PersonalCust extends ACustomer {

	private CreditRating creditRating;
	private String creditCard;
	
	
	
	public PersonalCust(String name, String address, String phone) {
		super(name, address, phone);
		creditRating = CreditRating.good;
	}

	@Override
	public CreditRating getCreditRating() {
		// TODO Auto-generated method stub
		return CreditRating.excelent;
	}

}
