import java.util.*;
public class coins{
    public static int minCoinsToTake(int []arr){
        int sum=0,sum1=0,c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int j=arr.length-1;j>=0;j--){
            sum1+=arr[j];
            c++;
            if(sum1>sum-sum1){
                return c;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println(minCoinsToTake(coins));
        sc.close();
    }
}
