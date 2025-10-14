import java.util.Scanner;
class GCD {

        int makeGCD(int m,int n){
            if (n == 0) {
                return m;
            }
            else {
                return makeGCD(n, m % n);}
        }
    }
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("두개의 정수 입력:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a;
        GCD gcd=new GCD();
        if (m>n){
            a=gcd.makeGCD(m,n);}

        else if (m==n){
            a=m;
        }
        else{
            a=gcd.makeGCD(n,m);
        }
        System.out.printf("두 수의 최대공약수는 %d입니다.",a);

    }
}
