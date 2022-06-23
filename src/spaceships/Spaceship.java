package spaceships;
import Passengers.Human;
import Passengers.Martian;
import spaceships.Seats.HumanSeat;
import spaceships.Seats.MartianSeat;
import spaceships.Seats.Seats;

import java.util.ArrayList;
import java.util.List;

public abstract class Spaceship {

    public abstract int getCapacity();

    public abstract int getSpeed();

    public abstract int getSafetyRating();

    public abstract List<Seats> getSeats();

    public abstract boolean check_seat_availabity(int number);


}