import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        long maxi = 0;
        long mini = Long.MAX_VALUE;
        long a;
        for(int i=0;i<5;i++) {
            System.out.print("Enter number "+(i+1)+" : ");
            a=sc.nextLong();
            sum+=a;
            maxi=Math.max(maxi,a);
            mini=Math.min(mini,a);
        }
        System.out.println((sum-maxi)+" "+(sum-mini));
    }
}
