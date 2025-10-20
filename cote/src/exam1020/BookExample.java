package exam1020;

public class BookExample {
    public static void main(String[] args) {
        Book book1 = new Book("1", "정종훈", "123-4567-890");
        Book book2 = new Book("2", "정종훈", "890-7654-321", 25000);
        Book book3 = new Book("3", "김태화", "235-1203-313", 30000);

        Book[] bookList = new Book[3];
        bookList[0] = book1;
        bookList[1] = book2;
        bookList[2] = book3;
        
        for (Book book : bookList) {
        	System.out.println(book.getTitle());
        }
    }
}
