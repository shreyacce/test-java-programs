class Fibonacci
{
 public static void main(String[] args)
 {
  int a=0,b=1,c=0,sum=0;
  float avg=0;
  int n=Integer.parseInt(args[0]);
  System.out.println("the first 20 fibonacci no.s are:");
  System.out.println(" "+b);
  for(int i=1;i<n;i++)
  {
   c=a+b;
   a=b;
   b=c;
   System.out.println(" "+c);
   sum=sum+c;
  }
  System.out.println();
  System.out.println("sum= "+sum);
  avg=sum/n;
  System.out.println("average= "+avg);
 }
}