package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CAR_COUNT;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "���", "�5"));
        cars.add(new Car(++CAR_COUNT, "�����", "�����"));
        cars.add(new Car(++CAR_COUNT, "�����", "3.5"));
        cars.add(new Car(++CAR_COUNT, "����", "�����"));
        cars.add(new Car(++CAR_COUNT, "�������", "���������"));
    }

    public List<Car> index(int count) {
        List<Car> carsSublist = null;
        if (count < cars.size()) {
            carsSublist = cars.subList(0, count);
        } else if (count >= cars.size() || count <= 0) {
            carsSublist = cars;
        }
        return carsSublist;
    }

    public Car show(int id) {
        return cars
                .stream()
                .filter(car -> car.getId() == id)
                .findAny().orElse(null);
    }

    public void save(Car car) {
        car.setId(++CAR_COUNT);
        cars.add(car);
    }
}