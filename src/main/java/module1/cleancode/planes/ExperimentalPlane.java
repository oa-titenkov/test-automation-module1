package module1.cleancode.planes;

import module1.cleancode.models.ClassificationLevel;
import module1.cleancode.models.ExperimentalType;

import java.util.Objects;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return classificationLevel == that.classificationLevel &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classificationLevel, type);
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + model + '\'' +
                "type='" + type + '\'' +
                "planeSpecifications='" + planeSpecifications + '\'' +
                '}';
    }
}
