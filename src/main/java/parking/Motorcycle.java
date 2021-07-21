package parking;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    @Override
    public boolean canFitInSpot(Spot spot) {
        return spot.getSize() == VehicleSize.Motorcycle;
    }

    public void print() {
        System.out.print("M ");
    }
}
