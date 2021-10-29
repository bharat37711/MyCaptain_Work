import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter 1st number of Fibonacci Series");
       int num1=sc.nextInt();
       System.out.println("enter 2ed number of fibonacci Series");
       int num2=sc.nextInt();
       System.out.println("enter total numbers you want in the series");
       int totalNo=sc.nextInt();
       
    	   calcualteSum(num1,num2,totalNo);
      
	}

	private static void calcualteSum(int num1, int num2,int totalNo) {
		// TODO Auto-generated method stub
		int temp;
		int n1=num1;
		int n2=num2;
		for(int i=0;i<totalNo;i++) {
	    	  temp=n1+n2;
	    	  System.out.println(temp);
	    	  n1=n2;
	    	  n2=temp;
	    	  
	       }
	
		
	}
}