import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class guessNumber {

  /**
   * @param args
   */
  public static void main(String[] args){

    int myNumber = (int)(Math.random()*100);
    Scanner sc = new Scanner(System.in);
     int userNumber;
     System.out.println(myNumber);
    do{
    System.out.println("Guess a number between one and hundred");
     userNumber = sc.nextInt();
    if(userNumber==myNumber){
      System.out.println("wooh,You have guessed the correct number");
      break;
    }
    else if(userNumber>myNumber){
      System.out.println("Your number is larger than generated number");
    }
    else{
      System.out.println("your number is smaller than generated number");
    }
    }while(userNumber>=0);
    
    System.out.println(myNumber);
    



  }
  
  
}
