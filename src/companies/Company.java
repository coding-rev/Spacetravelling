package companies;
import spaceships.Spaceship;
import java.util.List;

public class Company {
    private String companyName;
    private List<Spaceship> fleet;

    public Company(String companyName, List<Spaceship> fleet){
        this.companyName = companyName;
        this.fleet = fleet;
    }
    // Getters
    public String getCompanyName(){
        return companyName;
    }

    public List<Spaceship> getFleet(){
        return fleet;
    }

    // Getters

}
