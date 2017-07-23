import java.io.*;
class p14
{
  public static void main(String args[]) {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    if(a>b)
      System.out.println(a+" is Max and "+b+" is Min..");
    else if (a<b)
      System.out.println(b+" is Max and "+a+" is Min..");
    else
      System.out.println("Both are same..");
  }
}
