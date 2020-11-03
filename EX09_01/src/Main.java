import java.util.Scanner;

public class Main {

		 static void coffeeMachine(int button) {
			System.out.println("1");
			System.out.println("2");
			switch(button) {
			case 1: 
				System.out.println("3 -normal");
			case 2: 
				System.out.println("3 -sugar");
			case 3: 
				System.out.println("3 -black");
			default:
				System.out.println("3-Anyone");
			}	
			System.out.println("\n\n\n\n\n\n\n");
			System.out.println("4");
			System.out.println("5");
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Which one? -1 for exit");
				Scanner s = new Scanner(System.in);
				int coffee;
				do {
					coffee = s.nextInt();
					coffeeMachine(coffee);
					System.out.println("Done!");
				} while(coffee != -1);
			}
	}


