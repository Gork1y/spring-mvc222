package web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import web.models.Car;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(UUID.randomUUID(), "���", "�5"));
        cars.add(new Car(UUID.randomUUID(), "�����", "�����"));
        cars.add(new Car(UUID.randomUUID(), "�����", "3.5"));
        cars.add(new Car(UUID.randomUUID(), "����", "�����"));
        cars.add(new Car(UUID.randomUUID(), "�������", "���������"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}