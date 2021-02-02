package chainOfResponsibility;

public class CEOPurchasePower extends PurchasePower {

	@Override
	protected double getAllowable() {
		return base * 1000;
	}

	@Override
	protected String getRole() {
		return "CEO";
	}

}
