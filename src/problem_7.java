import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int ary[] = new int[10];
        int sum=0,avg =0;

        for(int i=0;i<ary.length;i++){
            ary[i]=(int)(Math.random()*10+1);
            for(int j=0;j<i;j++) {
                if (ary[i] == ary[j])
                    i--;
            }
        }
        for(int i=0; i<ary.length;i++){
            if(i%10==0 && i !=0) {
                System.out.println();
                System.out.print(ary[i] + " ");
                sum += ary[i];
            }
        }
        avg = sum/(ary.length);
        System.out.println();
        System.out.println("평균은 "+ avg);
        In.close();
    }
}
