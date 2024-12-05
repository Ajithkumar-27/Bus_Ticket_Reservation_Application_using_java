import java.util.*;
public class TickerReservation {
    static{
        System.out.println("Welcome to TicBus");
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Booking> Booking=new ArrayList<Booking>();
        ArrayList<Bus> Buses = new ArrayList<Bus>();
        Buses.add(new Bus(100,"Jayankondam","AC",2));
        Buses.add(new Bus(101,"Karaikudi","Non-AC",40));
        Buses.add(new Bus(102,"Kallathur","Non-AC",60));
        Buses.add(new Bus(103,"Devakottai","AC",20));
        
        boolean bool=true;;
        do
		{
        System.out.println("\t\t\tEnter 1 to book\n\t\t\tEnter 2 to View Ticket\n\t\t\tEnter 3 to cancell the ticket\n\t\t\tEnter 4 to exit  ");
        System.out.print("Enter the number: ");
        int choice=sc.nextInt();
       
        switch (choice) {
            case 1:
            {
                for (Bus b:Buses) {
                    b.getInFo();
                }
                Booking booking=new Booking();
                if (booking.isAvailable(Booking,Buses)) {
                    Booking.add(booking);
                    System.out.println("your booking is added");
                }
                else
                System.out.println("Seats are Booked No more Seats Available");

                break;
            }
            case 2:
            {
                System.out.print("Enter your phoneNo: ");
                long userPhn=sc.nextLong();
                for (Booking phn:Booking) 
                {
                    if (phn.getPhone()==userPhn) {
                        phn.getTicketdetails();
                    }
                    else
                    System.out.println("No data Found");
                }
                
                    break;
                }
                case 3:
                {
                    System.out.print("Enter your phoneNo: ");
                long userPhn=sc.nextLong();
                for (Booking phn:Booking) 
                {
                    if (phn.getPhone()==userPhn) {
                        Booking.remove(phn);
                        System.out.println("ticket cancelled");
                    }
                    else
                    System.out.println("Data Not Found");
                }
                break;
                }
            case 5:
            {
                bool=false;
                System.out.println("Thankyou For Booking");
                break;
            }
            default:
                break;
        }

		}
		while (bool==true);
        }
}
