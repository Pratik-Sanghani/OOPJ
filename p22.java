import java.io.*;
import java.math.*;
class p22
{
  public static void main(String args[]) {
    int n=Integer.parseInt(args[0]);
    int sum=0,i;
    for(i=1;i<=n;i++)
    {
      sum = sum + (int) Math.pow(i,3);
    }
    System.out.println("Ans is = "+sum);
  }
}
