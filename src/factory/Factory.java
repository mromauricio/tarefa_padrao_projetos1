package factory;

public abstract class Factory {

    public Car create(String model){
        Car car = selectCar(model);
        return car;
    }

    abstract Car selectCar(String model);
}
