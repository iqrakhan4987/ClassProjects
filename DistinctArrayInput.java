//CET 3640 Lab 5
// User inputs 10 numbers such that 10<= num <=100
// No number is duplicated in the array
package practice_1;
import java.util.Scanner;

public class ArrayNums {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[10];
	        int count = 0;

	        System.out.println("Enter ten numbers between 10 and 100:");  //Ask user to input numbers 

	        while (count < 10) { //Get 10 numbers
	        	System.out.println("Enter num: ");
	            int num = scanner.nextInt(); // Getting number from console

	            if (num < 10 || num > 100) {  //Making sure the number: [10,100]
	                System.out.println("Please enter a number between 10 and 100.");
	                continue;
	            }

	            boolean same = false;
	            for (int i = 0; i < count; i++) {
	                if (numbers[i] == num) {  // Checking if the number is duplicated 
	                    same = true;
	                    break;
	                }
	            }

	            if (same) {
	                System.out.println(num + " has already been entered. Unique numbers so far:"); // 
	            } else {
	                numbers[count++] = num;
	                System.out.print("Unique numbers so far:");  //Displaying numbers 
	            }

	            for (int i = 0; i < count; i++) {
	                System.out.print(" " + numbers[i]); // printing all numbers
	            }

	            System.out.println();
	        }

	        scanner.close();
	    }

	}

