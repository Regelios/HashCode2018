import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {

    private Cordnations[][] Grid ;
    private ArrayList<Ride> rideList = new ArrayList<>();


    public City(int Row, int Columms,int Amount) {
        Grid = new Cordnations[Row][Columms];
        startingCars(Amount);
    }

    private void addRide(Ride latestRide){
        rideList.add(latestRide);
    }

    public void startingCars(int Amount){
        Cordnations temp = Grid[0][0];
        for (int i = 0; i < Amount; i ++){
            temp.addCar();
        }
    }

    public void moveCar(Car car){

        

    }
}
