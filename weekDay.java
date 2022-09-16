import java.util.Scanner; 

  public class weekDay {

  public static void main(String args[]){
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
case 8: System.out.println("wrong choice");
break;
}
}while(choice<=8);
    
  }
  
}
