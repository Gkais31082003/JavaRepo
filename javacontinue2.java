//Java continue statement example. This example show how to use java continue statement to skip the iteration of the loop

public class javacontinue2{
    public static void main(String args[]){

        int intarray[] = new int[]{1,2,3,4,5};

        System.out.println("All numbers except 3 are: ");

        for(int i=0; i<intarray.length; i++){
            if(intarray[i]==3)
            continue;
            else
            System.out.println(intarray[i]);
        }
    }
} 