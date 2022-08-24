package Location;

import Sangat.Sangat;

import java.util.ArrayList;
import java.util.List;

public class Location extends Sangat{

    private String location;
    private ArrayList<Sangat> sangat;

    public Location(String name) {
        super(name);
    }

    public String Location(String name, int sevaQuantity, int seva, int countSangat, String location) {
        super(name, sevaQuantity, seva, countSangat);
        return location;
    }
    public ArrayList<Sangat> getSangat() {

        return sangat;
    }


}
