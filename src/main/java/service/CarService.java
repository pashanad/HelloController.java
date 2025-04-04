package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("BMV",2000, "Red"));
        cars.add(new Car("Audi",2020, "Yellow"));
        cars.add(new Car("Honda",2001, "Black"));
        cars.add(new Car("Toyota",2012, "Blue"));
        cars.add(new Car("Lada",1990, "Green"));
    }

    public List<Car> getCars(int count){
        if (count >= cars.size()){
            return new ArrayList<>(cars);
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
