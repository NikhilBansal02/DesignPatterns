package chainOfResponsibility;

public class ManagerPurchasePower extends PurchasePower {

	@Override
	protected double getAllowable() {
		return base * 10;
	}

	@Override
	protected String getRole() {
		return "Manager";
	}

}
