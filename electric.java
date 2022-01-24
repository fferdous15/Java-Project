import FileReadWrite.*;
import java.util.Scanner;
class electric extends guitar
{
	FileReadWriteDemo fileObject = new FileReadWriteDemo() ;
	
	public void Eletric()
	{
		System.out.println("\nHere are some models\n");
		
		System.out.println("Name: Fender.\nModel: Stratocaster.\nPrice: 30000tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nName: Gibson.\nModel: SG.\nPrice: 50000tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nName: Yamaha.\nModel: Pacifica.\nPrice: 130000tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nPress 1 for Yamaha. Press 2 for Gibson. Press 3 for Fender.\nWhich one of these you want to buy?\n");
	}
	
	
	public void Fender()
	{
		System.out.println("You have chosen Fender guitar.");
		System.out.println("Enter your quantity:\n");
		try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(30000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Fender.\nModel: Stratocaster.\nTotal Price: "+(30000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Fender.\nModel: Stratocaster.\nTotal Price: "+(30000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception a)
		{
			System.out.println("Invalid input!");
			System.out.println("please select a quantity between 1 to 10.\nSure you can order more than one!\n");
			
			try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(30000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Fender.\nModel: Stratocaster.\nTotal Price: "+(30000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Fender.\nModel: Stratocaster.\nTotal Price: "+(30000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception b)
		{
			System.out.println("Invalid input!");
			System.out.println("Please Try Again!\n");
		}
		}
	}
	
	public void Yamaha()
	{
		System.out.println("You have chosen Yamaha guitar.");
		System.out.println("Enter your quantity:\n");
		try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(130000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Yamaha.\nModel: Pacifica.\nTotal Price: "+(130000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Yamaha.\nModel: Pacifica.\nTotal Price: "+(130000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception a)
		{
			System.out.println("Invalid input!");
			System.out.println("please select a quantity between 1 to 10.\nSure you can order more than one!\n");
			
			try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(130000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Yamaha.\nModel: Pacifica.\nTotal Price: "+(130000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Yamaha.\nModel: Pacifica.\nTotal Price: "+(130000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception b)
		{
			System.out.println("Invalid input!");
			System.out.println("Please Try Again!\n");
		}
		}
	}
		
	public void Gibson()
	{
		System.out.println("You have chosen Gibson guitar.");
		System.out.println("Enter your quantity:\n");
		try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(50000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Gibson.\nModel: SG.\nTotal Price: "+(50000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Gibson.\nModel: SG.\nTotal Price: "+(50000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception a)
		{
			System.out.println("Invalid input!");
			System.out.println("please select a quantity between 1 to 10.\nSure you can order more than one!\n");
			
			try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else{
		System.out.println("\nPrice is: "+(50000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Gibson.\nModel: SG.\nTotal Price: "+(50000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Gibson.\nModel: SG.\nTotal Price: "+(50000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception b)
		{
			System.out.println("Invalid input!");
			System.out.println("Please Try Again!\n");
		}
		}
	}
	
	public void Harmonium(){}
	public void Piano(){}
	public void Violin(){}
}