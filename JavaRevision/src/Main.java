
import java.util.Arrays;
import java.util.*;


public class Main {
    public static void main(String[] args) {

//PERSON
        Person person1 = new Person("Dorah Asiimwe", 11);
        Person person2 = new Person("Sarah Econg", 12);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
//CIRCLE
        Circle circle1 = new Circle(3.1);
        Circle circle2 = new Circle(7);

        System.out.println("Please get area of circle 1" + circle1.getArea());
        System.out.println("Please get circumference of circle 2" + circle2.getCircumference());


//    COLLECTIONS

        Student student1 = new Student(1, "Fulumera", "Doreen");
        Student student2 = new Student(2, "Dina", "Abbo");
        Student student3 = new Student(3, "dera", "Singa");
        Student student4 = new Student(4, "gera", "genad");

        System.out.println("These are fake fulumera's detaills");
        student1.studentDetails();
        student2.studentDetails();
        student3.studentDetails();
        student4.studentDetails();
        System.out.println("Adding the student's courseunits");

        student1.addCourseUnits("Math");
        student1.addCourseUnits("SST");
        student1.addCourseUnits("Science");
        student1.addCourseUnits("English");

        student2.addCourseUnits("Mathematics");
        student2.addCourseUnits("Social Studies");
        student2.addCourseUnits("Science");
        student2.addCourseUnits("Eng");

        System.out.println(student1.getCourse_units() );

        System.out.println("Adding Student's grades");
        System.out.println(student1.getStudent_name() + "'s grades");

        student1.addGrades(100);
        student1.addGrades(90);
        student1.addGrades(80);
        student1.addGrades(70);

        student2.addGrades(100);
        student2.addGrades(100);
        student2.addGrades(40);
        student2.addGrades(100);

        System.out.println(student1.getGrades());

        System.out.println(student2.getGrades());
        System.out.println(student2.getCourse_units());

        System.out.println("Remove a course unit");
        student1.removeCourseUnits("English");
        System.out.println(student1.getCourse_units());

        System.out.println("Updating names of students");
        student1.setStudent_name("Beautiful victory");

        student2.getGrades();
        student1.studentDetails();

        System.out.println("Removing student 1 grades");

//        write a java program to sort a numeric and string array
        String[] names= {"dorah","edna","tina","sarah", "joy"};
        int [] numbers={10,20,3,40,25,16};

        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println("\n SORTING ARRAYS");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\n"+ Arrays.toString(names));

//Write a Java program to sum values of an arra
        int sum=0;

        for (int a:numbers)
        {
            sum+=a;

        };
        System.out.println("\n SUM OF ARRAY VALUES");
        System.out.println("sum is " + sum);

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");

        System.out.println(" J   a   v   v a");
        System.out.println("  J   a a   v  v  a a");
        System.out.println(" J  J  aaaaaa   V  V aaaaa");
        System.out.println(" JJ  a     a V  a    a");

//ARRAYLISTS
//        1. Write a Java program to create an array list, add some colors (strings) and print out the collection

        ArrayList<String>colors=new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Indigo");
        colors.add("Purple");
        colors.add("orange");
        colors.add("violet");
        System.out.println(colors);

//       Write a Java program to iterate through all elements in an array list
//        String color_loop = "";
//        for (String x:colors
//             ) {
//            color_loop+=x;
//
//        }
//        System.out.println("\n Iterating through colors: " + color_loop);

        System.out.println("\n Iterating through colors: ");

        for (String x:colors
             ) {

            System.out.println(x);
        }

//        Write a Java program to insert an element into the array list at the first position
        colors.add(0,"pink");
        System.out.println(colors);

//        Write a Java program to retrieve an element (at a specified index) from a given array list.

        System.out.println("Removing the last element");
        colors.remove(8);
        System.out.println("\n "+ colors);
//        Write a Java program to update an array element by the given element.
        colors.set(0,"Navy blue");
        System.out.println("Updating \n"+ colors);

//        Write a Java program to search for an element in an array list.

        boolean search= colors.contains("Yellow");
        System.out.println("Searching for an element \n "+ search);
        System.out.println(colors.contains("pink"));

//         Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("Sorting Arraylists \n" +colors);

//        Write a Java program to copy one array list into another.
        ArrayList<String>colorCopy= new ArrayList<String>();
        colorCopy.add("A");
        colorCopy.add("B");
        colorCopy.add("C");
        colorCopy.add("G");
        colorCopy.add("F");
        colorCopy.add("E");
        colorCopy.add("D");
        colorCopy.add("H");
        Collections.copy(colors,colorCopy);
        System.out.println("Getting a copy of colors \n " + colorCopy);

//        10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(colorCopy);
        System.out.println("\n Shuffling "+ colorCopy);
//        Write a Java program to reverse elements in an array list.

        ArrayList<Integer>list_numbers= new ArrayList<Integer>();
        list_numbers.add(10);
        list_numbers.add(11);
        list_numbers.add(12);
        list_numbers.add(15);
        list_numbers.add(19);
        list_numbers.add(21);
        Collections.reverse(list_numbers);
        System.out.println("Reversing"+ list_numbers);









    }
}