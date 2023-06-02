//Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor
// and modify the attributes using the setter methods and print the updated values.
public class Dog {
// Setters are functions used to update the values of attributes for a given class, they must be private
//    we use a camel case


    private String name;
    private String breed;

    public  Dog (String name ){
        this.name = name;

    }
//    public getName(){
//        return String name;
//    }
    public  void setName(String name ){
        this.name = name;

    }
    public void setBreed(String breed){
        this.breed=breed;
    }

    public static void main (String [] args){
        Dog myDog1=new Dog("Maxi");
        myDog1.setName("Scrubby");
        myDog1.setBreed("Germany shepherd");

        Dog myDog2=new Dog("Simba");
        myDog2.setName("poppy");
        myDog2.setBreed("Bull dog");

        System.out.println("Dog1's name is" +  myDog1.name);
        System.out.println("Dog1's breed is" +  myDog1.breed);
        System.out.println("Dog2's name is" +  myDog2.name);
        System.out.println("Dog2's breed is" +  myDog2.breed);





    }
}
