package web.servis;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public interface ServisCars {
    List<Car> getListCar (int count);
}
