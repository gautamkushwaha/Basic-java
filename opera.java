import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class opera{

  /**
   * 
   */
  public static void main(String agrs[]){

 /*operators 
 1.arithmatic operators 
 2. assingment operators 
 3. logical operators
 4.comparison operators) */ 

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


Scanner sc8= new Scanner(System.in);

// cancatenation of input and cancatenation of output


System.out.println("enter your name , age, salary respectively");
String name7 = sc8.next();
int age5 = sc8.nextInt();
float salary = sc8.nextFloat();

System.out.println("my name is "+ name7+". i am "+ age5 +" years old. i earns Rs. "+ salary +" per month");


// // you can take the input and print the output separately as well as shown below
System.out.println("enter your goal");
String goal = sc8.nextLine();
System.out.println(goal);

// out:

System.out.println("input your salary");
System.out.println(salary);
System.out.println("enter your name");
System.out.println(name7);


// to get the input of a line
System.out.println("Give your introduction");
String intro = sc8.nextLine();
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
boolean isSunUp1 = sc8.nextBoolean();//true or false

if(isSunUp1 == true)
    System.out.println("It is day");
else
    System.out.println("it is night");
  
System.out.println("enter your age");
int age7 = sc8.nextInt();
if (age7>18) {
 System.out.println("you can vote");
}
else{
  System.out.println("you can't vote");
}

sc8.close();


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
  sc1.close();

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
sc2.close();

//SWITCH CONDITIONAL

Scanner sc6 = new Scanner(System.in);
int choice;
do{
 System.out.println("1.sun\n2.mon\n3.tue\n4.wed\n5.thu\n6.fri\n7.sat\n");

System.out.println("\nenter your choice");
 choice = sc6.nextInt();




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

sc6.close();

// LOOPS

System.out.println("1");
System.out.println("2");
System.out.println("3");
System.out.println("4");

// for printing 1 -100

// increment form

for (int i=0; i<100;i++) {
  System.out.println(i);
} 

// drecememt form
for(int i1=100;i1>0;i1--)
{
  System.out.println(i1);
}

// while

// decrement
int i2 = 100;
while(i2>=1){
  System.out.println(i2);
  i2=i2-2;
}


// increment
int j = 0;
while(j<=100)
{
  System.out.println(j);
  j++;
}


// do while

// decrement
int k = 100;
do{
  System.out.println(k);
k--;
}while(k>=1);

// increment

int k1=0;
do{
  System.out.println(k1);
  k1++;
}while(k<100);



// BREAK AND CONTINUE  (any loop runs infinite times if we give true for its condition)

int i3 =0;
while(true)

{
  if(i3==3){                  //CONTINUE: give the condition, use the increment and then continue syntax
    i3++;
    continue;
    
  }
  System.out.println(i3);
  i3++;

  if(i3>5) {
  break;
  }
  else{
    i3++;
  }
}
}}}



  

 