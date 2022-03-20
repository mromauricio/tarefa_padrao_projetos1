package factory;

public class SvuFactory extends Factory{

    @Override
    Car selectCar(String model) {
        switch (model){
            case "A":{
                return new Duster("Duster",5);
            }
            case "B":{
                return new Trailblazer("Trailblazer",7);
            }
            default:{
                return null;
            }
        }
    }
}
