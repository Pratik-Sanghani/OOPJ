import java.io.*;
import java.math.*;
class p15
{
  public static void main(String args[]) {
    int sum=0;
    int n=Integer.parseInt(args[0]);
    int l=(int) Math.log10(n) +1;
    for (int i=1;i<=l;i++)
    {
     int t =(int) (n % Math.pow(10,i)) /(int) Math.pow(10,i-1);
      sum=sum+(int) Math.pow(t,l);
    }
    if(sum==n)
      System.out.println(n+" Is An Armstrong No.");
    else
      System.out.println(n+" Is not An Armstrong No.");
  }
}
