import FileReadWrite.*;
import java.util.Scanner;
class acoustic extends guitar
{
	FileReadWriteDemo fileObject = new FileReadWriteDemo() ;
	
	public void Acoustic()
	{
		System.out.println("\nHere are some models\n");
		
		System.out.println("Name: Axe.\nModel: 197.\nPrice: 5000tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nName: Deviser.\nModel: 712.\nPrice: 7700tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nName: Tanglewood.\nModel: 001.\nPrice: 6500tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		
		System.out.println("\nPress 1 for Deviser. Press 2 for Axe. Press 3 for Tanglewood.\nWhich one of these you want to buy?\n");
	}
	
	public void deviser()
	{
		System.out.println("\nYou have chosen Deviser guitar.");
		System.out.println("Enter your quantity:");
		
		try{
		
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		
		if(quantity==0 || quantity>stock)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else
		{
			System.out.println("\nPrice is: "+(7700*quantity)+"tk");
			System.out.println("\nThis is your receipt:\nName: Deviser.\nModel: 712.\nTotal Price: "+(7700*quantity)+"tk");
			System.out.println("\nThank you for shopping with us!\n");
			fileObject.writeInFile("\nThis is your receipt:\nName: Deviser. Model: 712.\nTotal Price: "+(7700*quantity)+"tk");
			System.out.println("\nA receipt has been printed also!\n");
		}
		}
		
		catch(Exception e)
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
		else
		{
			System.out.println("\nPrice is: "+(7700*quantity)+"tk");
			System.out.println("\nThis is your receipt:\nName: Deviser. Model: 712.\nTotal Price: "+(7700*quantity)+"tk");
			System.out.println("\nThank you for shopping with us!");
			fileObject.writeInFile("\nThis is your receipt:\nName: Deviser.\nModel: 712.\nTotal Price: "+(7700*quantity)+"tk");
			System.out.println("\nA receipt has been printed also!\n");
		}
		}
		
		catch(Exception a)
		{
			System.out.println("Invalid input!");
			System.out.println("Please Try Again!\n");
		}
		}
		
	}
	
	
	public void axe()
	{
		System.out.println("\nYou have chosen Axe guitar.");
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
		System.out.println("\nPrice is: "+(5000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Axe.\nModel: 197.\nTotal Price: "+(5000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Axe.\nModel: 197.\nTotal Price: "+(5000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}}
		catch(Exception b)
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
		System.out.println("\nPrice is: "+(5000*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Axe.\nModel: 197.\nTotal Price: "+(5000*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("\nThis is your receipt:\nName: Axe.\nModel: 197.\nTotal Price: "+(5000*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
		}}
		catch(Exception c)
		{
			System.out.println("Invalid input!");
			System.out.println("Please Try Again!\n");
		}
		}
	}
	
	public void tanglewood()
	{
		System.out.println("\nYou have chosen Tanglewood guitar.");
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
		System.out.println("\nPrice is: "+(6500*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Tanglewood.\nModel: 001.\nTotal Price: "+(6500*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("This is your receipt:\nName: Tanglewood.\nModel: 001.\nTotal Price: "+(6500*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
	}
	}
	catch(Exception d)
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
		System.out.println("\nPrice is: "+(6500*quantity)+"tk");
		System.out.println("\nThis is your receipt:\nName: Tanglewood.\nModel: 001.\nTotal Price: "+(6500*quantity)+"tk");
		System.out.println("\nThank you for shopping with us!");
		fileObject.writeInFile("This is your receipt:\nName: Tanglewood.\nModel: 001.\nTotal Price: "+(6500*quantity)+"tk");
		System.out.println("\nA receipt has been printed also!\n");
	}
	}
	catch(Exception e)
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