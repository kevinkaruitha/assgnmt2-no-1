mport java.util.Scanner;

public class methods {
    public static void main(int[]args){
        
        Scanner console= new Scanner(System.in);
 int number;
 int max=
 Integer.MAX_VALUE;
 int min=
  Integer.MAX_VALUE;
 
 char choice;
 
 do
 {
     System.out.print("Enter the number");
     number=
             console.nextInt();
     if(number > max)
     {
         max=number;
     }
     if(number < min )
         min = number;
 System.out.println("largest number;"+max);
 
 System.out.println("smallest number;"+min);
 }