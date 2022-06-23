package spaceships.Seats;

public class HumanSeat extends Seats{
    public HumanSeat(int getId, String getName) {
        super(getId, getName);
    }

    @Override
    public int getPassengerId() {
        return passenger_id;
    }

    @Override
    public String getPassengerName() {
        return passenger_name;
    }
}
