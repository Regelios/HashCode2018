import java.util.ArrayList;

public class Cordnations {

    private ArrayList<Car> pSpace;

    public Cordnations(){
        pSpace = new ArrayList<Car>();
    }

    public ArrayList<Car> getpSpace() {
        return pSpace;
    }

    public void setpSpace(ArrayList<Car> pSpace) {
        this.pSpace = pSpace;
    }

    public void addCar(){
        pSpace.add(new Car(0,0));
    }

}
