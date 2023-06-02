
//static and public classes
//public class User {
//    String name="Dora";
//    String age="12";
//    String height="2m ";
//
//    static void myMethod(){
//        System.out.println("Hello you're welcome");
//
//    }
//    public String yourAge( String a){
//        a="Do you like Java?";
//        return a;
//    }
//
//    public static void main (String [] args){
//        User user1= new User();
//         myMethod();
//          System.out.println(user1.yourAge("oh my Holy spirit"));
//
//    }
//}
//public class User{
//    public static void main (String [] args){
//        int age=12;
//         System.out.println(age);
//    }
//}


public class User {
    // Fields,attributes or properties of an object
//    If you don't want the ability to override existing values, declare the attribute as final:
//    The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
//    The final keyword is called a "modifier".
    static void myMethod(){
        System.out.println("This is my method");
    }

    final String name = "Dora";
    String age = "12";
    String height = "2m ";
    public static void main(String [] args){
        myMethod();
        User user_a= new User();
        User user_b=new User();
//        changing the value of an attribute
        user_a.age="25";
//        user_b.name = "Victory";
        // will generate an error: cannot assign a value to a final variable
        System.out.println("My name is "+ user_a.name);
        System.out.println("My name is "+ user_b.name);
        System.out.println("Iam "+ user_a.age  + " years old");
        System.out.println("I am "+ user_a.height + "tall");
    }

}
