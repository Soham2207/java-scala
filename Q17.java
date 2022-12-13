import java.util.Scanner;

class Reservation
{
    static int availableSeats;
    void setAvlSeats() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter total available seats : ");
        availableSeats=sc.nextInt();
    }

    synchronized void reserveSeat(int requestedSeats)
    {
        System.out.println("Thread entered.");
        System.out.println("Availableseats : " + availableSeats + " Requested seats : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seats Available. Booked successfully.");
            availableSeats-=requestedSeats;
        }
        else
        {
            System.out.println("Seats not available.");
        }
        System.out.println("Thread completed.");
        System.out.println("");
    }
}

class Person extends Thread
{
    Reservation reserve;
    int requestedSeats;
    public Person(Reservation reserve, int requestedSeats)
    {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }
    synchronized public void run()
    {
        reserve.reserveSeat(requestedSeats);
    }
}

public class Q17 {
    public static void main(String[] args)
    {
        Reservation reserve = new Reservation();
        reserve.setAvlSeats();
        Person thread1 = new Person(reserve, 5);
        thread1.start();
        Person thread2 = new Person(reserve, 6);
        thread2.start();
    }
}
