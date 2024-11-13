class Addition3
{
 int a,b,c;
 void add(int x,int y)
 {
  a=x;
  b=y;
  c=a+b;
  System.out.println("The Addition value is:"+c);
 }
}
class Addition
{
public static void main(String[] args)
{
int R=34,O=23;
Addition3 a1=new Addition3();
a1.add(R,O);
}
}
