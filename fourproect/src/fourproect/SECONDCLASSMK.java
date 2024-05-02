package fourproect;

import java.util.Scanner;

public class SECONDCLASSMK {

	public static void main(String[] args) {
		Scanner prt = new Scanner(System.in);
		System.out.println("what is your name");
		
		String name = prt.nextLine();
		System.out.println("what is yiur age");
		int age = prt.nextInt();
		prt.nextLine();
		System.out.println("what is your favourite food");
		String food =prt.nextLine();
		
		
		
		System.out.println("hello" + " " + name);
		System.out.println("ur age is " + age);
		System.out.println("ur favourite food is " + food);
		
		

	}

}
