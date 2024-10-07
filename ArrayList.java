// CET 3640 
//This class is used to create a phoneBook with names and phoneNumbers 
package practice_3;

public class PhoneBookEntry {
	private String name;
	private String phoneNumber;
	
	// Constructor
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    //Accessor methods 
    
    public String getName(){
    	return name;	
    }
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
	
    //Mutator Methods
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
    public void displayEntry() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
    
}

//This is an implementation of the PhoneBookEntry class.
package practice_3;

import java.util.ArrayList;

public class PhoneBookExample {

	public static void main(String[] args) {
		
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
		
		//Creating array list objects
		phoneBook.add(new PhoneBookEntry("Iqra Khan", "123-456-7890"));
		phoneBook.add(new PhoneBookEntry("Tom Holland", "987-654-3210"));
		phoneBook.add(new PhoneBookEntry("Robert Downy", "512-456-2568"));
		phoneBook.add(new PhoneBookEntry("Henry Cavil", "165-256-8965"));
		phoneBook.add(new PhoneBookEntry("Anne Hathaway", "656-156-1489"));
		
		// Displaying the contents of each PhoneBookEntry object using a loop
        System.out.println("Phone Book Entries:");
        System.out.println("-------------------");
        for (PhoneBookEntry entry : phoneBook) {
            entry.displayEntry();
            System.out.println("-------------------");
        }
	}

}
//This is an improved version of the program. The user inputs the name and phoneNumber for each array list object

package practice_3;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookExample {

    public static void main(String[] args) {

        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input names and phone numbers for each entry
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name for entry " + (i + 1) + ":");
            String name = scanner.nextLine();

            String phoneNumber;
            do {
                System.out.println("Enter phone number for entry " + (i + 1) + " (must be 10 digits):");
                phoneNumber = scanner.nextLine();

                if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
                    System.out.println("Invalid phone number! Please enter a 10-digit number.");
                }
            } while (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+"));

            phoneBook.add(new PhoneBookEntry(name, phoneNumber));
            System.out.println("-------------------");
        }

        // Displaying the contents of each PhoneBookEntry object using a loop
        System.out.println("Phone Book Entries:");
        System.out.println("-------------------");
        for (PhoneBookEntry entry : phoneBook) {
            entry.displayEntry();
            System.out.println("-------------------");
        }

        // Close the scanner
        scanner.close();
    }
}

