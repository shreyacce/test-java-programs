public class Box
{
 private double length,width,height;
 Box(double l,double b,double h)
 {
  this.length=l;
  this.width=b;
  this.height=h;
 }
 public void setLength(double l)
 {
  this.length=l;
 }
 public void setWidth(double b)
 {
  this.width=b;
 }
 public void setHeight(double h)
 {
  this.height=h;
 }
 public double getLength()
 { return this.length;}
 public double getWidth()
 { return this.width;}
 public double getHeight()
 { return this.height;}
 public String toString()
 {
  return "length: "+this.getLength()+"width: "+this.getWidth()+"height: "+this.getHeight()+"Area: "+this.area()+"Volume: "+this.volume();
 }
 public double area()
 {
  return 2*(length*width+width*height+height*length);
 }
 public double volume()
 { return length*width*height;}
 public boolean equals(Box other)
 {
  boolean b1=this.getLength()==other.getLength();
  boolean b2=this.getWidth()==other.getWidth();
  boolean b3=this.getHeight()==other.getHeight();
  return b1&&b2&&b3;
 }
}
class BoxTest
{
 public static void main(String args[])
 {
  Box b1=new Box(10,6,8);
  Box b2=new Box(2,4,6);
  Box b3=new Box(10,6,8);
  System.out.println(b1);
  System.out.println(b2);
  System.out.println(b3);
 if(b1==b3)
 System.out.println("Hello");
 else
 System.out.println("Hi");
 
 if(b1.equals(b3))
 System.out.println("Hello");
 else
 System.out.println("Hi");
 }
}
/*class A{}
class BoxTest
{
public static void main(String args[])
{
 A a1=new A();
 A a2=new A();
 System.out.println(a1);
 System.out.println(a2);
 System.out.println(a1.equals(a2));
}
}*/