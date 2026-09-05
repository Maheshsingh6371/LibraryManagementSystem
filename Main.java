import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        boolean running = true;

        while (running) {
            
            System.out.println("=====LIBRARY MANAGEMENT SYSTEM=====");
            System.out.println("1. Add Book ");
            System.out.println("2. Display Books ");
            System.out.println("3. Search Book ");
            System.out.println("4. Borrow Book ");
            System.out.println("5. Return Book ");
            System.out.println("6. Exit ");

            System.out.println("Enter your choice");
            int choice = input.nextInt();

            switch (choice) {


                case 1:
                    System.out.println("enter book id: ");

                    int id = input.nextInt();

                    input.nextLine();
                    boolean idExist = false;
                    for (Book e : books) {
                        if (e.id==id) {
                            idExist = true;
                            break;
                        }

                        
                    }
                    if (idExist) {
                        System.out.println("Book_id already exist in the records");
                    } else {
                        System.out.println("Enter the book title: ");

                    String title = input.nextLine();


                    System.out.println("Enter the author name: ");

                    String author = input.nextLine();


                    System.out.println("Is the book available");

                    boolean available = input.nextBoolean();


                    Book book = new Book(id, title, author, available);


                    books.add(book);
                    System.out.println("Book added successfully");



                    }
                    break;


                    case 2:
                        System.out.println("====Displaying Book Details====");

                        if (books.isEmpty()) {
                            System.out.println("No book is available");
                        } else {
                            for (int i=0; i<books.size(); i++) {
                            books.get(i).displayBook();
                            System.out.println("----------------");
                        }

                        }
                        
                        break;

                        case 3:
                            System.out.println("Enter the book id you want to search");
                            int searchId = input.nextInt();

                            boolean found = false;

                            for (Book b : books) {
                                if (b.id == searchId) {
                                    System.out.println("Book is found");
                                    b.displayBook();
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("The book is not avilable in Library");
                            }
                            break;

                            case 4:
                                System.out.println("Enter the book_ID you want to borrow");
                                int borrowId = input.nextInt();

                                found = false;
                                for (Book c: books) {
                                    if(c.id == borrowId) {
                                        if (c.available) {
                                            c.available = false;
                                            System.out.println("Book has been successfully borrowed");

                                        } else {
                                            System.out.println("The book is already borrowed");
                                        }
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Book not found");
                                }


                                break;

                                case 5:
                                    System.out.println("Enter the bookId you want to return");
                                    int returnId = input.nextInt();

                                    found = false;

                                    for (Book d : books) {
                                        if (d.id == returnId) {
                                            if (d.available == false) {
                                                d.available = true;
                                                System.out.println("You have returned the book successfully");
                                            } else {
                                                System.out.println("Book is already returned previously");
                                            }
                                            found = true;

                                        }
                                    }
                                    if (!found) {
                                        System.out.println("BookId not found");
                                    }

                                    break;

                                    case 6:
                                        running = false;
                                    
                                        System.out.println("Thank you for using Library Management System! ");
                                        break;


                                        default:

                                        
                                            System.out.println("Invalid choice! ");



                

            }
            
        }
    }
} 