package chainOfResponsibility;

public abstract class PurchasePower {
	
	protected static final double base = 100;
	protected PurchasePower successor;
	
	protected abstract double getAllowable();
	protected abstract String getRole();
	
	
	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}
	
	public PurchasePower getSuccessor() {
		return successor;
	}
	
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getAmount() <= getAllowable()) {
			System.out.println(this.getRole() +" will approve $" + purchaseRequest.getAmount());
		}else if(successor!=null){
			System.out.println("Amount exceeds threshold for "+getRole() +". Sending request to successor : " + successor.getRole());
			successor.processRequest(purchaseRequest);
		}else {
			System.out.println("Amount cannot be approved and should go to founders for approvals!!!!");
		}
	}
	

}
