package parking;

public class Bus extends Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    @Override
    public boolean canFitInSpot(Spot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    public void print() {
        System.out.print("B ");
    }
}
