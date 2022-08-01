package web.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import web.dao.CarDAO;
import web.models.Car;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carDAO.getCars();
        } else {
            return carDAO.getCars().stream().limit(count).collect(Collectors.toList());
        }
    }
}
