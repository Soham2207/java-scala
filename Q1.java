import java.util.Scanner;;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity : ");
        int q=sc.nextInt();
        if(q>1000) {
            System.out.println("Total cost is Rs "+q*90);
        }
        else {
            System.out.println("Total cost is Rs "+q*100);
        }
    }
}