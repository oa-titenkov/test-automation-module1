package module1.cleancode.planes;

import java.util.Objects;

public abstract class Plane {

    String model;
    private PlaneSpecifications planeSpecifications;

    Plane(String model, PlaneSpecifications planeSpecifications) {
        this.model = model;
        this.planeSpecifications = planeSpecifications;
    }

    public String getModel() {
        return model;
    }

    public PlaneSpecifications getPlaneSpecifications() {
        return planeSpecifications;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", planeSpecifications=" + planeSpecifications +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(model, plane.model) &&
                Objects.equals(planeSpecifications, plane.planeSpecifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, planeSpecifications);
    }

}
