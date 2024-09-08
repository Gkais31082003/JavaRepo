import java.util.Scanner;

class IfElse2{
    public static void main(String args[]){
        int a,b;
        b=40;

        Scanner c = new Scanner(System.in);
        System.out.println("Input marks scored by you: ");

        a=c.nextInt();

        if(a>=b){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}