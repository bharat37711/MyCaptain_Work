import java.util.Scanner;

public class PrimeNo {

	public static Boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
			
			}
	
			return true;
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your number");
      int num=sc.nextInt();
    boolean check= isPrime(num); 
    if(check==true) {
    	System.out.println(num+" is prime");
    }
    else {
    	System.out.println(num+ " is not prime ");
    }
	}

}