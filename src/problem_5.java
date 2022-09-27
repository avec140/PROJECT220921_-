import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int ary[] = new int[10];

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < ary.length; i++) {
            ary[i] = In.nextInt();
        }

        System.out.print("3의 배수는");
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] % 3 == 0) {
                System.out.print(ary[i] + " ");
            }
        }
        In.close();
    }
}