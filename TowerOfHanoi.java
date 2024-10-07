//CET 3640 Lab 12
//This program solves the Tower of Hanoi Puzzle.
package practice_3;

import java.util.Stack;

public class TowerOfHanoi {

    // Method to display the current state of the towers
    public static void displayTowers(Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {
        System.out.println("Tower A: " + A);
        System.out.println("Tower B: " + B);
        System.out.println("Tower C: " + C);
        System.out.println();
    }

    // Recursive method to solve the Towers of Hanoi puzzle
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {
        if (n == 1) {
            System.out.println("Move disk 1 from tower " + fromTower + " to tower " + toTower);
            moveDisk(fromTower, toTower, A, B, C);
            displayTowers(A, B, C);
            return;
        }
        // Move n-1 disks from fromTower to auxTower using toTower as auxiliary
        moveDisks(n - 1, fromTower, auxTower, toTower, A, B, C);
        // Move the nth disk from fromTower to toTower
        System.out.println("Move disk " + n + " from tower " + fromTower + " to tower " + toTower);
        moveDisk(fromTower, toTower, A, B, C);
        displayTowers(A, B, C);
        // Move the n-1 disks from auxTower to toTower using fromTower as auxiliary
        moveDisks(n - 1, auxTower, toTower, fromTower, A, B, C);
    }

    // Helper method to move a disk between towers
    public static void moveDisk(char fromTower, char toTower, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {
        Stack<Integer> from;
        Stack<Integer> to;

        if (fromTower == 'A') from = A;
        else if (fromTower == 'B') from = B;
        else from = C;

        if (toTower == 'A') to = A;
        else if (toTower == 'B') to = B;
        else to = C;

        to.push(from.pop());
    }

    public static void main(String[] args) {
        int numberOfDisks = 6;  // You can change the number of disks here

        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();

        // Initialize tower A with disks
        for (int i = numberOfDisks; i >= 1; i--) {
            A.push(i);
        }

        // Display initial state of towers
        displayTowers(A, B, C);

        // Start solving the puzzle
        moveDisks(numberOfDisks, 'A', 'C', 'B', A, B, C);
    }
}

