import java.util.Scanner;
class RandomStats
{
 public static void main(String args[])
 {
  int a[]=new int[20];
  int temp,n,sum=0;
  double mean,median;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of elements:");
  n=sc.nextInt();
  
  for(int i=0;i<n;i++)
  {
   a[i]=(int)(Math.random()*20);
   System.out.print(a[i]+" "); 
  }
  for(int i=0;i<n-1;i++)
  {
   for(int j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
	{
	 temp=a[j];
	 a[j]=a[j+1];
	 a[j+1]=temp;
	}
   }
  }
  System.out.println("\nSorted array is: ");
  for(int i=0;i<n;i++)
  {
   System.out.print(a[i]+" ");
   sum=sum+a[i];
  }
  mean=sum/(n*1.0);
  median=(a[n]+a[n-1])/2.0;
  System.out.println("\nmean= "+mean);
  System.out.println("meadian= "+median);
 }
}