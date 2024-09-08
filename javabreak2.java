public class javabreak2{
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println("Element less than 3 are");

        for(int i=0;i<arr.length;i++){

            if(arr[i]==3)
            break;
            else
            System.out.println(arr[i]);
        }
    }
}