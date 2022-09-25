package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, 35, "BMW"));
        cars.add(new Car(2, 20, "Audi"));
        cars.add(new Car(3, 10, "Reno"));
        cars.add(new Car(4, 15, "Toyota"));
        cars.add(new Car(5, 8, "Lexus"));
        return cars;
    }

    public List<Car> getCarsList(Integer count) {
        return getCars().stream().limit(count).collect(Collectors.toList());
    }
}