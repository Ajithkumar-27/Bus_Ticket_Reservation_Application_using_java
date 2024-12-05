public class Bus {
    private int busNo;
    private String place;
    private String type;
    private int capacity;
    Bus()
    {}
    Bus(int busNo,String place,String type,int capacity)
    {
        this.busNo=busNo;
        this.place=place;
        this.type=type;
        this.capacity=capacity;
    }
    public void setBusNo(int busNo)
    {
        this.busNo=busNo;
    }
    public void setplace()
    {
        this.place=place;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }
    public int getBusNo()
    {
        return busNo;
    }
    public String gettype()
    {
        return type;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public String getPlace()
    {
        return place;
    }
    public void getInFo()
    {
        System.out.println("BusNo :"+busNo+" Place is : "+place+" BusType : "+type+" Capacity : "+capacity);
    }
}
