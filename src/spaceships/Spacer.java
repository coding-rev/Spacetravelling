package spaceships;
import java.util.ArrayList;
import java.util.List;

import Passengers.Human;
import Passengers.Martian;
import spaceships.Seats.HumanSeat;
import spaceships.Seats.MartianSeat;
import spaceships.Seats.Seats;

public class Spacer extends Spaceship{
    private int capacity    = 20;
    private int speed       = 450;
    private int safetyRating= 4;
    static public List<Seats> seats = new ArrayList<>();
    @Override
    public int getCapacity() {
        return capacity;
    }
    @Override
    public int getSafetyRating() {
        return 4;
    }

    @Override
    public int getSpeed() {
        return 450;
    }

    @Override
    public List<Seats> getSeats(){
        return seats;
    };

    @Override
    public boolean check_seat_availabity(int number) {
        if(number <= capacity) return true;
        else return false;
    }
    public void bookSeat(Martian martian) {
        MartianSeat seat = new MartianSeat(martian.getid(), martian.getName());
            if(seats.size() < capacity){
                seats.add(seat);
                System.out.println("Martian Food served for this seat.");
            }
        };


    public void bookSeat(Human human) {
        HumanSeat seat = new HumanSeat(human.getid(), human.getName());
        if(seats.size() < capacity){
            seats.add(seat);
            System.out.println("Human Food served for this seat.");
        }
    }
}
