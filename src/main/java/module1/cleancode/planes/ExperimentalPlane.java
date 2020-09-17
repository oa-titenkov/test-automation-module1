package module1.cleancode.planes;

import module1.cleancode.models.ClassificationLevel;
import module1.cleancode.models.ExperimentalType;

public class ExperimentalPlane extends Plane {

    private ClassificationLevel classificationLevel;
    private ExperimentalType type;

    public ExperimentalPlane(String model, PlaneSpecifications planeSpecifications, ExperimentalType type, ClassificationLevel classificationLevel) {
        super(model, planeSpecifications);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalType getType() {
        return type;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
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
