public class Average {
    public static void main(String[] args){
        int sum=0, avg=0;

        int[] ary = new int[] {2,3,4};
        for(int i=0;i<ary.length;i++){
            sum += ary[i];
        }
        avg = sum/(ary.length);
        System.out.println("java average 2 3 4"+avg);
    }
}
