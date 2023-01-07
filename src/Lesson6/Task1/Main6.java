package Lesson6.Task1;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//7. Разработать программу, в которой создается массив объектов данного класса.

//8. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
// "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book
// (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В.
// взял книги: Приключения, Словарь, Энциклопедия".

//9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В.
// вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

import org.w3c.dom.ls.LSOutput;

class Main {

    public static void main(String[] args) {
        Reader student = new Reader("Петров в.в.",
                545,
                "med",
                25,
                7658432);
        System.out.println(student);


        student.takeBook("Петров В.В.", "Словарь");
        student.returnBook("Петров В.В.", "Приключения");


        String[] stringArray = {"surname", "number", "faculty", "age", "phone"};
        for (String theString : stringArray) {
            System.out.println(theString);
        }
        student.takeBook("Петров В.В.", 3);


        String[] books = {"Приключения", "Словарь", "Энциклопедия"};
        student.takeBook("Петров В.В.", books);

        student.returnBook("Петров В.В.", 3);

        Book lit1 = new Book("Приключения", "Ж.Верн");
        Book lit2 = new Book("Словарь", "Киселев Б.В.");
        Book lit3 = new Book("Энциклопедия", "Петровский Б.В");

        System.out.println(lit1);
        System.out.println(lit2);
        System.out.println(lit3);

        student.returnBook("Петров В.В.", books);

    }
}

