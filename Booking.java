import java.util.*;
public class Booking {
    String passengerName;
    int busNo;
    String date;
    long phone;
    static Scanner sc=new Scanner(System.in);
    Booking()
    {
        System.out.print("Enter Passenger name: ");
        passengerName=sc.nextLine();
        System.out.print("Enter Bus no: ");
        busNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Date: ");
        date=sc.nextLine();
        System.out.print("Enter PhoneNo: ");
        phone=sc.nextLong();
    }
    public boolean isAvailable(ArrayList<Booking> booking,ArrayList<Bus> Buses)
    {
        int capacities=0,book=0;
        for (Bus b : Buses) {
            if (b.getBusNo()== busNo) {
                capacities=b.getCapacity();
            }
        }
        for (Booking bo : booking) {
            if (bo.busNo==busNo && bo.date.equals(date)) {
                book++;
            }
        }
        return (book<capacities)?true:false;
    }
    public long getPhone(){
       
        return phone;
    }
    public void getTicketdetails()
    {
        System.out.println("Passenger Name: "+passengerName+"\nBus No: "+busNo+"\nPhone No: "+phone+"\ndate is: "+date);

    }
}
