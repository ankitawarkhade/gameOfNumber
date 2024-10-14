// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class numberGame {
    
     public static void GAME(){
        byte num=56;
        byte limit =3;
        for(int i=0;i<=limit;i++){
          Scanner sc = new Scanner(System.in);
          System.out.println("guess the number within the range 1 to 100 : ");
          int gessNum = sc.nextInt();
  
                  if (num == gessNum) {
                      System.out.println("excellent !");
                      System.out.println("congratulation ! you get right");
                      break;
                  } else {
                      System.out.println("oops! you get wrong ");
                      System.out.println("Let's try again ");
                  
                  }  if(i==limit){
                      System.out.println("sorry! THE LIMIT ENDS");
                  }
        
          }
          return ;
     }   
     public static void main(String[] args) {
       
        GAME();
        
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<=5;){
            System.out.println("have you want to play again YES or NO : ");
            String nextTry=s1.nextLine();
      
            if(nextTry.equalsIgnoreCase("yes")){
              GAME();
      
            }else{
                System.out.println("OK! hope so you enjoyed it ...... ");
                break;
            }
        }
       
  
   }
}
