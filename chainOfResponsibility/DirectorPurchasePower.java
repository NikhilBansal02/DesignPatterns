package chainOfResponsibility;

public class DirectorPurchasePower extends PurchasePower {

	@Override
	protected double getAllowable() {
		return base * 100;
	}

	@Override
	protected String getRole() {
		return "Director";
	}

}

