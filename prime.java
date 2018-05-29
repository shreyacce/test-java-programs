class prime
{
 public static void main(String[] args)
 {
  int i,x;
  int n=Integer.parseInt(args[0]);
  x=2;
  for(i=2,x=2;i<=n;i++)
  {
   for(x=2;x<i;x++)
   {
    if(i%x==0)
	break;
   }
   if(x==i)
   System.out.println(x+" is prime");
  }
 }
}