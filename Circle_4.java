class Circle_4 {
    private double radius;

    public Circle_4(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle_4 c = new Circle_4(4.5);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
