class A{}
class B{}
class C
{
 byte b;
 short s;
 int i;
 long l;
 char c;
 float f;
 double d;
 boolean B;
 A a;
 B bb;
}
class Test
{
 public static void main(String args[])
 {
  C c1=new C();
  int x;
  int y=x+10;
  System.out.println(c1.b);
  System.out.println(c1.s);	
  System.out.println(c1.i);
  System.out.println(c1.l);	
  System.out.println(c1.c);	
  System.out.println(c1.f);
  System.out.println(c1.d);	
  System.out.println(c1.B);	
  System.out.println(c1.a);
  System.out.println(c1.bb);
  }
 }