/*Java continue example with label example.
This statement shows how to use java continue statement to skip the next iteration of the labelled loop.
*/

public class JavaContinueLabel{
    public static void main(String args[]){

        int intarray[][] = new int[][]{{1,2},{2,3}};

        Outer: 

        for(int i=0; i<intarray.length; i++){
        for(int j=0; j<intarray[i].length; j++)
        {
            if(intarray[i][j]==3)
            continue Outer;

        System.out.println("Element is: "+intarray[i][j]);
        }
        } 
    }
}