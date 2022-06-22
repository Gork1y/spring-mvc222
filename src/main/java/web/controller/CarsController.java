package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.DAO.CarDAO;
import web.models.Car;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", required = false, defaultValue = "100000") int count, Model model) {
        model.addAttribute("cars", carDAO.index(count));
        return "cars/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carDAO.show(id));
        return "cars/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("car") Car car) {
        return "cars/new";
    }

    @PostMapping
    public String create(@ModelAttribute("car") Car car) {
        carDAO.save(car);
        return "redirect:/cars";
    }

//    @GetMapping("/")
//    public String someCars(@RequestParam(value = "count", required = false) int count, Model model) {
//        model.addAttribute("carsSublist",carDAO.showSomeCars(count));
//        return "cars/somecars";
//    }
}