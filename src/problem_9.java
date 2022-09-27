public class problem_9 {
    public static void main(String[] args){
        int ary[][] = new int[4][4];

        for(int i=0; i<ary.length; i++){
            for(int j=0; j<ary[i].length; j++){
                ary[i][j] = (int)(Math.random()*10+1);
            }
        }
        for(int i=0;i<ary.length;i++){
            for(int j=0;j<ary[i].length;j++){
                System.out.print(ary[i][j]+" ");
            }
            System.out.println();
        }
    }
}
