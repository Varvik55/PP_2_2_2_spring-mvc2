package web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String marca;
    private String model;
    private int age;

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
