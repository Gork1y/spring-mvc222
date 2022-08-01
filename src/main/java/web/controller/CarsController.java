package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import web.service.CarService;

@Controller
public class CarsController implements CarApi {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String index(int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars/index";
    }
}