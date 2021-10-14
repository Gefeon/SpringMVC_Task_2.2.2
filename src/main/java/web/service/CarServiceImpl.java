package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao dao;

    @Autowired
    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getAllCars();
    }

    @Override
    public List<Car> getCertainNumberOfCars(int number) {
        return dao.getCertainNumberOfCars(number);
    }
}
