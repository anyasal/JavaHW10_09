import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
//public class Program10_09 {
    //1. Класс "Человек"
        /*private String name;
        private int age;
        private String gender;
        public Program10_09(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        }
        public void increaseAge() {
            age++;
        }
        public void changeName(String newName) {
            this.name = newName;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public static void main(String[] args) {
            Program10_09 person = new Program10_09("John Doe", 30, "Male");
            person.displayInfo();

            System.out.println("\nIncreasing age...");
            person.increaseAge();
            person.displayInfo();

            System.out.println("\nChanging name...");
            person.changeName("Jane Doe");
            person.displayInfo();
        }*/
    //2. Наследование: Класс "Работник" и "Менеджер"
/*public class Program10_09 {
    private String name;
    private int age;
    public Program10_09() {
    }
    public Program10_09(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter manager's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter manager's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter manager's salary: ");
        double salary = scanner.nextDouble();
        Manager manager = new Manager(name, age, salary);
        System.out.print("Enter number of subordinates: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter subordinate " + (i + 1) + " name:");
            String subName = scanner.nextLine();
            System.out.println("Enter subordinate " + (i + 1) + " age:");
            int subAge = scanner.nextInt();
            System.out.println("Enter subordinate " + (i + 1) + " salary:");
            double subSalary = scanner.nextDouble();
            Worker subordinate = new Worker(subName, subAge, subSalary);
            manager.addSubordinate(subordinate);
        }
        System.out.println("Manager: " + manager);
        for (Worker subordinate : manager.getSubordinates()) {
            System.out.println("Subordinate: " + subordinate);
        }
    }
}*/
//3. Полиморфизм: Животные
    /*interface Animal {
        void makeSound();
    }
    public class Program10_09{
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}*/
//4. Абстрактный класс "Транспорт"
/*abstract class Transport {
    public abstract void move();
}
class Car extends Transport {
    @Override
    public void move() {
        System.out.println("Car is moving on 4 wheels.");
    }
}
class Bike extends Transport {
    @Override
    public void move() {
        System.out.println("Bike is moving on 2 wheels.");
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.move(); // Output: Car is moving on wheels.
        bike.move(); // Output: Bike is moving on two wheels.
    }
}*/
//5. Класс "Книга" и "Библиотека"
/*class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Book1", "Author1", 2000));
        library.addBook(new Book("Book2", "Author2", 2010));
        library.addBook(new Book("Book3", "Author1", 2020));
        System.out.println("All books:");
        library.displayBooks();
        System.out.println("\nBooks by Author1:");
        List<Book> booksByAuthor1 = library.searchByAuthor("Author1");
        for (Book book : booksByAuthor1) {
            System.out.println(book);
        }
        System.out.println("\nBooks published in 2010:");
        List<Book> booksByYear2010 = library.searchByYear(2010);
        for (Book book : booksByYear2010) {
            System.out.println(book);
        }
    }
}*/
//6. Инкапсуляция: Банк
/*class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 1000.0);
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Initial balance: " + myAccount.getBalance());
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
        myAccount.withdraw(1500.0);
        System.out.println("Balance after failed withdrawal: " + myAccount.getBalance());
    }
}*/
//7. Счетчик объектов
/*class Counter {
    private static int count = 0;
    public Counter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println("Number of Counter objects created: " + Counter.getCount());
    }
}*/
//8. Площадь фигур
/*abstract class Shape {
    public abstract double getArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.printf("Circle area: %.2f%n", circle.getArea());
        System.out.printf("Rectangle area: %.2f%n", rectangle.getArea());
    }
}*/
//9. Наследование: Животные и их движения
/*class Animal {
    public void move() {
        System.out.println("Animal is moving.");
    }
}
class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish is swimming.");
    }
}
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird is flying.");
    }
}
class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dog is running.");
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal bird = new Bird();
        Animal dog = new Dog();

        fish.move();
        bird.move();
        dog.move();
    }
}*/
//10. Работа с коллекциями: Университет
/*class Student {
    String name;
    String group;
    double grade;
    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", группа='" + group + '\'' +
                ", балл=" + grade +
                '}';
    }
}
class University {
    private List<Student> students;
    public University() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
    }
    public void filterByGrade(double minGrade) {
        students.removeIf(student -> student.getGrade() < minGrade);
    }
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student("Alice", "A1", 85.5));
        university.addStudent(new Student("Bob", "B2", 90.0));
        university.addStudent(new Student("Charlie", "A1", 78.5));
        university.addStudent(new Student("David", "B2", 82.0));
        System.out.println("Исходный список студентов:");
        university.displayStudents();
        university.sortByName();
        System.out.println("\nСтуденты, отсортированные по имени:");
        university.displayStudents();
        university.filterByGrade(80.0);
        System.out.println("\nтуденты с оценкой >= 80.0:");
        university.displayStudents();
    }
}*/
//11. Класс "Магазин"
/*class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "название='" + name + '\'' +
                ", цена=" + price +
                ", кол-во=" + quantity +
                '}';
    }
}

class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
    }

    public Product findProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("Яблоко", 50, 100));
        store.addProduct(new Product("Банан", 100, 200));
        store.addProduct(new Product("Вишня", 110, 50));
        System.out.println("Исходный список продуктов:");
        store.displayProducts();
        store.removeProduct("банан");
        System.out.println("\nПродукты после удаления 'Банан':");
        store.displayProducts();
        Product foundProduct = store.findProduct("яблоко");
        if (foundProduct != null) {
            System.out.println("\nНайденный продукт:" + foundProduct);
        } else {
            System.out.println("\nПродукт не найден.");
        }
    }
}*/
//12. Интерфейс "Платежная система"
/*interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements PaymentSystem {
    private String cardNumber;
    private String cardHolder;
    private double balance;
    public CreditCard(String cardNumber, String cardHolder, double balance) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.balance = balance;
    }
    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Платеж на сумму $" + amount + " успешно выполнен с использованием кредитной карты.");
        } else {
            System.out.println("Недостаточно средств на кредитной карте.");
        }
    }
    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Платеж на сумму  $" + amount + " Возврат средств на кредитную карту.");
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardHolder() {
        return cardHolder;
    }
    public double getBalance() {
        return balance;
    }
}
class PayPal implements PaymentSystem {
    private String email;
    private double balance;
    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }
    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Платеж на сумму  $" + amount + "успешно выполнен с использованием PayPal.");
        } else {
            System.out.println("Недостаточно средств на счете PayPal.");
        }
    }
    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Платеж на сумму  $" + amount + " Возврат средств на счет PayPal.");
    }
    public String getEmail() {
        return email;
    }
    public double getBalance() {
        return balance;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "John Doe", 1000.0);
        PayPal payPal = new PayPal("john.doe@example.com", 500.0);
        creditCard.pay(200.0);
        System.out.println("Credit Card Balance: $" + creditCard.getBalance());
        payPal.pay(150.0);
        System.out.println("PayPal Balance: $" + payPal.getBalance());
        creditCard.refund(50.0);
        System.out.println("Credit Card Balance: $" + creditCard.getBalance());
        payPal.refund(75.0);
        System.out.println("PayPal Balance: $" + payPal.getBalance());
    }
}*/
//13. Генерация уникальных идентификаторов
//вариант1 по порядку
/*class UniqueID {
    private static int counter = 0;

    public static int generateID() {
        return ++counter;
    }
}
class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) {
        this.id = UniqueID.generateID();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    public void increaseAge() {
        age++;
    }
    public void changeName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "Male");
        Person person2 = new Person("Jane Smith", 25, "Female");
        System.out.println("Person 1 Info:");
        person1.displayInfo();
        System.out.println("\nPerson 2 Info:");
        person2.displayInfo();
    }
}*/
//Вариант2 с рандомом
/*import java.util.HashSet;
import java.util.Random;
import java.util.Set;
class UniqueID {
    private static Set<Integer> usedIDs = new HashSet<>();
    private static Random random = new Random();
    public static int generateID() {
        int id;
        do {
            id = random.nextInt(1000000); // Генерируем случайный ID в диапазоне от 0 до 999999
        } while (usedIDs.contains(id)); // Проверяем, не использовался ли уже этот ID
        usedIDs.add(id); // Добавляем ID в множество использованных ID
        return id;
    }
}
//для примера
class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) {
        this.id = UniqueID.generateID();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    public void increaseAge() {
        age++;
    }
    public void changeName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "Male");
        Person person2 = new Person("Jane Smith", 25, "Female");
        System.out.println("Person 1 Info:");
        person1.displayInfo();
        System.out.println("\nPerson 2 Info:");
        person2.displayInfo();
    }
}*/
//14. Класс "Точка" и "Прямоугольник"
/*class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Rectangle {
    private Point topLeft;
    private Point bottomRight;
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public int calculateArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
    public Point getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    public Point getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Point topLeft = new Point(1, 5);
        Point bottomRight = new Point(6, 2);
        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
        System.out.println("Rectangle: " + rectangle);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}*/
