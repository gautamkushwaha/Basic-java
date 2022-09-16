
import java.util.Arrays; //this is imported for the Arrays sorting function used below
import java.util.Scanner; //this is imported for the Scanner class function used below

import javax.swing.SpinnerDateModel;

import java.util.*; //this is imported for the Scannnere sc = new Scanner(System.in)  boolean isSunUp = sc.nextBoolean();

public class hello {
  /**
   * @param args
   */
  public static void main(String args[]){
    
// //first program
//     System.out.println("hello");
//     System.out.println("how are you");

//     // variables

//   String name = " Gautam";
//   int age = 20;
//   String neighbour = "Bhavesh";
//   String friend  = neighbour;
//   System.out.println("my name is" + name +". i am "+ age +" years old. My friends name is " + friend+".");*/

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
// byte age1= 30;
// int phone = 1234567890;
// long phone2=12345678900L;
// float pi = 3.14F;
// char letter = '@';
// boolean isAdult = false;

// /*primitive data types*/

// String name0 = "gautam";
// System.out.println(name.length());
// String friend0 = new String("subodh");
// System.out.println(friend);


// // strings
// // concatenates*/
// String name1 = "Gautam";
// String name2 = "Harry";
// String name3 = name1 + " and " + name2;
// System.out.println(name3);

// // charAt
// String name4 = "Harry";
// System.out.println(name.charAt(3));
// System.out.println(name.length());

// // replace
//  String name5 = name.replace('a','b');
//  System.out.println(name5);
//  System.out.println(name);

// //  substring (note: strings are immutable in java i.e. we can't mutate the same string again. we have to create another string for its ?operation)
// String name6 = "Aman and Akku";
// System.out.println(name3.substring(5,9));

// // array
// int age8 = 30;
// int physics = 97;
// int chem= 98;
// int eng = 95;

// int[] marks = new int[4];
// marks[0] = 97;
// marks[1] = 98;
// marks[2] = 95;
// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);
// System.out.println(marks[3]);

// // if the array is not initialized and we ask the system to  print the value at the location, it returs 0/null/false
//   boolean[] marks1 = new boolean[3];
//   marks[0]= 97;
//   marks[1] = 98;
//   marks[2] = 95;
//   System.out.println(marks[2]);
// //  this is not returning false in the output as intger array is called for the boolean type. however it is showing error only. so be careful with this.

// // // array
//  int age9 = 30;
// int physics1 = 97;
// int chem2= 98;
// int eng3 = 95;

// int[] marks2 = new int[3];
// marks[0] = 97;
// marks[1] = 98;
// marks[2] = 95;

// // // length

// System.out.println(marks.length);

// System.out.println(marks[0]);
// // array sort
// Arrays.sort(marks);

// for(int i=0;i<3;i++){
// System.out.println(marks[i]);
// }

// int[] marks3 = {97,98,95};

// // two dimensional arrays
// int[][] finalMarks = {{97,98,95},{95,95,98}};

// System.out.println(finalMarks[0][0]);
// System.out.println(finalMarks[1][1]);

// // casting

//  double price = 100.00;   //implicit cating
// double finalprice = price + 18;
//  System.out.println(finalprice);

// int p = 100;
// int fp = p + (int)18.1;  //explicit casting
// System.out.println(fp);
 

// // here in casting : there is chance of loosing data when the data type havaing hing memorey space is converted to the data type having low memorey space as we are converting here: 1. if we are converting int to double, it will not loose any data(implicit casting)  2. however it is not the same while we are converting  double to integer because double takes 8 byte and integer takes only 4/2 bytes


// // constants
 
// int age = 30;
// age = 31;

// // float PI = 3.14F;
// // PI = 1.1F;
// final float PI = 3.14F;

// operators (Arithmatic operators , assingment operators , logical operators, comparison operators)

// 1. arithmatic operator(sum, diff, mul, div, modul0)
int a = 5;
int b = 3;
int sum = a+b;
int diff = a-b;
int mul = a *b;
double c = 5;
double d= 3;
double div = c/d;
double modu = c%d;
System.out.println(sum);
System.out.println(diff);
System.out.println(mul);
System.out.println(div);
System.out.println(modu);


//2.ASSIGNEMENT OPERATORS(=,)



// unary operators

// increase

int num = 1;
num = num +1;
System.out.println(num);

int numb = 2;
System.out.println(numb);
numb++;
System.out.println(numb);
++numb;
System.out.println(numb);

// decreases

int num1 = 1;
System.out.println(num1--);//1
System.out.println(num1);  //0

// math function in java

// maths
// 5,6
System.out.println(Math.min(5,6));
System.out.println(Math.max(5,6));
System.out.println((int)(Math.random()*100));


// how to take INPUT?


Scanner sc= new Scanner(System.in);

// cancatenation of input and cancatenation of output


System.out.println("enter your name , age, salary respectively");
String name7 = sc.next();
int age5 = sc.nextInt();
float salary = sc.nextFloat();

System.out.println("my name is "+ name7+". i am "+ age5 +" years old. i earns Rs. "+ salary +" per month");


// // you can take the input and print the output separately as well as shown below
System.out.println("enter your goal");
String goal = sc.nextLine();
System.out.println(goal);

// out:

System.out.println("input your salary");
System.out.println(salary);
System.out.println("enter your name");
System.out.println(name7);


// to get the input of a line
System.out.println("Give your introduction");
String intro = sc.nextLine();
System.out.println(intro);


// comparison operator
// a==b (if equals then return true, else return false)
// a!=b (if not equals then returns true, else return false)
// a>b
// a<b
// a<=b
// a>=b

//conditional statements

boolean isSunUp = true;
if(isSunUp==true)
  System.out.println("day");
  else
  System.out.println("night");

  int age6 = 30;
  if(age6>18)
  System.out.println("can vote");
  else
  System.out.println("can't vote");

// Scanner sc= new Scanner(System.in);
System.out.println("enter either isSunUp in: true or false");
boolean isSunUp1 = sc.nextBoolean();//true or false

if(isSunUp == true)
    System.out.println("It is day");
else
    System.out.println("it is night");
  
System.out.println("enter your age");
int age7 = sc.nextInt();
if (age7>18) {
 System.out.println("you can vote");
}
else{
  System.out.println("you can't vote");
}

sc.close();


//LOGICAL OPERATORES

int a1 = 60;
int b1 = 40;

if (a1<50 && b1<50) {
  System.out.println("both are less than 50");
  
}
if(a1<50 || b1<50){
  System.out.println("either of a1 or b1 is less than 50");
}


boolean isAdult = true;
if(isAdult == true){
  System.out.println("is adult");
}
else{
  System.out.println("is not");
}

boolean isAdult1 = false;
if(!isAdult1){
  System.out.println("isAdult");
}
else{
  System.out.println("not Adult");
}

// if else 


Scanner sc1 = new Scanner(System.in);
//pen = 10; notebook = 40
System.out.println("enter the cash you have");
int cash = sc1.nextInt();
if(cash<10){
  System.out.println("cannot buy anything");
  System.out.println("bring more money");
}
else{
  if(cash>=10 && cash <50 ){
       System.out.println("can buy a pen but not a notebook ");
    }
  else if( cash>=50 && cash<60){
        System.out.println("can buy either a pen or notebook but not both");
    }
  else{
  System.out.println("can buy both book and notebook");
  }

Scanner sc2 = new Scanner(System.in);
System.out.println("Enter your age");
int age = sc2.nextInt();
if(age<9){
  System.out.println("you are child");
}
else if(age>=9 && age <13){
  System.out.println("congrats, you can get a small bicycle");
}
else if(age>=13 && age<18){
  System.out.println("you can get a bicycle");
}
else{
  System.out.println("you can ride a bike");
}


SWITCH CONDITIONAL OPERATORS

Scanner sc = new Scanner(System.in);
int choice;
do{
 System.out.println("1.sun\n2.mon\n3.tue\n4.wed\n5.thu\n6.fri\n7.sat\n");

System.out.println("\nenter your choice");
 choice = sc.nextInt();




switch(choice){
case 1: System.out.println("it is sunday");
break;
case 2: System.out.println("it is monday");
break;
case 3: System.out.println("it is tuesday");
break;
case 4: System.out.println("it is wednesday");
break;
case 5: System.out.println("Thursday");
break;
case 6: System.out.println("friday");
break;
case 7: System.out.println("saturday");
break;

default:
System.out.println("any of the seven day(sun,.....sat");
}
}while(choice<=8);


LOOPS

System.out.println("1");
System.out.println("2");
System.out.println("3");
System.out.println("4");

for printing 1 -100

increment form

for (int i=0; i<100;i++) {
  System.out.println(i);
   

drecememt form
for(int i=100;i>0;i--)
{
  System.out.println(i);
}

while

decrement
int i = 100;
while(i>=1){
  System.out.println(i);
  i=i-2;
}


increment
int j = 0;
while(j<=100)
{
  System.out.println(j);
  j++;
}


do while

decrement
int k = 100;
do{
  System.out.println(k);
k--;
}while(k>=1);

increment

int k=0;
do{
  System.out.println(k);
  k++;
}while(k<100);



BREAK AND CONTINUE  (any loop runs infinite times if we give true for its condition)

int i =0;
while(true)
{
  if(i==3){                  //CONTINUE: give the condition, use the increment and then continue syntax
    i = extracted(i);
    continue;
    
  }
  System.out.println(i);
  i = extracted(i);
  if(i>5)
{ 
  break;
// }
}

  }

  private static int extracted(int i) {    //this is self created by vs studio code for extracted i as i is used twice, 
    i=i+1;                                 //this is very similar to funcion,here is class that we use
    return i;



EXCEPTION HANDLING : TRY -CATCH IN EXCEPTION HANDLING

int[] marks = {97,98,95};

try{
System.out.println(marks[5]);
} catch(Exception exception){
//do something after catching

}
System.out.println("the name of student is Aman");


METHODS

public static void printJava(){
  System.out.println("hello java");
printjava();
printjava();
printjava();
System.out.println("hello java");
System.out.println("hello java");
System.out.println("hello java");


  }

  }
}

}
  }
}
