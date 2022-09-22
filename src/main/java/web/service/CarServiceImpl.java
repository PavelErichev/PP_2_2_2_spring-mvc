package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(1, 35, "BMW"));
        car.add(new Car(2, 20, "Audi"));
        car.add(new Car(3, 10, "Reno"));
        car.add(new Car(4, 15, "Toyota"));
        car.add(new Car(5, 8, "Lexus"));
    }

    public List<Car> index() {
        return car;
    }

}