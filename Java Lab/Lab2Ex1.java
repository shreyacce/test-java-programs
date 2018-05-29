import java.io.*;
import java.util.Scanner;
class Lab2Ex1
{
 public static void main(String args[]) throws IOException
 {
  int num;
  int sum=0;
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<10;i++)
  {
   System.out.println("enter "+i+"number:");
   num=sc.nextInt();
   sum+=num;
  }
  System.out.println("sum is: "+sum);
 }
}