//15. Комплексные числа
/*class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum);
        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);
        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product: " + product);
        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient);
    }
}*/
//16. Перегрузка операторов: Матрица
/*class Matrix {
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }
    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов в первой матрице должно быть равно количеству строк во второй матрице.");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        int[][] data1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] data2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        System.out.println("Matrix 1:");
        System.out.println(matrix1);
        System.out.println("Matrix 2:");
        System.out.println(matrix2);
        try {
            Matrix sum = matrix1.add(matrix1); // Перегрузка метода add
            System.out.println("Sum of Matrix 1 and Matrix 1:");
            System.out.println(sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Matrix product = matrix1.multiply(matrix2);
            System.out.println("Product of Matrix 1 and Matrix 2:");
            System.out.println(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}*/
//17. Создание игры с использованием ООП
/*class Weapon {
    private String name;
    private int damage;
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    @Override
    public String toString() {
        return name + " (Ущерб\n: " + damage + ")";
    }
}
class Player {
    private String name;
    private int health;
    private Weapon weapon;
    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    public void attack(Enemy enemy) {
        int damage = weapon.getDamage();
        enemy.takeDamage(damage);
        System.out.println(name + " атаки " + enemy.getName() + " c " + weapon.getName() + " для " + damage + " повреждение.");
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " принимает " + damage + " повреждение. Здоровье: " + health);
    }
    public boolean isAlive() {
        return health > 0;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    @Override
    public String toString() {
        return name + " (Здоровье: " + health + ", Оружие: " + weapon + ")";
    }
}
class Enemy {
    private String name;
    private int health;
    private int damage;
    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public void attack(Player player) {
        player.takeDamage(damage);
        System.out.println(name + " атаки " + player.getName() + " для " + damage + " повреждение.");
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " принимает " + damage + " повреждение. Здоровье: " + health);
    }
    public boolean isAlive() {
        return health > 0;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    @Override
    public String toString() {
        return name + " (Здоровье: " + health + ", повреждение: " + damage + ")";
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 10);
        Weapon axe = new Weapon("Axe", 15);
        Player player = new Player("Hero", 100, sword);
        Enemy enemy = new Enemy("Goblin", 50, 5);
        System.out.println("Player: " + player);
        System.out.println("Enemy: " + enemy);
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }
        if (player.isAlive()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }
}*/
//18. Автоматизированная система заказов
/*class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
class Order {
    private static int orderCounter = 0;
    private int orderId;
    private List<Product> products;
    public Order() {
        this.orderId = ++orderCounter;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public double getTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        for (Product product : products) {
            sb.append("- ").append(product).append("\n");
        }
        sb.append("Total Cost: $").append(getTotalCost()).append("\n");
        return sb.toString();
    }
}
class Customer {
    private String name;
    private List<Order> orders;
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void displayOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
    public String getName() {
        return name;
    }
    public List<Order> getOrders() {
        return orders;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Smartphone", 800.0);
        Product product3 = new Product("Headphones", 200.0);
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product3);
        Order order2 = new Order();
        order2.addProduct(product2);
        order2.addProduct(product3);
        Customer customer = new Customer("John Doe");
        customer.addOrder(order1);
        customer.addOrder(order2);
        customer.displayOrders();
    }
}*/
//19. Наследование: Электроника
/*class Device {
    protected String brand;
    public Device(String brand) {
        this.brand = brand;
    }
    public void turnOn() {
        System.out.println(brand + " device is turning on.");
    }
    public void turnOff() {
        System.out.println(brand + " device is turning off.");
    }
    public String getBrand() {
        return brand;
    }
}
class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }
    public void takePhoto() {
        System.out.println(brand + " smartphone is taking a photo.");
    }
    @Override
    public String toString() {
        return "Smartphone: " + brand;
    }
}
class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }
    public void playVideo() {
        System.out.println(brand + " laptop is playing a video.");
    }
    @Override
    public String toString() {
        return "Laptop: " + brand;
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple");
        Laptop laptop = new Laptop("Dell");
        System.out.println(smartphone);
        smartphone.turnOn();
        smartphone.takePhoto();
        smartphone.turnOff();
        System.out.println();
        System.out.println(laptop);
        laptop.turnOn();
        laptop.playVideo();
        laptop.turnOff();
    }
}*/
//20. Игра "Крестики-нолики"
/*class Player {
    private String name;
    private char symbol;
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public char getSymbol() {
        return symbol;
    }
    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}
class Game {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = new char[3][3];
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        int moves = 0;
        while (!gameOver) {
            printBoard();
            System.out.println(currentPlayer.getName() + ", enter your move (row[1-3] column[1-3]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer.getSymbol();
                moves++;
                if (checkWin(row, col)) {
                    printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    gameOver = true;
                } else if (moves == 9) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }
    private boolean checkWin(int row, int col) {
        return (board[row][0] == currentPlayer.getSymbol() && board[row][1] == currentPlayer.getSymbol() && board[row][2] == currentPlayer.getSymbol()) ||//заполнена ли вся строка row символом текущего игрока. Если все три ячейки в строке содержат символ текущего игрока, то игрок выиграл.
                (board[0][col] == currentPlayer.getSymbol() && board[1][col] == currentPlayer.getSymbol() && board[2][col] == currentPlayer.getSymbol()) ||//заполнен ли весь столбец col символом текущего игрока. Если все три ячейки в столбце содержат символ текущего игрока, то игрок выиграл.
                (row == col && board[0][0] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][2] == currentPlayer.getSymbol()) ||//Проверка главной диагонали( находится ли ход на главной диагонали (где индексы строки и столбца равны, т.е. row == col)
                (row + col == 2 && board[0][2] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][0] == currentPlayer.getSymbol());//Проверка побочной диагонали:( находится ли ход на побочной диагонали (где сумма индексов строки и столбца равна 2, т.е. row + col == 2)
    }
    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Program10_09 {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        Game game = new Game(player1, player2);
        game.play();
    }
}*/