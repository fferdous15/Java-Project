import FileReadWrite.*;
import java.util.Scanner;
public class piano implements instruments
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

	public void Piano()
	{
		
		
		
		
		System.out.println("\nWe have original Yamaha Grand Piano listed below.");
		System.out.println("\nName: Yamaha Grand Piano.\nModel: GB1K.\nPrice: 75000tk");
		System.out.println("Condition: "+Condition);
		System.out.println("Country: "+country);

		System.out.println("\nPress 1 to buy. Press 2 if you don't want to buy");
		
		Scanner s = new Scanner(System.in);
		int decision = s.nextInt();
		switch(decision){
		case 1 :
		System.out.println("\nEnter your quantity:");
		try{
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextInt();
		sc.close();
		if(quantity==0 || stock>10)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else
		{
			System.out.println("\nPrice is: "+(75000*quantity)+"tk");
		    System.out.println("\nThis is your receipt:\nName: Yamaha Grand Piano.\nModel: GB1K.\nTotal Price: "+(75000*quantity)+"tk");
			System.out.println("\nThank you for shopping with us!");
			fileObject.writeInFile("\nThis is your reciept:\nName: Yamaha Grand Piano.\nModel: GB1K.\nTotal Price: "+(75000*quantity)+"tk");
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
	
	public void Harmonium(){}
	public void Violin(){}
}