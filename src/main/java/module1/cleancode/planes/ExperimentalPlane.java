package module1.cleancode.planes;

import module1.cleancode.models.ClassificationLevel;
import module1.cleancode.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ClassificationLevel classificationLevel;
    private ExperimentalTypes type;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getType() {
        return type;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
