package parking;

import java.util.ArrayList;

public abstract class Vehicle {

    protected ArrayList<Spot> parkingSpots = new ArrayList<Spot>();
    protected VehicleSize size;
    protected int spotsNeeded;

    public VehicleSize getSize() {
        return this.size;
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public void parkInSpot(Spot spot) {
        parkingSpots.add(spot);
    }

    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(Spot spot);
}
