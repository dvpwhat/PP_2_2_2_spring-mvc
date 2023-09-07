package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getNumOfCars(int count) {
        return getCars().stream().limit(count).collect(Collectors.toList());
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
