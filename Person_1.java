class Person_1 {
    private String name;
    private int age;

    public Person_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person_1 p1 = new Person_1("Aditta", 20);
        Person_1 p2 = new Person_1("Joya", 35);

        p1.displayInfo();
        p2.displayInfo();
    }
}

