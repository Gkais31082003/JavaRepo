//The following example uses break to terminate the labelled loop while searching two dimensional array.

public class javabreaklabel{
    public static void main(String args[]){
        int[][] intarray = new int[][]{{1,2,3,4,5},{10,20,40,50}};

        boolean binFound = false;
        System.out.println("Searching 30 in two dimentional integer array :");

        Outer: for(int intOuter=0; intOuter<intarray.length; intOuter++){

        Inner: for(int intInner=0; intInner<intarray[intOuter].length; intInner++){
            if(intarray[intOuter][intInner]==30)

            {
                binFound = true;
                break Outer;

            }
        }}
        if(binFound==true)

        System.out.println("30 found in the array");

        else

        System.out.println("30 not found in the array");
    }
}