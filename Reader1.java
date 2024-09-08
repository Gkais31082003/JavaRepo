import java.util.Scanner;

public class Reader1{
    public static void main(String args[]){
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number=reader.nextInt();
        System.out.println("You Entered:"+number);
    }
}