import java.util.Scanner;
class IfElse{
    public static void main(String[] args){
        int marksObtained, passingMarks;
        passingMarks=40;
        Scanner input = new Scanner(System.in);

        System.out.print("Input marks scored by you:");
        marksObtained = input.nextInt();

        if(marksObtained>=passingMarks){
            System.out.println("You passed the exam");
        }
        else{
            System.out.println("Unfortunately You failed");
        }
        }
    }
