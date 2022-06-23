package spaceships.Seats;

public abstract class Seats {
    public int passenger_id;
    public String passenger_name;
    public Seats(int getId, String getName){
        passenger_id = getId;
        passenger_name =getName;
    };
    public abstract int getPassengerId();
    public abstract String getPassengerName();
}
