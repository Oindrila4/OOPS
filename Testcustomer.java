package oopsassignmentproblem1;

public class Testcustomer {

	public static void main(String[] args) {

		Customer customer1=new Customer(); //creating a default constructor
		customer1.setCustomerName("Oindrila"); //using setter with default constructor object
		Address address=new Address("Chandganj","Lucknow"); // using parameterized constructor
		
		System.out.println(address.getStreetName()); //using getters
		System.out.println(address.getCity());
		System.out.println(customer1.getCustomerName());
		
		address.getAddressDetails(); //calling method
		
		Customer customer2=new Customer("Shreya",address);
		System.out.println(customer2.getCustomerName());
		//System.out.println(customer2.getAd());
		
		customer2.getCustomerDetails();// calling customer details method
		
		customer2.setCustomerName("Adhallikar");
		System.out.println(customer2.getCustomerName());

	}

}
