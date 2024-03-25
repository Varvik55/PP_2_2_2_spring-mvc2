package web;

import web.model.Car;
import web.servis.ServisCars;
import web.servis.ServisCarsImp;

public class TestsMain {
    public static void main(String[] args) {
        ServisCars servisCars = new ServisCarsImp();

        servisCars.getListCar(6).stream().forEach(System.out::println);

    }
}
