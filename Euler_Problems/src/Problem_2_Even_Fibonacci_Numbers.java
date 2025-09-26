public class Problem_2_Even_Fibonacci_Numbers {
    public static void main(String[] args) {
        int x,y,z,sum;
        sum=0;
        x=0;
        y=1;
        for(int i=1;i<=4_000_000;i=z){
            z=x+y;
            //System.out.println(z);
            if(z%2==0){
                sum=sum + z;
            }
            x=y;
            y=z;
        }
        System.out.println(sum);


    }
}
