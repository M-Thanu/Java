import java.util.Scanner;
class for1{
    public static void main(String args[]){
        /*for(int i=1; i<=10; i=i+1){
            System.out.println(i);
        }*/
       
       /*Scanner uin = new Scanner(System.in);
       System.out.print("Enter A:");
       int a=uin.nextInt();
       System.out.print("Enter B:");
       int b=uin.nextInt();

       for(int i=a; i<=b; i=i+1){
        System.out.println(i);
       }*/

      /*for(int i=1; i<=10; i=i+1){
        if(i % 2 == 0){
            System.out.println(i);
        }
      }*/

     int count=0;
     for(int i=1; i<=10; i++){
        if(i % 2 != 0){
            count = count +1;
        }
     }
     System.out.print(count);
    }
}