import java.util.Scanner;

class ex1{
    public static void main(String args[]){
        Scanner ain=new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name=ain.nextLine();
        System.out.print("Enter Department:");
        String Dep =ain.nextLine();
        System.out.print("Score for 100:");
        double score=ain.nextDouble();
        double fs=score/10;
        System.out.println("Name: "+Name);
        System.out.println("Department: "+Dep);
        System.out.println("Score for 10: "+fs);

    }
}