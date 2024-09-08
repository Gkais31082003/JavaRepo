import java.util.Scanner;

class AdditionScanner{
    public static void main(String args[]){
        int a,b,c;
        System.out.println("enter two integers: ");
        Scanner in = new Scanner(System.in);

        a=in.nextInt();
        b=in.nextInt();
        c=a+b;

        System.out.println("Sum of Entered Number is:"+c);

    }
}