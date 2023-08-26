package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = getCars();


    @Override
    public List<Car> getNumOfCars(int count) {
        int carsShow = (count > 0 ? (count < 5 ? count : 5) : 0);
        return carList.subList(0, carsShow);
    }

    public static List<Car> getCars() {
        List<Car> result = new ArrayList<>();

        result.add(new Car("BMW", 6, "black"));
        result.add(new Car("Mazda", 3, "red"));
        result.add(new Car("Opel", 7, "green"));
        result.add(new Car("Lada", 2, "blue"));
        result.add(new Car("drandylet", 1337, "orange"));

        return result;
    }
}
