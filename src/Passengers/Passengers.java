package Passengers;

public abstract class Passengers {
    protected int id;
    protected String name;
    public Passengers(int getId, String getName){
        id = getId;
        name = getName;
    };
  public abstract int getid();
  public abstract String getName();

  public abstract String canDate(Human human);
  public abstract String canDate(Martian martian);
}
