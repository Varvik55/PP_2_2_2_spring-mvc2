package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.ServisCars;

@Controller
public class CarsContriller {
    final
    ServisCars servisCars;
    public CarsContriller(ServisCars servisCars) {
        this.servisCars = servisCars;
    }
    @GetMapping("/cars")
    public String carsOpen (@RequestParam (name = "count", required = false, defaultValue = "5") int count, Model model){

        model.addAttribute("cars",servisCars.getListCar(count));
        return "cars";
    }
}
