import module1.cleancode.Airport;
import module1.cleancode.models.ClassificationLevel;
import module1.cleancode.models.ExperimentalType;
import module1.cleancode.models.MilitaryType;
import module1.cleancode.planes.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AirportTest {

    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", new PlaneSpecifications(900, 12000, 60500), 164),
            new PassengerPlane("Boeing-737-800", new PlaneSpecifications(940, 12300, 63870), 192),
            new PassengerPlane("Boeing-747", new PlaneSpecifications(980, 16100, 70500), 242),
            new PassengerPlane("Airbus A320", new PlaneSpecifications(930, 11800, 65500), 188),
            new PassengerPlane("Airbus A330", new PlaneSpecifications(990, 14800, 80500), 222),
            new PassengerPlane("Embraer 190", new PlaneSpecifications(870, 8100, 30800), 64),
            new PassengerPlane("Sukhoi Superjet 100", new PlaneSpecifications(870, 11500, 50500), 140),
            new PassengerPlane("Bombardier CS300", new PlaneSpecifications(920, 11000, 60700), 196),
            new MilitaryPlane("B-1B Lancer", new PlaneSpecifications(1050, 21000, 80000), MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", new PlaneSpecifications(1030, 22000, 70000), MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", new PlaneSpecifications(1000, 20000, 80000), MilitaryType.BOMBER),
            new MilitaryPlane("F-15", new PlaneSpecifications(1500, 12000, 10000), MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", new PlaneSpecifications(1550, 13000, 11000), MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", new PlaneSpecifications(650, 5000, 110000), MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", new PlaneSpecifications(277, 482, 500), ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", new PlaneSpecifications(560, 307, 500), ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET)
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", new PlaneSpecifications(980, 16100, 70500) , 242);

    @Test
    public void testHasAtLeastOneTransportMilitaryPlane() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        Assert.assertFalse(transportMilitaryPlanes.isEmpty());
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void testNextPlaneMaxLoadCapacityIsHigherThanCurrent() {
        Airport airport = new Airport(planes);
        List<? extends Plane> planesByMaxLoadCapacity = new ArrayList<>(planes);
        planesByMaxLoadCapacity.sort(Comparator.comparingInt(plane -> plane.getPlaneSpecifications().getMaxLoadCapacity()));
        Assert.assertEquals(airport.sortByMaxLoadCapacity().getPlanes(), planesByMaxLoadCapacity);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        Assert.assertFalse(bomberMilitaryPlanes.isEmpty());
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        Assert.assertFalse(experimentalPlanes.stream().
                anyMatch(plane -> plane.getClassificationLevel().equals(ClassificationLevel.UNCLASSIFIED)));

    }
}
