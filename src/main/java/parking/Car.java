package parking;

public class Car extends Vehicle {
    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    @Override
    public boolean canFitInSpot(Spot spot) {
        return spot.getSize() == VehicleSize.Compact;
    }

    public void print() {
        System.out.print("C ");
    }
}
