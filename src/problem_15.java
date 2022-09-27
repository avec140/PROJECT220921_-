import java.util.Scanner;
import java.util.InputMismatchException;
public class problem_15 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
            while(true) {
                System.out.print("곱하고자 하는 두 수 입력 >> ");
                try {
                    int n = In.nextInt();
                    int m = In.nextInt();
                    System.out.print(n + "x" + m + "=" + n*m);
                    break;
                }catch(InputMismatchException e) {
                    System.out.println("실수는 입력하면 안됩니다.");
                    In.nextLine();
                }
            }
            In.close();
        }

    }

