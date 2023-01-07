public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("AAA", "BBB", "CCC", 2000);
        Book book2 = new Book("BBB", "CCC", "DDD", 2002);
        Book book3 = new Book("AAA", "BBB", "CCC", 2000);
        String[] books = new String[3];
        books[0] = book1.toString();
        books[1] = book2.toString();
        books[2] = book3.toString();

        System.out.println(books[0]);
        System.out.println(books[1]);
        System.out.println(books[2]);
        System.out.println(books[0] + " i " + books[1]);
        System.out.println(book1==book2);
        System.out.println(book1.equals(book2));
        System.out.println(books[1] + " i " + books[2]);
        System.out.println(book2==book3);
        System.out.println(book2.equals(book3));
        System.out.println(books[0] + " i " + books[2]);
        System.out.println(book1==book3);
        System.out.println(book1.equals(book3));

    }

}
