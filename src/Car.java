
public class Car {
	private int destx;
	private int desty;
	private boolean hasPassenger;

	public Car(int destx, int desty) {
		this.destx = destx;
		this.desty = desty;
		this.hasPassenger = false;
	}

	public void pickup(int passx, int passy) {
		hasPassenger = true;
		destx = passx;
		desty = passy;
	}

	public void moveToPassenger(int newx, int newy) {
		destx = newx;
		desty = newy;

	}

}
