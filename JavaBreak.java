public class JavaBreak{
    public static void main(String args[]){
        int intArray[]=new int[]{1,2,3,4,5};
        System.out.println("Element less than 3 are:");
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==3)
            break;
            else
            System.out.println(intArray[i]);
        }
    }
}