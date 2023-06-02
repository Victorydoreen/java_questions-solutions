//. Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.
public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public  int calculateArea(){
        return width * height;
    };
    public int calculatePerimeter(){
        return 2*width + 2*height;
    };
    public static void main(String[]args){
//        creating instances of a class
        Rectangle rectangle1=new Rectangle(12,10);
        Rectangle rectangle2=new Rectangle(1,100);

        System.out.println("The area of the rectangle = " + rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle = " + rectangle2.calculatePerimeter());

    }
}
