//CET 3640 
// Eight Queens are placed on a board such that no queen can take over the other. 
package practice_3;
public class EightQueens {

    private static final int BOARD_SIZE = 7; // Size of the chessboard
    private static int[] queens = new int[BOARD_SIZE]; // Array to store queen positions
    private static int solutions = 0; // Counter for total solutions found

    public static void main(String[] args) {
        solve(0); // Start solving from the first column
        System.out.println("Total solutions: " + solutions); // Print total solutions found
    }

    // Recursive method to solve the Eight Queens problem
    private static void solve(int col) {
        if (col == BOARD_SIZE) { // Base case: all queens are placed
            printSolution(); // Print the solution
            solutions++; // Increment solution counter
            return; // Backtrack
        }

        // Try placing a queen in each row of the current column
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) { // Check if it's safe to place a queen at this position
                queens[col] = row; // Place the queen at this position
                solve(col + 1); // Move to the next column recursively
            }
        }
    }

    // Method to check if it's safe to place a queen at a given position
    private static boolean isSafe(int row, int col) {
        // Check all previously placed queens
        for (int i = 0; i < col; i++) {
            // Check if the current queen can attack any previously placed queens
            if (queens[i] == row || Math.abs(queens[i] - row) == Math.abs(i - col)) {
                return false; // If it can attack, return false
            }
        }
        return true; // If it's safe, return true
    }

    // Method to print the current solution
    private static void printSolution() {
        System.out.println("Solution " + solutions + ":");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (queens[i] == j) {
                    System.out.print(" Q "); // Print 'Q' if there is a queen at this position
                } else {
                    System.out.print(" - "); // Print '-' if there is no queen at this position
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

