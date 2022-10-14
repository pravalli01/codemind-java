import java.util.Scanner;
class Sample{
    public static void main(String args[])throws Exception
    {
        int N,M;
        float a;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        M=s.nextInt();
        a=(float)(N+M)/2;
        System.out.format("%.4f",a);
        
    }
}