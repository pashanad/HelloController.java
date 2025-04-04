package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import service.CarService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars/{count}")
    public String getCars(@PathVariable int count, Model model) {
        List<Car> carService = new CarService().getCars(count);
        model.addAttribute("carService", carService);
        return "cars";
    }

    @GetMapping("/cars")
    public String getAllCars(Model model){
        List<Car> carService = new CarService().getAllCars();
        model.addAttribute("carService",carService);
        return "cars";
    }
}

