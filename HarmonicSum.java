public class HarmonicSum
{
 public static void main(String[] args)
 {
  int maxDenom=50000;
  double sumL2R=0.0;
  double sumR2L=0.0;
  for(int denom=1;denom<=maxDenom;denom++)
  {
   sumL2R=sumL2R+(1.00/denom);
  }
  System.out.println("sum from left to right is:"+sumL2R);
  for(int denom=maxDenom;denom>=1;denom--)
  {
   sumR2L=sumR2L+(1.00/denom);
  }
  System.out.println("sum from right to left is:"+sumR2L);
  
  double diff=sumR2L-sumL2R;
  System.out.println("difference is :"+diff);
 }
} 