//  Program on GSt and Pst regarding the customer details and more related things
public class SelfServe {

	public static void main(String[] args) 
	{
	   // This calls the scanner (to take the input from the user u must required it )
		Scanner input = new Scanner (System.in);
		// This displays the title for the house depot
		
		
				String UserName= "";
		System.out.println("+----------------------------------------------------------------------------------+");
		System.out.println("||||||||||||||||||||||	 House Depot Self-Serve Checkout	 ||||||||||||||||||||||");
		System.out.println("+----------------------------------------------------------------------------------+");
	
		//Asks user for their name
				System.out.println("Hi. Welcome to the checkout. What is your name? ");
		UserName = input.nextLine();
		
		
		System.out.println("OK, " + UserName + " , enter the price of each of your purchases in rupees and paisa and then hit the ENTER key. For example, if your item costs Rs5.99, you would enter 5.99.");
		
		System.out.println("If you make a mistake when you enter a price, just enter a zero for the next entry and the last price you entered will be subtracted from your running total. ");
		
		System.out.println("When you have entered all of your prices, enter a -1 to indicate that you have finished your entries.");
		
		System.out.println("I will then calculate the total of your purchases and the amount of GST  that you owe, and then tell you what the sub-total of your purchases  is, the GST you owe, and then the grand total that you owe.");
		
	
	    System.out.println(" Just Enter the realted things rehgarding tagt roduct of the technology");
		double Total=0;
		double Price=0;
		int Counter =0;
		double Subtract=Price;
		while (Price !=-1 )
		{
			System.out.print("Enter a price for item # "+(Counter+1));
			Price = input.nextDouble();
			Counter++;
			if (Price==0)
			{

				iCounter--;
				Total=Total-Subtract;
				
			System.out.println("Removing "+ Subtract+ " from your total. Your total is "+ Total);
			}
			else
			{
				Total=Total+Price;
				Subtract=Price;

				System.out.println("That was "+ Price+ " Your total is" +Total);
			}
		}
	}
	
}
