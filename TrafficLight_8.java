class TrafficLight_8 {
    private String color;
    private int duration;

    public TrafficLight_8(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    public void display() {
        System.out.println("Color: " + color + ", Duration: " + duration + " sec");
    }

    public static void main(String[] args) {
        TrafficLight_8 t = new TrafficLight_8("Red", 60);
        t.display();

        t.changeColor("Green");
        t.display();

        System.out.println("Is Green? " + t.isGreen());
    }
}
