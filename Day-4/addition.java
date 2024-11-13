import java.util.Scanner;
class addition
{
 public static void main(String args[])
 {
 Scanner Sc=new Scanner(System.in);
 int i,j,r,c,n;
 System.out.println("Enter size of array");
 r=Sc.nextInt();
 c=Sc.nextInt();
 int a[][]=new int [r][c];
 int b[][]=new int[r][c];
 System.out.println("Enter element list 1st matrix:");
  for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
 {
 a[i][j]=Sc.nextInt();
}
}
System.out.println("The Element in 2nd matrix:");
 for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=Sc.nextInt();
}
}
System.out.println("The addition matrix:");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
{
 System.out.println(" "+a[i][j]+b[i][j]);
 }
 System.out.println();
}
}
