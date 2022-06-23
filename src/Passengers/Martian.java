package Passengers;

import java.util.HashMap;

public class Martian extends Passengers {

    public Martian(int getId, String getName) {
        super(getId, getName);
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String canDate(Human human) {
        return "No, you can't date this passenger";
    }
    @Override
    public String canDate(Martian martian) {
        return "Yes, you can date this passenger";
    }
}
