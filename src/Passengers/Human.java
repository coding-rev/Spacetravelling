package Passengers;

import java.util.HashMap;

public class Human extends Passengers{

    public Human(int getId, String getName) {
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
        return "Yes, you can date this passenger";
    }
    @Override
    public String canDate(Martian martian) {
        return "No, you can't date this passenger";
    }
}
