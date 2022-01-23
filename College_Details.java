package sample;

public class College_Details {
	int roll_no;
	String s;
	static String College_Name="Vellamal";
	void method(int rno,String s1)
	{
	roll_no=rno;
	s=s1;
	
	}
	void m()
	{
	System.out.println("Roll No is" +roll_no);
	System.out.println("Name is " +s);
	}
	static void display()
	{
		
	System.out.println("Clg name is"+College_Name);
	}


	public static void main(String[] args) {
		College_Details cd= new College_Details();
		cd.method(101, "Abi");
		cd.m();
		display();
				
		

	}

}
