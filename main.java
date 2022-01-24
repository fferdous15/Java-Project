import java.util.Scanner;
class main
{
	
	public static void main(String args[])
	{
		System.out.println("\nWelcome to our Instrument shop!\n");
		System.out.println("Please select the product you want to buy.\n");
		System.out.println("Press 1 for Guitar. Press 2 Violin. Press 3 for Harmonium. Press 4 for Piano. Press 0 if you don't want to buy!");
		
		try{
		
		Scanner p = new Scanner(System.in);
		int press = p.nextInt();
		
	switch(press){
		case 1:
		System.out.println("\nAcoustic Guitar or Electric Guitar?\nPress 1 for Acoustic. Press 2 for Electric.");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
	
	switch(type){
		case 1 :
		guitar g = new acoustic();
		g.Acoustic();
		Scanner s = new Scanner(System.in);
	    int choice = s.nextInt();
		switch(choice){
			case 1 :
			g.deviser();
			break;
			case 2 :
			g.axe();
			break;
			case 3 :
			g.tanglewood();
			break;
			default :
		System.out.println("Invalid choice");
		}
		break;
		
		case 2 :
		g = new electric();
		g.Eletric();
		System.out.println("Enter your choice:\n");
		Scanner c = new Scanner(System.in);
	    int Choice = c.nextInt();
		switch(Choice){
			case 1 :
			g.Yamaha();
			break;
			case 2 :
			g.Gibson();
			break;
			case 3 :
			g.Fender();
			break;
			default :
		System.out.println("Invalid choice");
		}
	}
		break;
		
		case 2: 
		instruments i = new violin();
		i.Violin();
		break;
		
		case 3:
		
		i = new harmonium();
		i.Harmonium();
		break;
		
		case 4:
		i = new piano();
		i.Piano();
		break;
		
		case 0:
		System.out.println("\nSee you next time!\n");
		break;
		
		default :
		System.out.println("\nInvalid option!");
		} 
		
		}
		
		catch(Exception e)
		{
			System.out.println("\nPlease choice properly!");
		}

	}
}