import java.util.ArrayList;

public class Cordnations {

    private ArrayList<Car> pSpace;
    private ArrayList<Ride> customers;

    public Cordnations(){
        pSpace = new ArrayList<Car>();
        customers = new ArrayList<Ride>();
    }

    public ArrayList<Car> getpSpace() {
        return pSpace;
    }

    public void setpSpace(ArrayList<Car> pSpace) {
        this.pSpace = pSpace;
    }

    public ArrayList<Ride> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Ride> customers) {
        this.customers = customers;
    }
}
