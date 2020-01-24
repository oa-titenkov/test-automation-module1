package module1.cleancode;

import module1.cleancode.models.MilitaryType;
import module1.cleancode.planes.ExperimentalPlane;
import module1.cleancode.planes.MilitaryPlane;
import module1.cleancode.planes.PassengerPlane;
import module1.cleancode.planes.Plane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Airport {

  private List<? extends Plane> planes;

  public Airport(List<? extends Plane> planes) {
    this.planes = planes;
  }

    public List<PassengerPlane> getPassengerPlanes() {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> x = new ArrayList<>();
        for (Plane p : l) {if (p instanceof PassengerPlane) {x.add((PassengerPlane) p);}}
        return x;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {

        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);

      for (PassengerPlane passengerPlane : passengerPlanes) {
        if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
          planeWithMaxCapacity = passengerPlane;
        }
      }

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
      for (MilitaryPlane plane : militaryPlanes) {
        if (plane.getType() == MilitaryType.TRANSPORT) {
          transportMilitaryPlanes.add(plane);
        }
      }
    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
      for (MilitaryPlane plane : militaryPlanes) {
        if (plane.getType() == MilitaryType.BOMBER) {
          bomberMilitaryPlanes.add(plane);
        }
      }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void printPlanes(Collection<? extends Plane> collection) {
      for (Plane plane : collection) {
        System.out.println(plane);
      }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "planes=" + planes.toString() +
                '}';
    }
}
