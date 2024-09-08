import java.util.Scanner;
class AddNumber{
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Enter two integer to calculate their sum:");
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=x+y;
        System.out.println("Sum of Entered Number is="+z);
    }
}