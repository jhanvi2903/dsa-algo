public class gcd {
    public static long gcd(long a, long b){
        long max, min, rem;

        min = Math.min(a, b);
        max = Math.max(a, b);

        while((rem = max % min) != 0) {
            max = min;
            min = rem;
        }

        return min;
    }

    public static void main(String[] args){
        System.out.println(gcd(64,40));
    }
}
