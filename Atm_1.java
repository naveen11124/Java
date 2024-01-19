package A_demo;
import java.util.Scanner;
public class Atm_1 
{
	
	
	
public static void main(String[] args) 
{
	double f=20000.0;
	int a=1234; // ATM Password
	int temp=a;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1 for Change ATM Pin");
	System.out.println("Enter 2 for Savings Account");
	System.out.println("Enter 3 for Balance enquiry");
	System.out.println("Enter 4 for Current Account");
	int i=scan.nextInt();
	switch (i)
	{
	case 1:System.out.println("Change ATM Pin");
	   
	       System.out.println("Enter Your ATM Pin");
	       int b=scan.nextInt();
	       if(b==temp)
	       {
	    	System.out.println("Correct password");
	    	
	    	System.out.println("Enter your new password");
	    	int d=scan.nextInt();
	    	System.out.println("Your password changed successfully");
	    	
	       }
	       else 
	       {
	    	System.out.println("Wrong password"); 
	       }
	
	break;

	case 2:System.out.println("Savings Account");
	
	       System.out.println("Enter Your ATM PIN");
	       int k=scan.nextInt();
	       if(k==a)
	       {
	    	   System.out.println("Enter Withdraw Amount");
	    	   double n=scan.nextDouble();
	    	   if(n>10000)
	    	   {
	    		System.out.println("Enter a Valid Withdraw Amount"); 
	    		
	    	   }
	    	   else if(n<=10000)
	    	   {
	    		   double y=f-n;
	    		   System.out.println(y);
	    		   System.out.println("Withdraw successfull");
	    	   }
	    	  
	    	   
	       }
	       else
	       {
	    	   System.out.println("Enter Correct PIN");
	       }
	     break;
	
	case 3:System.out.println("Balance enquiry");
	System.out.println("Enter your PIN");
	int g=scan.nextInt();
	if(g==a)
	{
		System.out.println("Enter 1 for Savings Account");
		System.out.println("Enter 2 for Current Account");
		int q=scan.nextInt();
		switch (q) 
		{
		case 1:System.out.println("Savings Account");
		System.out.println(f);
			break;

		case 2:System.out.println("Current Account");
		System.out.println(f);
		default:
			break;
		}
		
		
	}
	else
	{
		System.out.println("Enter a valid PIN");
	}
	
	
	break;
	
	case 4:System.out.println("Current Account");
	System.out.println("Enter your PIN");
	int m=scan.nextInt();
	if(m==a)
	{
		System.out.println("Enter a withdraw amount");
		double o=scan.nextDouble();
		if(o>0)
		{
			System.out.println("Withdraw successfull");
		}
		
	}
    default:System.out.println("Enter a valid Input");
	break;
	}
	
	
}
}
