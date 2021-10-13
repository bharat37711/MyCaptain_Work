public class Employee {
	public static void main(String[] arg) {
		System.out.println("hello");
		String name[]=new String[3];
		int joinYear[]=new int[3];
		String address[]=new String[3];

		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<3;i++) {
			System.out.println("enter "+(i+1)+" employee name :");
			String name1=sc.nextLine();
			System.out.println("enter "+(i+1)+" employee joining year :");
			int joinYear1=sc.nextInt();
			System.out.println("enter "+(i+1)+" employee address :");
			String addres1=sc.nextLine();
			String address1=sc.nextLine();
			name[i]=name1;
			joinYear[i]=joinYear1;
			address[i]=address1;
			
		}
	EmpDet obj=	new EmpDet(name, joinYear, address);
	   obj.display();
		
	}
}

 class EmpDet{
	String name[]=new String[3];
	int joinYear[]=new int[3];
	String address[]=new String[3];


	EmpDet(String name[] ,int joinYear[],String address[]) {
		this.name=name;
		this.joinYear=joinYear;
		this.address=address;

		
	}
	@Override
	public String toString() {
		return "Employee [name=" + Arrays.toString(name) + ", joinYear=" + Arrays.toString(joinYear) + ", address="
				+ Arrays.toString(address) + "]";
	}
	public void display() {
		System.out.println("Name"+"     "+"Joining Year"+"     "+"Address");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"     "+joinYear[i]+"     "+address[i]);
		}
	}
}