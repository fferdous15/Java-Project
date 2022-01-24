import FileReadWrite.*;
import java.util.Scanner;
public class violin implements  instruments
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
	
	public void Violin()
	{
		
		System.out.println("\nWe have original Mendini Violin listed below.");
		System.out.println("\nName: Mendini.\nModel: MV200.\nPrice: 40000tk.");
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
		if(quantity==0 || quantity>10)
		{
			System.out.println("Invalid quantity or out of stock!\nYou can order maximum 10 quantities at a time.\n");
		}
		else
		{
			System.out.println("\nPrice is: "+(40000*quantity)+"tk");
		    System.out.println("\nThis is your receipt:\nName: Mendini.\nModel: MV200.\nTotal Price: "+(40000*quantity)+"tk.");
			System.out.println("\nThank you for shopping with us!");
			fileObject.writeInFile("\nThis is your receipt:\nName: Mendini.\nModel: MV200.\nTotal Price: "+(40000*quantity)+"tk.");
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
	public void Piano(){}
	public void Harmonium(){}
}