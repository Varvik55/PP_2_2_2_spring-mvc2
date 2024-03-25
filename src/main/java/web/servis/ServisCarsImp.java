package web.servis;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public class ServisCarsImp implements ServisCars{

    private List <Car> listCar = List.of(new Car("Marka1","model1",1)
                                        ,new Car("Marka2","model2",2)
                                        ,new Car("Marka3","model3",3)
                                        ,new Car("Marka4","model4",4)
                                        ,new Car("Marka5","model5",5));
    @Override
    public List<Car> getListCar(int count) {
        if (count <= 5) {
            return listCar.subList(0, count);
        } else {
            return listCar;
        }

    }


}
