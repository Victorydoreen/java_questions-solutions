public class Main {
    public static void main(String []args){
//    Question4    Circle
        double radius=7;
        Circle Circle1=new Circle(radius);

        //        variable that stores the result of the area of the circle
        double areaOfCircleResult= Circle1.calculateAreaOfCircle();

        //        variable storing the result of the circumference of the circle
        double circumferenceOfCircleResult=Circle1.calculateCircumference();

// Question5 Book
        Library library = new Library();

        Book book1 = new Book("Church shift","Sunday Adelaje", "1-4028-9462-7");
        Book book2 = new Book("Good morning Holy spirit","Ps Benny Hinn",  "978-1-4028-9462-6");
        Book book3 = new Book("Hello love","Dora Victory", "978-1-4028-9462-6");
        Book book4 = new Book("Honor","Moses Mukisa","958-1-1128-9232-5");
        Book book5= new Book("Seven principles to be effective", "John C Maxwell", "1-4008-5642-7");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


//        Question 6 Employee
        Employee employee1 = new Employee("Nakitende Leticia", "CEO", 5_000_000);
        Employee employee2 = new Employee("Rovence Kabahinda", "Programs lead", 3_000_000);
        Employee employee3 = new Employee("Nakidde Nicole", "Admin", 3_500_000);
        Employee employee4 = new Employee("Waks Kenneth", "IT", 4_000_000);
        Employee employee5 = new Employee("Nabatanzi Gorret", "Tutor", 2_500_000);

        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee3.printEmployeeDetails();
        employee4.printEmployeeDetails();
        employee5.printEmployeeDetails();



        employee1.raiseSalary(10);
        employee2.raiseSalary(15);
        employee3.raiseSalary(2);
        employee4.raiseSalary(10);
        employee5.raiseSalary(50);



//        BOOK

        System.out.println("Books in the library:");
//        we used the for loop to loop through our arraylist, so we are to get the books title and its author
        for (Book book: library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        for (Book book: library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }


//        CIRCLE
        System.out.println("Area of a circle "  + areaOfCircleResult);
        System.out.println("Circumference of a circle "  + circumferenceOfCircleResult);



//        EMPLOYEE

        System.out.println("\nAfter raising salary:");

        System.out.println("\n10% for 'Leticia':");
        employee1.printEmployeeDetails();

        System.out.println("\n15% for 'Rovence':");
        employee2.printEmployeeDetails();

        System.out.println("\n2% for 'Nicole ':");
        employee3.printEmployeeDetails();

        System.out.println("\n10% for 'Kenneth':");
        employee4.printEmployeeDetails();
        System.out.println("\n50% for 'Gorret':");
        employee5.printEmployeeDetails();


    }
}

