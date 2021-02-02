package chainOfResponsibility;

public class TestChainofResponsibility {
	
	public static void main(String[] args) {
		
		//Creating Hierarchy Objects First
		CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
		DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
		ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();
		
		//Creating Hierarchy 
		managerPurchasePower.setSuccessor(directorPurchasePower);
		directorPurchasePower.setSuccessor(ceoPurchasePower);
		
		//Creating Purchase Request
		PurchaseRequest purchaseRequest = new PurchaseRequest(9000, "Office Party");
		
		managerPurchasePower.processRequest(purchaseRequest);
		
	}

}
