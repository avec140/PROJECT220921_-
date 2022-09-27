import java.util.Random;
import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
            Random r = new Random();
            int rd = r.nextInt(100);          //rd = 랜덤한 정수를 받아오는 변수
            Scanner in = new Scanner(System.in);
            int cnt=1;                              //couting하는 변수
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            while(true) {
                int num = in.nextInt();                 //scanf받아오는 변수
                if (rd == num) {
                    System.out.println(cnt+">>"+num);
                    System.out.println("맞았습니다.");
                    System.out.println("다시하시겠습니까(y/n)>>");
                    String text = in.next();
                    if(text.equals("n")){
                        System.out.println("종료");
                        break;
                    }
                    else if(text.equals("y")){
                        rd = r.nextInt(100);
                        System.out.println("수를 결정하였습니다. 맞추어 보세요");
                        cnt = 1;
                    }
                }
                else if(rd > num){
                    System.out.println("0 ~ 99");
                    System.out.println(cnt + ">>" + num);
                    System.out.println("더 높게");
                    cnt++;
                }
                else{
                    System.out.println(cnt + ">>" + num);
                    System.out.println("더 낮게");
                    cnt++;
                }
            }
        }
    }

