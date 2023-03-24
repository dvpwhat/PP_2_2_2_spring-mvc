package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {
    private List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 6, "black"));
        cars.add(new Car("Mazda", 3, "red"));
        cars.add(new Car("Opel", 7, "green"));
        cars.add(new Car("Lada", 2, "blue"));
        cars.add(new Car("drandylet", 1337, "orange"));
    }

    @Override
    public List<Car> getCarsByNum(int count) {
        if (count >= 5) {
            count = 5;
        }
        return cars.stream().limit(count).toList();
    }
}
