class Rectangle_3 {
    private double width;
    private double height;

    public Rectangle_3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle_3 rect = new Rectangle_3(5, 3);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
