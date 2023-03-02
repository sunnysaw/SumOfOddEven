/*
Question : Write a program to check whether the given two numbers are odd or even and add those number with each other.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber, SecondNumber,sum;
        System.out.println("Enter the first digit :");
        FirstNumber = sc.nextInt();
        System.out.println("Enter the second digit :");
        SecondNumber = sc.nextInt();
        System.out.println("Printing the result :");
        if (FirstNumber % 2 == 0){
            System.out.println("Number is even : " + FirstNumber);
        }else
            System.out.println("Number is odd : " + FirstNumber);
        if (SecondNumber % 3 == 0){
            System.out.println("Number is odd : " + SecondNumber);
        }else
            System.out.println("Number is even : " + SecondNumber);
        System.out.println("Printing the sum of odd and even :");
        System.out.println(sum = SecondNumber + FirstNumber);
    }
}