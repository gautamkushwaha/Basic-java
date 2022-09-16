
    
import java.util.Arrays; //this is imported for the Arrays sorting function used below
import java.util.Scanner; //this is imported for the Scanner class function used below

import javax.swing.SpinnerDateModel;

import java.util.*;  //this is imported for the Scannnere sc = new Scanner(System.in)  boolean isSunUp = sc.nextBoolean();
public class tempCodeRunnerFile  {
  /**
   * @param args
   */
  public static void main(String args[]){
    
//first program
    System.out.println("hello");
    System.out.println("how are you");

    // variables

  String name = " Gautam";
  int age = 20;
  String neighbour = "Bhavesh";
  String friend  = neighbour;
  System.out.println("my name is" + name +". i am "+ age +" years old. My friends name is " + friend+".");

/*primitive type of data
byte - 1[-128  to 127]
short - 2
int - 4
long - 8 
float - 4
double - 8 
char - 2  a,b,c
boolen - 1 true/false

note: these data types have a range and we can't store the value greater than or less than that range. we need to take consideration of the range of the data type we are using.
*/
/*  Example of primitive data type*/
byte agea= 30;
int phone = 1234567890;
long phone2=12345678900L;
float pi = 3.14F;
char letter = '@';
boolean isAdult = false;

/*primitive data types*/

String name0 = "gautam";
System.out.println(name0.length());
String friend0 = new String("subodh");
System.out.println(friend0);


// strings
// concatenates*/
String name1 = "Gautam";
String name2 = "Harry";
String name3 = name1 + " and " + name2;
System.out.println(name3);

// charAt
String name4 = "Harry";
System.out.println(name4.charAt(3));
System.out.println(name.length());

// replace
 String name5 = name.replace('a','b');
 System.out.println(name5);
 System.out.println(name);

//  substring (note: strings are immutable in java i.e. we can't mutate the same string again. we have to create another string for its ?operation)
String name6 = "Aman and Akku";
System.out.println(name6.substring(5,9));

// array
int age8 = 30;
int physics = 97;
int chem= 98;
int eng = 95;

int[] marks = new int[4];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);

// if the array is not initialized and we ask the system to  print the value at the location, it returs 0/null/false
  boolean[] marks1 = new boolean[3];
  marks[0]= 97;
  marks[1] = 98;
  marks[2] = 95;
  System.out.println(marks1[2]);
//  this is not returning false in the output as intger array is called for the boolean type. however it is showing error only. so be careful with this.

// // array
 int age9 = 30;
int physics1 = 97;
int chem2= 98;
int eng3 = 95;

int[] marks2 = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;

// // length

System.out.println(marks2.length);

System.out.println(marks[0]);
// array sort
Arrays.sort(marks2);

for(int i=0;i<3;i++){
System.out.println(marks2[i]);
}

int[] marks3 = {97,98,95};

// two dimensional arrays
int[][] finalMarks = {{97,98,95},{95,95,98}};

System.out.println(finalMarks[0][0]);
System.out.println(finalMarks[1][1]);
  }
}
