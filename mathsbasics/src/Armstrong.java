public class Armstrong {

    public static String armstrong(int n){
        int count =0;
        int temp=n;
        double sum=0;

        while (temp!=0){
            temp=temp/10;
            count++;
        }

        int temp2=n;
        while (temp2!=0){
            int rem= temp2%10;
            sum=sum+Math.pow(rem,count);
            temp2=temp2/10;
        }

        if(sum==n){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static void main(String[] args){
        System.out.println(armstrong(170));
    }
}
