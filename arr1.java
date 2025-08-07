import java.util.Scanner;
class arr1{
    public static void main(String args[]){
        /*String[] name = new String[3];
        name[0] = "John";
        name[1] = "Mala";
        
        System.out.print(name[1]);

        String[] playlist={"song1","song2","song3"};*/

        /*Scanner uin = new Scanner(System.in);
        int[] num=new int[3];
        int total=0;
        for(int i=0; i<3; i++){
            int a=uin.nextInt();
            num[i]=a;
            total=total+a;
        }
        double avg=total/3;
        System.out.print("Averaage: "+avg);*/

        for(int i=1; i<=3; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}