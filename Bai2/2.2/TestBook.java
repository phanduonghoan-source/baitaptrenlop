public class TestBook {
    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Gọi ngầm định javaDummy.toString()

        javaDummy.setPrice(29.95);
        javaDummy.setQty(88);
        System.out.println("Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Qty: " + javaDummy.getQty());

        System.out.println("Author names: " + javaDummy.getAuthorNames());

        System.out.println("Authors details:");
        for (Author a : javaDummy.getAuthors()) {
            System.out.println(a);
        }
    }
}