import java.io.*;

class m21
{
  public static void main(String[] args) {
    int a[]={1,2,3,4};
    double sum=0;
    for(int i=0;i<4;i++)
    {
      sum=sum+a[i];
    }
    double avg=(double)(sum/4);
    System.out.println("Average of elements of Array is.."+avg);
  }
}
