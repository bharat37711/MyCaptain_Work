public class ArrayPr {
	

	public static void addMatrix(int a[][], int b[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int sum=a[i][j]+b[i][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
		

		public static void productMatrix(int a[][], int b[][]) {
		int	result[][]=new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				   for(int k=0;k<3;k++) {
					result[i][j]=result[i][j]+a[i][k]*b[k][j];
					
					}
				   System.out.print(result[i][j]+" ");
				}
				
				System.out.println();
			}
			
		
	}
		public static void show( int a[][],int b[][])
		{
			System.out.println("matrix a");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("matrix b");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args)  {
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]=	{{1,3,4},{2,4,3},{1,2,4}};
		show(a,b);
		System.out.println("sum of matrix a and b :");
	  addMatrix(a,b);
	  System.out.println("=================");
	  System.out.println("product of matrix a and b:");
	 productMatrix(a,b);

	       }


}
