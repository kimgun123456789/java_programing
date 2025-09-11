import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        int result = 0;
        for (int i = 0; i<=4; i++){
            System.out.printf("정수를 입력하세요:");
            int a = sc.nextInt();
            result+=a;
            num[i] =a;
            System.out.println("현재까지 입력된 정수의 합은 "+result+"입니다");

        }

    }
}
