import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {

    private Cordnations[][] Grid ;
    private ArrayList<Ride> rideList = new ArrayList<>();

    public City(int Row, int Columms) {
        Grid = new Cordnations[Row][Columms];
    }

    private void addRide(Ride latestRide){
        rideList.add(latestRide);
    }
}
