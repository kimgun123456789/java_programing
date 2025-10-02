import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 정수를 입력받나요?:");
        int a = sc.nextInt();
        System.out.print("수를 입력하세요:");
        int []b=new int[a];

        for(int i=0;i<a;i++) {
            b[i] = sc.nextInt();
        }
        int max=b[0];
        int min=b[0];
        for (int i =0;i<a;i++){
            if (max<=b[i]){
                max=b[i];
            }
            if (min>=b[i]){
                min=b[i];
            }
        }
        System.out.printf("최댓값 : %d\n최솟값 : %d",max,min);

    }
}
