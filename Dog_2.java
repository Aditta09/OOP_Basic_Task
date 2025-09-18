class Dog_2 {
    private String name;
    private String breed;

    public Dog_2(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
    public static void main(String[] args) {
        Dog_2 d1 = new Dog_2("Max", "Bulldog");
        Dog_2 d2 = new Dog_2("Bella", "Beagle");

        d1.setName("Rocky");
        d1.setBreed("Labrador");

        d1.displayInfo();
        d2.displayInfo();
    }
}
