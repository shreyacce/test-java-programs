class FinalDemo
{
 public double a=1000;
 public final double b=4.56;
 public static final int c=10;
 public void displayValues()
 {
  final double a=20.56;
  final int b=23;
  int c=20;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(this.a);
  System.out.println(this.b);
  System.out.println(FinalDemo.c);
 }
}
class FinalDemoTest
{
 public static void main(String args[])
 {
  FinalDemo d1=new FinalDemo();
  d1.displayValues();
 }
}