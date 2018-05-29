class prime1
{
 public static void main(String[] args)
 {
  int p;
  int n=Integer.parseInt(args[0]);
  for(int i=2;i<=n;i++)
  {
   p=0;
   for(int j=2;j<i;j++)
   {
    if(i%j==0)
	{
	 p=1;
	 break;
	} 
   }
   if(p==0)
   System.out.println(i);
  }
 }
}