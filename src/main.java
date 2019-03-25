import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<Car> cars = Read.listLoader();
        Car car=cars.get(5);
        System.out.println(car.getModel());
    }
}
