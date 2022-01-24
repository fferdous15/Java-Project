import FileReadWrite.*;
import java.util.Scanner;
public class harmonium implements instruments
{
	FileReadWriteDemo fileObject = new FileReadWriteDemo() ;
	
	
	private int quantity;
		
	public void setQuantity(int quantity)
	{
	this.quantity = quantity;
	}
	
	public int getQuantity()
	{
	return quantity;
	}

	public void Harmonium()
	{
		
		
		System.out.println("\nWe have brand new Bina Harmonium listed below.");
		System.out.println("\nName: Bina Harmonium.\nModel: Bina.\nPrice: 35000tk.");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);
		System.out.println("\nPress 1 to buy. Press 2 if you don't want to buy.");
		
		Scanner s = new Scanner(System.in);
		int decision = s.nextInt();
		switch(decision){
		case 1 :
		System.out.println("\nEnter your quantity:");
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
			System.out.println("\nPrice is: "+(35000*quantity)+"tk");
		    System.out.println("\nThis is your receipt:\nName: Bina Harmonium.\nModel: Bina.\nTotal Price: "+(35000*quantity)+"tk");
			System.out.println("\nThank you for shopping with us!");
			fileObject.writeInFile("\nThis is your receipt:\nName: Bina Harmonium.\nModel: Bina.\nTotal Price: "+(35000*quantity)+"tk");
			System.out.println("\nA receipt has been printed also!\n");
		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid input!");
		}
		break;
		case 2 :
		System.out.println("Choose another instrument.");
		break;
		default :
		System.out.println("Invalid keyword!");
		}
			
	}
	public void Violin(){}
	public void Piano(){}
}