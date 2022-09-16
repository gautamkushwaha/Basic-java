import java.util.Scanner;


public class EntYouNum {
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = 0;
    do{
      System.out.println("input a number:");
      number = sc.nextInt();
      System.out.println("Here is your number: "+number);
      // System.out.println(number);
    }while(number>=0);
    
  }
  
}
