// This lab sorts data based on certain parameters like last name, grade percentage and student ID 
package practice_3;
import java.util.*;

//Class to represent student data
class Student {
 String lastName;
 String firstName;
 int studentId;
 double gradePercentage;
 char letterGrade;

 // Constructor to initialize student data
 public Student(String lastName, String firstName, int studentId, double gradePercentage, char letterGrade) {
     this.lastName = lastName;
     this.firstName = firstName;
     this.studentId = studentId;
     this.gradePercentage = gradePercentage;
     this.letterGrade = letterGrade;
 }

 // Override toString() method to print student data
 public String toString() {
     return lastName + "\t" + firstName + "\t" + studentId + "\t" + gradePercentage + "\t" + letterGrade;
 }
}

//Comparator class to sort students by last name
class SortByLastName implements Comparator<Student> {
 // Compare method to compare students by last name
 public int compare(Student a, Student b) {
     return a.lastName.compareTo(b.lastName);
 }
}

//Comparator class to sort students by student ID
class SortByStudentId implements Comparator<Student> {
 // Compare method to compare students by student ID
 public int compare(Student a, Student b) {
     return Integer.compare(a.studentId, b.studentId);
 }
}

//Comparator class to sort students by grade percentage
class SortByGradePercentage implements Comparator<Student> {
 // Compare method to compare students by grade percentage
 public int compare(Student a, Student b) {
     return Double.compare(a.gradePercentage, b.gradePercentage);
 }
}


//Main function
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
 public static void main(String[] args) {
     // Create a list of students
     List<Student> students = new ArrayList<>();
     students.add(new Student("Smith", "Kelly", 438975, 98.6, 'A'));
     students.add(new Student("Johnson", "Gus", 210498, 72.4, 'C'));
     students.add(new Student("Reges", "Stu", 98736, 88.2, 'B'));
     students.add(new Student("Smith", "Marty", 346282, 84.1, 'B'));
     students.add(new Student("Reges", "Abe", 298575, 78.3, 'C'));

     // Sort by last name
     Collections.sort(students, new SortByLastName());
     System.out.println("Student data, by last name:");
     printStudents(students);

     // Sort by student ID
     Collections.sort(students, new SortByStudentId());
     System.out.println("\nStudent data, by student ID:");
     printStudents(students);

     // Sort by grade percentage
     Collections.sort(students, new SortByGradePercentage());
     System.out.println("\nStudent data, by grade percentage:");
     printStudents(students);
 }

 // Method to print list of students
 public static void printStudents(List<Student> students) {
     for (Student student : students) {
         System.out.println(student);
     }
 }
}
