import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    MarksOutOfBoundsException(String s) {
        super(s);
    }
}

public class Q15 {
    public static void main(String[] args) throws MarksOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.next();
        System.out.print("Enter seat number : ");
        int seat=sc.nextInt();
        System.out.print("Enter date : ");
        String date=sc.next();
        System.out.print("Enter marks : ");
        int marks=sc.nextInt();
        if(marks>100)
        throw new MarksOutOfBoundsException("Marks should not be greater than 100.");
        else if(marks<0)
        throw new MarksOutOfBoundsException("Marks must be greater than 0.");
        else
        System.out.print("The marks are "+marks);
    }
}
