package factory;

public class SedanFactory extends Factory{

    @Override
    Car selectCar(String model) {
        switch (model){
            case "A":{
                return new Logan("Logan",5);
            }
            case "B":{
                return new Corsa("Corsa",5);
            }
            default:{
                return null;
            }
        }
    }
}
