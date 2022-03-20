package application;

import factory.Car;
import factory.Factory;
import factory.SedanFactory;
import factory.SvuFactory;

public class Program {

    public static void main(String[] args) {
        Order orderSedanA = new Order("A","sedan");
        Factory factory1 = fetchFactory(orderSedanA);
        Car car1 = factory1.create(orderSedanA.getModel());
        car1.build();

        Order orderSedanB = new Order("B","sedan");
        Factory factory2 = fetchFactory(orderSedanB);
        Car car2 = factory2.create(orderSedanB.getModel());
        car2.build();

        Order orderSvuA = new Order("A","svu");
        Factory factory3 = fetchFactory(orderSvuA);
        Car car3 = factory3.create(orderSvuA.getModel());
        car3.build();

        Order orderSvuB = new Order("B","svu");
        Factory factory4 = fetchFactory(orderSvuB);
        Car car4 = factory4.create(orderSvuB.getModel());
        car4.build();
    }

    private static Factory fetchFactory(Order order) {
        if ("sedan".equals(order.getCategory())){
            return new SedanFactory();
        }
        if ("svu".equals(order.getCategory())){
            return new SvuFactory();
        }
        return null;
    }
}
