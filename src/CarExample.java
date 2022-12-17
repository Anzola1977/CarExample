import java.util.Objects;
import java.util.Set;

public class CarExample {

    String brand;
    int speed;

    public CarExample(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarExample that = (CarExample) o;
        return speed == that.speed && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed);
    }

    @Override
    public String toString() {
        return "CarExample{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
