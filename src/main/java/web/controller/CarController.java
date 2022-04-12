package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String getCarsValue(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", CarServiceImpl.getCountCar(count));
        return "cars";
    }
}
