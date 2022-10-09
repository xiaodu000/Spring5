public class Number {
    public static void main(String[] args) {
        double sum=0.0;
        int d=1;
        for(int i=1;i<=20;i++){
            sum+=(1.0/i)*d;
            d=-d;
        }
        System.out.println(sum);
    }
}
