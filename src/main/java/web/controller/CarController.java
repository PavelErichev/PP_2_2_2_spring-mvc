package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printAllCar(Model model) {
        model.addAttribute("cars",carServiceImpl.index());
        return "cars";
    }
}