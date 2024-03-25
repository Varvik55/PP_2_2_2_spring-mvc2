package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.servis.ServisCars;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsContriller {
    final
    ServisCars servisCars;

    public CarsContriller(ServisCars servisCars) {
        this.servisCars = servisCars;
    }

    @GetMapping("/cars")
    public String carsOpen (HttpServletRequest request, Model model){

        if(request.getParameter("count")==null){
            model.addAttribute("cars",servisCars.getListCar(5));
        }else
        model.addAttribute("cars",servisCars.getListCar(Integer.parseInt(request.getParameter("count"))));
        return "cars";
    }
}
