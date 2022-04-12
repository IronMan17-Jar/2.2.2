package service;

import model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Toyota", 1, 2001));
        cars.add(new Car("BMW", 3, 2010));
        cars.add(new Car("Mercedes", 5, 2015));
        cars.add(new Car("Lada", 2, 2012));
        cars.add(new Car("KIA", 6, 2013));
    }

    public static List<Car> getCountCar(Integer count) {
        if (count == null || count == 0) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
