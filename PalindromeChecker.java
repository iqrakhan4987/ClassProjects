package data_structures;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove all non-alphabetic characters and convert to lowercase
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Initialize a stack and a queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Fill the stack and queue with characters from the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        // Compare characters from the stack and queue to check for palindrome
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }

        // If both stack and queue are empty, the input string is a palindrome
        return stack.isEmpty() && queue.isEmpty();
    }

    public static void main(String[] args) {
        // Path to the input file
        String filePath = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Check if the line is terminated with '.'
                if (line.charAt(line.length() - 1) != '.') {
                    System.out.println("Line does not end with '.', skipping: " + line);
                    continue;
                }

                // Remove the '.' from the line
                line = line.substring(0, line.length() - 1);

                // Check if the line is a palindrome and print the result
                if (isPalindrome(line)) {
                    System.out.println("Input string: " + line);
                    System.out.println("Yes, it's a palindrome.");
                } else {
                    System.out.println("Input string: " + line);
                    System.out.println("No, it's not a palindrome.");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
        }
    }
}
