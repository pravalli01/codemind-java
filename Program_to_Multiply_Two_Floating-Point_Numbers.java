import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float ft1=sc.nextFloat();
        float ft2=sc.nextFloat();
        float product=ft1*ft2;
        System.out.format("%.2f",product);
    }
}