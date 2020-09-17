package module1.cleancode.planes;

import java.util.Objects;

public class PlaneSpecifications {

    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public PlaneSpecifications(int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneSpecifications that = (PlaneSpecifications) o;
        return maxSpeed == that.maxSpeed &&
                maxFlightDistance == that.maxFlightDistance &&
                maxLoadCapacity == that.maxLoadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
