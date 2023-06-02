//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their
// attributes using the constructor, and print their name and age.

public class Person {

    String name;
    int age;

    public Person(String name, int age){
//        setting initial values
        this.name = name;
        this.age = age;

    }

    public static void main(String [] args){
//        instance1 of the person class
        Person myPerson1= new Person("debbie", 23);
        //    setting attributes of the instances using a constructor

//        instance2 of the person class
        Person myPerson2 =new Person("Anita", 16);
//    setting attributes of the instances using a constructor


        System.out.println("my name is " + myPerson1.name + " I am " + myPerson1.age + " years old");
        System.out.println("My name is " +  myPerson2.name + " I am " +  myPerson2.age + " years old");


    }
}
//final keyword when using private modifier-- means we are not making any changes to the class
//the this keyword-refers to the current object in amethod/constructor, like the self keyword
// this can be used to invoke current class,invoke current method, return current class object, pass an argument in a method
