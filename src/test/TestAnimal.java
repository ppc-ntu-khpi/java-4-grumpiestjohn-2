package test;

import domain.Giraffe;

public class TestAnimal {

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe("Marty", 90, 4, "Northern");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.speak();
        giraffe.findPlants();
        giraffe.move();
    }
}
