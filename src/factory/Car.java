package factory;

public class Car {
    private String name;
    private int seats;

    public Car(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public void build() {
        System.out.println("Fabricado o carro {" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                '}');
    }
}
