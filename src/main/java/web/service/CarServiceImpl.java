package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDaoImp carDAO;

    public CarServiceImpl() {
        this.carDAO = new CarDaoImp();
    }

    @Override
    public List<Car> getNumOfCars(int count) {
        return carDAO.getCarsByNum(count);
    }

}
