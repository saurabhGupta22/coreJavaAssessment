package coreJava;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;



public class eCommerce {
	 static HashMap<String, String> mapCustomer = new HashMap<>(); 
	 static HashMap<String, Integer> mapProduct = new HashMap<>();
	 static HashMap<String, Integer> cart = new HashMap<>();
	
	
	static Scanner scan = new Scanner(System.in);
	public static void setCustomers() {
		String name = scan.nextLine();
		String password =scan.nextLine();
		mapCustomer.put(name,password); 
	
		
	}
	
	public static void setProduct()
	{
		String name = scan.nextLine();
		int price = scan.nextInt();
		mapProduct.put(name, price);
	}
	
	public static void setOrder()
	{
		System.out.println("Please enter your name and password");
		String name = scan.nextLine();
		String password = scan.nextLine();
		if(mapCustomer.containsKey(name))
		{
			if((mapCustomer.get(name)).equals(password))
			
			{
				System.out.println("welcome");
				for (Entry<String, Integer> entry : mapProduct.entrySet())  
		            System.out.println("product = " + entry.getKey() + 
		                             ", price = " + entry.getValue()); 
				
				System.out.println("enter the number of product you want to add in cart");
				
				int noProduct=scan.nextInt();
				String product;
				int pricee;
				for(int i=0;i<noProduct;i++)
				{
					System.out.println("enter product name");
					 product = scan.nextLine();
					System.out.println("enter the price");
					 pricee = scan.nextInt();
					cart.put(product, pricee);
				}
				
				
				
			}
			
			
			else
			{
				System.out.println("Wrong username or password");
				
			}
		}
		
	}
	
	public static void viewOrder()
	{
		for (Entry<String, Integer> entry : cart.entrySet())  
            System.out.println("product = " + entry.getKey() + 
                             ", price = " + entry.getValue()); 
		
	}
	
	
	
	public static int  getChoice()
	{
		System.out.println("Entet your choice 1.Register a Customer 2.create a product 3.create an order  4.view order");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	
	public static void main(String args[])
	{
		
		int choice = getChoice();

		do
		{
			switch(choice)
			{
			case 1:
				System.out.println("Register a customer");
				setCustomers();
				choice=getChoice();
				break;
			case 2:
				System.out.println("create a product");
				setProduct();
				choice=getChoice();
				break;
			case 3:
				System.out.println("create a order");
				setOrder();
				choice=getChoice();
				break;
			case 4:
				System.out.println("view a order");
				viewOrder();
				choice=getChoice();
				break;
			case 5:
				System.out.println("enter the choice again");
				choice = scan.nextInt();
			}
		}
		while(true);
	}

}
