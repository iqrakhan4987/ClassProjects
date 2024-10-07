//Ticket.java

package practice_3;
public abstract class Ticket {
	 private int ticketNumber;

	 public Ticket(int ticketNumber) {
	     this.ticketNumber = ticketNumber;
	 }

	 public abstract double getPrice();

	 public String toString() {
	     return "Number: " + ticketNumber + ", Price: " + getPrice();
	 }
	}
//WalkupTicket.java2

package practice_3;

public class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }

    public double getPrice() {
        return 50.0;
    }
}
//AdvanceTicket.java

package practice_3;

public class AdvanceTicket extends Ticket {
 protected int days;

 public AdvanceTicket(int ticketNumber, int days) {
     super(ticketNumber);
     this.days = days;
 }

 public double getPrice() {
     if (days >= 10)
         return 30.0;
     else
         return 40.0;
 }
//StudentAdvanceTicket.java

package practice_3;

public class StudentAdvanceTicket extends AdvanceTicket {
 public StudentAdvanceTicket(int ticketNumber,  int days) {
     super(ticketNumber, days);
 }

 public double getPrice() {
     if (days >= 10)
         return 15.0;
     else
         return 20.0;
 }

 public String toString() {
     return super.toString() + " (ID required)";
 }
}

//Main class
//Implements the Ticket classes and sub classes
package practice_3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of walk-up tickets: ");
        int walkupTicketsCount = scanner.nextInt();
        for (int i = 1; i <= walkupTicketsCount; i++) {
            Ticket walkupTicket = new WalkupTicket(i);
            System.out.println("Walkup Ticket " + i + ": " + walkupTicket);
        }

        System.out.print("\nEnter the number of advance tickets: ");
        int advanceTicketsCount = scanner.nextInt();
        for (int i = 1; i <= advanceTicketsCount; i++) {
            System.out.print("Enter the number of days in advance for Ticket " + i + ": ");
            int days = scanner.nextInt();
            Ticket advanceTicket = new AdvanceTicket(i, days);
            System.out.println("Advance Ticket " + i + ": " + advanceTicket);
        }

        System.out.print("\nEnter the number of student advance tickets: ");
        int studentAdvanceTicketsCount = scanner.nextInt();
        for (int i = 1; i <= studentAdvanceTicketsCount; i++) {
            System.out.print("Enter the number of days in advance for Student Advance Ticket " + i + ": ");
            int days = scanner.nextInt();
            Ticket studentAdvanceTicket = new StudentAdvanceTicket(i, days);
            System.out.println("Student Advance Ticket " + i + ": " + studentAdvanceTicket);
        }

        scanner.close();
    }
}

