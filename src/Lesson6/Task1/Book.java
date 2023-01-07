package Lesson6.Task1;

class Book {
    String parameterName;
    String author;

    public Book(String parameterName, String author) {
        this.parameterName = parameterName;
        this.author = author;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "parameterName='" + parameterName + '\'' +
                ", avtor='" + author + '\'' +
                '}';
    }

}








