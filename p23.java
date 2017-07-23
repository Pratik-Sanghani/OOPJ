import java.io.*;

class p23
{
  public static void main(String[] args) {
    int a[]={54,98,52,5,47,52,87,45,78,52};
    int max=a[0],i;
    for(i=1;i<10;i++)
    {
      if(a[i]>max)
        max=a[i];
    }
    System.out.println("Maximum No. is "+max);
  }
}
