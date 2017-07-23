import java.io.*;
class p13
{
  public static void main(String args[]) {
    int n=Integer.parseInt(args[0]);
    int fact=1;
    for(int i=n;i>0;i--)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+n+" Is = "+fact);
  }
}
