//write a programe that store five student marks in an array.ask the user to enter an index and display the marks
// requirements
//store five marks
//use try-catch while accessing the array.
//if the index is invalid display invalid index

package Indexoct22;

import java.util.Scanner;

public class Indexoct22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {50, 70, 85, 95, 35};

        try {
            System.out.println("Enter the index to display marks :");
            int ind = sc.nextInt();

            System.out.println("Marks at this index are -> " + arr[ind]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter an index between ");
        }
        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
