package spaceships;

import Passengers.Human;
import Passengers.Martian;
import spaceships.Seats.HumanSeat;
import spaceships.Seats.MartianSeat;
import spaceships.Seats.Seats;

import java.util.ArrayList;
import java.util.List;

public class Bulletship extends Spaceship{
    private int capacity    = 100;
    private int speed       = 1800;
    private int safetyRating= 2;
    static public List<Seats> seats = new ArrayList<>();

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getSafetyRating() {
        return 2;
    }

    @Override
    public int getSpeed() {
        return 1800;
    }

    @Override
    public List<Seats> getSeats(){
        return seats;
    };


    public void bookSeat(Martian martian) {
        MartianSeat seat = new MartianSeat(martian.getid(), martian.getName());
        if(seats.size() < capacity){
            seats.add(seat);
            System.out.println("Martian Food served for this seat.");
        }
    };


    public void bookSeat(Human human) {
        HumanSeat seat = new HumanSeat(human.getid(), human.getName());
        if(seats.size() < getCapacity()){
            seats.add(seat);
            System.out.println("Human Food served for this seat.");
        }
    }
}