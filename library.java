// import java.util.Random;
// import java.util.Scanner;
// public class library {
//     int ID;
//     String bookName;
//     String AuthorName;
//     String Category;
//     double Price;
//     int AvailableCopies;

//     public static void main(String[] args) {

//         Scanner in = new Scanner(System.in); 

//         System.out.println("Library Management System");
   
//         System.out.println("Create a new book: " );
        


//         // System.out.print("Enter Book ID: ");
//         // int id = sc.nextInt();
//         Random random = new Random();
//         int randomID = random.nextInt(); 
//         System.out.println("Generated Book ID: " + randomID);
//         in.nextLine(); 

//         System.out.print("Enter Book Name: ");
//         String name = in.nextLine();
        
        



//         System.out.print("Enter Author Name: ");
//         String authorName = in.nextLine();

//         System.out.print("Enter Book Category: ");
//         String category = in.nextLine();

//         System.out.print("Enter Book Price: ");
//         double price = in.nextDouble();

//         System.out.print("Enter Available Copies: ");
//         int availableCopies = in.nextInt();

//         library book = new library();
//         book.ID = randomID;
//         book.bookName = name;
//         book.AuthorName = authorName;
//         book.Category = category;
//         book.Price = price;
//         book.AvailableCopies = availableCopies;

//         System.out.println("\nBook Created Successfully!");
//         System.out.println("Book ID: " + book.ID);
//         System.out.println("Book Name: " + book.bookName);
//         System.out.println("Author Name: " + book.AuthorName);
//         System.out.println("Category: " + book.Category);
//         System.out.println("Price: $" + book.Price);
//         System.out.println("Available Copies: " + book.AvailableCopies);
//     }

//     }
// class book{

//  class Book {
//     String name;

//     Book(String name) {
//         if (name == null || name.trim().isEmpty()) {
//             this.name = "Unknown Book";
//         } else {
//             this.name = name;
//         }
//     }


// }
// }
 










class library {

    private static int counter = 1000;

    private int id;
    private String name;
    private String author;
    private String category;
    private double price;
    private int copies;

    library(String name,
            String author,
            String category,
            double price,
            int copies) {

        this.id = ++counter;

        this.name = name.trim().isEmpty() ? "Unknown Book" : name.trim();

        this.author = author.trim().isEmpty() ? "Unknown Author" : author.trim();

        this.category = category;

        this.price = Math.max(price, 0);

        this.copies = Math.max(copies, 0);

    }

    void display() {

        System.out.println(id + " "
                + name + " "
                + author + " "
                + price + " "
                + copies);
    }

    boolean isAvailable() {

        return copies > 0;

    }

    void borrowBook() {

        if (copies > 0) {

            copies--;

        }
    }

    void returnBook() {

        copies++;

    }

    void updatePrice(double price) {

        if (price >= 0)

            this.price = price;

    }

    double inventoryValue() {

        return price * copies;

    }

    String getName() {

        return name;

    }

    String getAuthor() {

        return author;

    }

    double getPrice() {

        return price;

    }


public static void main(String[] args) {
    library book = new library("THE LIFE", "Atharv Kharat", "Imaginary", 900, 10);
    book.display();
    System.out.println(book.isAvailable());

    book.borrowBook();

    book.updatePrice(1000.00);

    book.inventoryValue();
}
}