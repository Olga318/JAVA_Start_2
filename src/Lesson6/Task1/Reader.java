package Lesson6.Task1;


public class Reader extends Object {

    String surname;
    int number;
    String faculty;
    int age;
    int phone;

    public Reader(String surname,
                  int number,
                  String faculty,
                  int age,
                  int phone) {
        this.surname = surname;
        this.number = number;
        this.faculty = faculty;
        this.age = age;
        this.phone = phone;
    }

    public Reader() {

    }

    @Override
    public String toString() {
        return "Reader{" +
                "surname='" + surname + '\'' +
                ", number=" + number +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public void takeBook(String surname, String book) {
        System.out.printf("Студент %s взял  книгу %s", surname, book);
        System.out.println();
    }

    public void returnBook(String surname, String book) {
        System.out.printf("Студент %s вернул книгу %s", surname, book);
        System.out.println();
    }

    public void takeBook(String surname, int number) {
        System.out.printf("Студент %s взял %s книги", surname, number);
        System.out.println();
    }

    public void takeBook(String surname, String... books) {
        for (String book : books) {
            System.out.printf("Студент %s взял книгу %s\n", surname, book);
        }
    }

    public void returnBook(String surname, int number) {
        System.out.printf("Студент %s вернул  %s книги  ", surname, number);
        System.out.println();
    }

    public void returnBook(String surname, String... books) {
        for (String book : books) {
            System.out.printf("Студент %s вернул книгу %s\n", surname, book);
        }
    }
}







