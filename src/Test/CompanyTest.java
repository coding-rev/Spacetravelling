package Test;

import static org.junit.jupiter.api.Assertions.*;

import Passengers.Human;
import Passengers.Martian;
import Planets.Earth;
import Planets.Mars;
import companies.*;
import spaceships.*;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import spaceships.Seats.HumanSeat;
import spaceships.Seats.MartianSeat;

public class CompanyTest {
    String no_response_to_date  = "No, you can't date this passenger";
    String yes_response_to_date = "Yes, you can date this passenger";
    Company spaceT = new Company("SpaceT", List.of(
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));

    Company turntablGalactic = new Company("Turntabl Galactic", List.of(
            new Spacer(),
            new Spacer(),
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));


    @Test
    public void totalSizeOfFleetIsCorrect(){
        Assert.assertEquals(22, turntablGalactic.getFleet().size());
        Assert.assertEquals(20, spaceT.getFleet().size());
    }


    @Test
    public void totalSizeOfFleetWhereSafetyRatingGT4(){
        int stCount = (int) spaceT.getFleet().stream().filter(s -> s.getSafetyRating() > 4).count();
        Assert.assertEquals(22, turntablGalactic.getFleet().size());
    }

 // BOOKING AND PASSENGER TEST
        @Test
        public void test_human_creation(){
            Human human = new Human(0000, "Manuel");
            Assert.assertEquals(0000, human.getid());
            Assert.assertEquals("Manuel", human.getName());
        }

        @Test
        public void test_martian_creation(){
            Martian martian = new Martian(1111, "Asakaa");
            Assert.assertEquals(1111, martian.getid());
            Assert.assertEquals("Asakaa", martian.getName());
        }

        @Test
        public void test_human_book_bulletship(){
            Bulletship bulletship   = new Bulletship();
            Human human             = new Human(0001, "Manuel 2");
            bulletship.bookSeat(human);
            Assert.assertEquals(1, bulletship.getSeats().size());
        }

        @Test
        public void test_seat_booking_by_human(){
            Human human             = new Human(0007, "Manuel 7");
            HumanSeat seat          = new HumanSeat(human.getid(), human.getName());
            Assert.assertEquals("Manuel 7", seat.passenger_name);
        }

        @Test
        public void test_seat_booking_by_martian(){
            Martian martian         = new Martian(1117, "Asakaa 7");
            MartianSeat seat          = new MartianSeat(martian.getid(), martian.getName());
            Assert.assertEquals("Asakaa 7", seat.passenger_name);
        }

        @Test
        public void test_martian_book_stardelino(){
            Stardelino stardelino   = new Stardelino();
            Martian martian         = new Martian(1112, "Asakaa 2");
            stardelino.bookSeat(martian);
            Assert.assertEquals(1, stardelino.getSeats().size());
        }

        @Test
        public void test_human_cant_book_spaceships_beyond_capacity(){
            Spacer spacer   = new Spacer();
            int extra_capacity  = 3;
            for(int count=0; count <= spacer.getCapacity() + extra_capacity; count ++){
                Human human = new Human(0+(count+1), "Manuel "+(count+1));
                spacer.bookSeat(human);
            }
            Assert.assertFalse(spacer.getSeats().size() > spacer.getCapacity());
            Assert.assertEquals(spacer.getCapacity(), spacer.getSeats().size());
        }

        @Test
        public void test_singleton_earth(){
            Earth earth1 = Earth.getInstance();
            Earth earth2 = Earth.getInstance();
            Assert.assertSame(earth1, earth2);

        }
        // Dating Tests
        @Test
        public void test_human_can_date_human(){
            Human human1     = new Human(1212, "Human One");
            Human human2    = new Human(1212, "Human Two");
            Assert.assertEquals(yes_response_to_date, human1.canDate(human2));
        }

        @Test
        public void test_martian_can_date_martian(){
            Martian martian1     = new Martian(023232, "Martian One");
            Martian martian2     = new Martian(43579, "Martian Two");
            Assert.assertEquals(yes_response_to_date, martian1.canDate(martian2));
        }


        @Test
        public void test_human_cant_date_martian(){
            Human human     = new Human(1212, "Seth");
            Martian martian = new Martian(1212, "Martian");
            Assert.assertEquals(no_response_to_date, human.canDate(martian));

        }


        @Test
        public void test_martian_cant_date_human(){
            Human human     = new Human(1212, "Seth");
            Martian martian = new Martian(1212, "Martian");
            Assert.assertEquals(no_response_to_date, martian.canDate(human));

        }


    }







