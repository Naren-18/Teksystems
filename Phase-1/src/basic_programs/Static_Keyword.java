package basic_programs;

public class Static_Keyword {
	Static_Keyword() {
		System.out.println("From  Constructor");
		
	}
	{
		System.out.println("From  non Static Block");
		
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		Static_Keyword obj=new Static_Keyword();
	}
}
