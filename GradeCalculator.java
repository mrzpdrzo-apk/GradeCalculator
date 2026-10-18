import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		String name;
	    double average;
		int grade1;
		int grade2;
		int grade3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter grade 1: ");
		grade1 = scanner.nextInt();
		
		System.out.print("Enter grade 2: ");
		grade2 = scanner.nextInt();
		
		System.out.print("Enter grade 3: ");
		grade3 =  scanner.nextInt();
		
		average = (grade1+ grade2 + grade3) / 3;
		
		
		System.out.println("\nName: " + name);
		System.out.println("Average : " + average);
		System.out.print("Status: ");
		
		if(average >= 75){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		
			}
}
