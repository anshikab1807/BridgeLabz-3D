package MultilevelInheritance;

public class OrderMain {
	    public static void main(String[] args) {
	    	OnlineRetailOrderManagement o1 = new OnlineRetailOrderManagement(101, "2025-09-01");
	        ShippedOrder o2 = new ShippedOrder(102, "2025-09-05", "TRK12345");
	        DeliveredOrder o3 = new DeliveredOrder(103, "2025-09-07", "TRK67890", "2025-09-10");

	        System.out.println(o1.getOrderStatus());
	        System.out.println(o2.getOrderStatus());
	        System.out.println(o3.getOrderStatus());
	    }

}
