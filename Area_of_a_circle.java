import java.util.Scanner;
class Sample{
    public static void main(String args[])throws Exception{
    int r;
    float a;
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    a=(float)(3.14*r*r);
    System.out.format("%.2f",a);
    }
}