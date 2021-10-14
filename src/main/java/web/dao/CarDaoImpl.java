package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Car", 1, "V4"));
        cars.add(new Car("Car", 2, "V6"));
        cars.add(new Car("Car", 3, "V8"));
        cars.add(new Car("Car", 4, "V12"));
        cars.add(new Car("Car", 5, "W12"));
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getCertainNumberOfCars(int number) {
        return Collections.unmodifiableList(cars.subList(0, number));
    }
}
