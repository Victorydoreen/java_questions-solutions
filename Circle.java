//Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.
//each question should have its own class, plus 1 extra class the main class create all instances in the main class
//Circle.java
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    Using getters to retrieve the radius
    public double getRadius() {
        return radius;

    }

//    I have used setters to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateAreaOfCircle() {
        return 3.14 * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}
