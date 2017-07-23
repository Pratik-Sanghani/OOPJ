import java.io.*;
class p24
{
  public static void main(String args[]) {
    int n=Integer.parseInt(args[0]);
    String s=(n<0)?"No. is -ve":"No. is either +ve or zero";
    System.out.println(s);
  }
}
