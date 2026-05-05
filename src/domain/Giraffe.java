package domain;

public class Giraffe extends Herbivore {

    private String species;

    public Giraffe(String name, int weight, int height, String species) {
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.species=species;
    }

    public Giraffe() {
        this("Jeremy",100,5,"Masai");
    }

    public void move() { System.out.println("Giraffe roams around the savanna..."); }

    @Override
    public String toString() {
        return super.toString()+"\nSpecies:\t"+this.species+"\n\nThis is a Giraffe!";
    }

    @Override
    public void speak() {
        System.out.println("Giraffe hums...");
    }

    @Override
    public void eat() {
        System.out.println("Giraffe munches on some leaves...");
    }
    
    @Override
    public void findPlants() { System.out.println("Giraffe is foraging plants to eat..."); }
}
