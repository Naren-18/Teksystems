package Project;
import java.util.*;
public class calculator {
	public static int a=0,b=0;
	public static void main(String[] args) {
		System.out.println("Calculator");
		while(true) {
			Scanner op = new Scanner(System.in);
			System.out.println("1.  ADD\n2.  SUB\n3.  DIV\n4.  MODDIV\n5.  MUL\n6. Exit");
			System.out.println("Enter the requried calculation option:");
			int choice = op.nextInt();
			switch(choice) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				div();
				break;
			case 4:
				div();
				break;
			case 5:
				mul();
				break;
			case 6:
				System.exit(1);
			default:
				System.out.println("Enter valid Option");
			}
			}
		}
	private static void mul() {
		// TODO Auto-generated method stub
		
	}
	private static void div() {
		// TODO Auto-generated method stub
		
	}
	private static void sub() {
		// TODO Auto-generated method stub
		
	}
	private static void add() {
		// TODO Auto-generated method stub
		Scanner op = new Scanner(System.in);
		assign();
		int sum=a+b;
		while(true) {
			System.out.println("Do you want to add another element\n1.Yes 2.No");
			int ch=op.nextInt();
			if(ch==1) {
				System.out.println("Enter the number for addition");
				int c=op.nextInt();
				sum+=c;
			}
			else {
				break;
			}
			
		}
		System.out.println(sum);
	}
	
	
	private static void assign() {
		// TODO Auto-generated method stub
		Scanner op = new Scanner(System.in);
		a=op.nextInt();
		b=op.nextInt();
		
	}
	
}
