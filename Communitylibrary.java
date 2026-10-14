import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Communitylibrary {
    // Display all books
    static void displayBooks(String[] books, int[] years, double[] ratings) {
        System.out.println("Books available in the library:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " (Year: " + years[i] + ", Rating: " + ratings[i] + ")");
        }
    }

    // search for books
    static int searchBook(String[] books, String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + books[i]);
                return i;
            }
        }
        return -1;
    }

    // Calculate average rating
    static double AverageRating(double[] ratings) {
        double sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i];
        }
        return sum / ratings.length;
    }

    // Display message
    static void showMessage(String message) {
        System.out.println(message);
    }

    static void showMessage(String message1, String message2) {
        System.out.println(message1);
        System.out.println(message2);
    }

    // Sort books by year
    static void sortBooksByYear(String[] books, int[] years, double[] ratings) {
        for (int i = 0; i < years.length - 1; i++) {
            for (int j = 0; j < years.length - i - 1; j++) {
                if (years[j] > years[j + 1]) {
                    int tempYear = years[j];
                    years[j] = years[j + 1];
                    years[j + 1] = tempYear;

                    String tempBook = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tempBook;

                    double tempRating = ratings[j];
                    ratings[j] = ratings[j + 1];
                    ratings[j + 1] = tempRating;
                }
            }
        }
        System.out.println("\nBooks sorted by publication year:");
    }

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);

        String[] books = {
            "To Kill a Mockingbird",
            "1984",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye"
        };

        int[] years = {1990, 2009, 2008, 2007, 1997};
        double[] ratings = {4.5, 4.8, 5.6, 6.9, 6.7};

        int[][] borrowing = new int[3][5];
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Sort books by year");
            System.out.println("6. Calculate average rating");
            System.out.println("7. Display borrowing records");
            System.out.println("8. Exit");
            System.out.println("9. CO5 demonstration");
            System.out.println("10. CO6 demonstration");
            System.out.print("Enter your choice: ");

            choice = ss.nextInt();
            ss.nextLine();

            switch (choice) {
                case 1:
                    displayBooks(books, years, ratings);
                    break;

                case 2:
                    System.out.print("Enter book name to search: ");
                    String key = ss.nextLine();

                    int position = searchBook(books, key);

                    if (position != -1) {
                        System.out.println("Book found!");
                        System.out.println("Position: " + (position + 1));
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter member number (1-3): ");
                    int member = ss.nextInt();

                    System.out.print("Enter book number (1-5): ");
                    int book = ss.nextInt();

                    if (member >= 1 && member <= 3 && book >= 1 && book <= 5) {
                        if (borrowing[member - 1][book - 1] == 0) {
                            borrowing[member - 1][book - 1] = 1;
                            showMessage("Book borrowed successfully.");
                        } else {
                            System.out.println("This book is already borrowed.");
                        }
                    } else {
                        System.out.println("Invalid member or book number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter member number (1-3): ");
                    member = ss.nextInt();

                    System.out.print("Enter book number (1-5): ");
                    book = ss.nextInt();

                    if (member >= 1 && member <= 3 && book >= 1 && book <= 5) {
                        if (borrowing[member - 1][book - 1] == 1) {
                            borrowing[member - 1][book - 1] = 0;
                            showMessage("Book returned successfully.", "Thank you!");
                        } else {
                            System.out.println("This book was not borrowed.");
                        }
                    } else {
                        System.out.println("Invalid member or book number.");
                    }
                    break;

                case 5:
                    sortBooksByYear(books, years, ratings);
                    displayBooks(books, years, ratings);
                    break;

                case 6:
                    double average = AverageRating(ratings);
                    System.out.printf("Average Book Rating: %.2f%n", average);
                    break;

                case 7:
                    System.out.println("\n--- Borrowing Records ---");
                    for (int i = 0; i < borrowing.length; i++) {
                        System.out.print("Member " + (i + 1) + ": ");
                        for (int j = 0; j < borrowing[i].length; j++) {
                            System.out.print(borrowing[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    System.out.println("Thank you for using the library system!");
                    break;

                case 9:
                    demonstrateCO5(books, years, ratings);
                    break;

                case 10:
                    demonstrateCO6(books, years, ratings);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);

        ss.close();
    }

    // Interface
    interface LibraryOperations {
        void borrowBook();
        void returnBook();
    }

    // Parent Class
    static class Book implements Comparable<Book> {
        private String title;
        private int year;
        private double rating;

        static int totalBooks = 0;
        static final String LIBRARY_NAME = "Community Library";

        Book() {
            this.title = "Unknown";
            this.year = 0;
            this.rating = 0.0;
            totalBooks++;
        }

        Book(String title, int year, double rating) {
            this.title = title;
            this.year = year;
            this.rating = rating;
            totalBooks++;
        }

        Book(String title, int year) {
            this.title = title;
            this.year = year;
            this.rating = 0.0;
            totalBooks++;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public double getRating() {
            return rating;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Year: " + year);
            System.out.println("Rating: " + rating);
        }

        public static void displayTotalBooks() {
            System.out.println("Total Books: " + totalBooks);
        }

        @Override
        public String toString() {
            return title + " (Year: " + year + ", Rating: " + rating + ")";
        }

        @Override
        public int compareTo(Book other) {
            return String.CASE_INSENSITIVE_ORDER.compare(this.title, other.title);
        }
    }

    // EBook IS-A Book
    static class EBook extends Book {
        private double fileSize;

        EBook(String title, int year, double rating, double fileSize) {
            super(title, year, rating);
            this.fileSize = fileSize;
        }

        @Override
        public void displayDetails() {
            System.out.println("E-Book Details:");
            System.out.println("Title: " + getTitle());
            System.out.println("Year: " + getYear());
            System.out.println("Rating: " + getRating());
            System.out.println("File Size: " + fileSize + " MB");
        }
    }

    // PrintedBook IS-A Book
    static class PrintedBook extends Book {
        private int pages;

        PrintedBook(String title, int year, double rating, int pages) {
            super(title, year, rating);
            this.pages = pages;
        }

        @Override
        public void displayDetails() {
            System.out.println("Printed Book Details:");
            System.out.println("Title: " + getTitle());
            System.out.println("Year: " + getYear());
            System.out.println("Rating: " + getRating());
            System.out.println("Pages: " + pages);
        }
    }

    class LibraryMember implements LibraryOperations {
        private String memberName;
        private int memberId;

        LibraryMember(String memberName, int memberId) {
            this.memberName = memberName;
            this.memberId = memberId;
        }

        @Override
        public void borrowBook() {
            System.out.println(memberName + " (ID: " + memberId + ") borrowed a book.");
        }

        @Override
        public void returnBook() {
            System.out.println(memberName + " (ID: " + memberId + ") returned a book.");
        }
    }

    // Custom checked exception
    static class BookNotAvailableException extends Exception {
        BookNotAvailableException(String message) {
            super(message);
        }
    }

    static void checkBookAvailability() throws BookNotAvailableException {
        boolean available = false;
        if (!available) {
            throw new BookNotAvailableException("Requested book is not available.");
        }
    }

    static List<Book> createBookList(String[] titles, int[] years, double[] ratings) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            result.add(new Book(titles[i], years[i], ratings[i]));
        }

        return result;
    }

    static void demonstrateCO5(String[] titles, int[] years, double[] ratings) {
        System.out.println("\n=== CO5: Strings, sorting/searching, and file I/O ===");

        String sample = titles[0];
        System.out.println("String: " + sample);
        System.out.println("Length: " + sample.length());
        System.out.println("Uppercase: " + sample.toUpperCase());
        System.out.println("Contains 'Kill': " + sample.contains("Kill"));
        System.out.println("Original string remains: " + sample);

        String[] sortedTitles = Arrays.copyOf(titles, titles.length);
        Arrays.sort(sortedTitles, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted titles: " + Arrays.toString(sortedTitles));

        int arrayIndex = Arrays.binarySearch(sortedTitles, "1984", String.CASE_INSENSITIVE_ORDER);
        System.out.println("Arrays.binarySearch result: " + arrayIndex);

        List<Book> bookList = createBookList(titles, years, ratings);
        Collections.sort(bookList);
        System.out.println("\nBooks sorted by title using Comparable:");
        bookList.forEach(System.out::println);

        Comparator<Book> byRating = Comparator.comparingDouble(Book::getRating).reversed();
        bookList.sort(byRating);
        System.out.println("\nBooks sorted by rating using Comparator:");
        bookList.forEach(System.out::println);

        Collections.sort(bookList);
        int listIndex = Collections.binarySearch(bookList, new Book("1984", 0, 0.0));
        System.out.println("Collections.binarySearch result: " + listIndex);

        Path file = Path.of("library-books.txt");

        try {
            List<String> lines = new ArrayList<>();
            for (int i = 0; i < titles.length; i++) {
                lines.add(titles[i] + " | " + years[i] + " | " + ratings[i]);
            }

            Files.write(file, lines);
            System.out.println("\nSaved books to: " + file.toAbsolutePath());

            try (var reader = Files.lines(file)) {
                System.out.println("Books read from file:");
                reader.forEach(System.out::println);
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    static void demonstrateCO6(String[] titles, int[] years, double[] ratings) {
        System.out.println("\n=== CO6: Collections, lambdas, and streams ===");

        ArrayList<Book> bookList = new ArrayList<>(createBookList(titles, years, ratings));
        System.out.println("ArrayList<Book>:");
        bookList.forEach(System.out::println);

        Map<String, Book> booksByTitle = new HashMap<>();
        for (Book book : bookList) {
            booksByTitle.put(book.getTitle().toLowerCase(), book);
        }
        System.out.println("\nHashMap lookup for 1984: " + booksByTitle.get("1984"));

        Set<String> uniqueWords = new HashSet<>();
        for (String title : titles) {
            for (String word : title.toLowerCase().split("\\W+")) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word);
                }
            }
        }
        System.out.println("\nHashSet of unique title words: " + uniqueWords);

        java.util.function.Predicate<Book> highlyRated = book -> book.getRating() >= 5.0;

        System.out.println("\nBooks rated at least 5.0:");
        bookList.stream()
                .filter(highlyRated)
                .forEach(book -> System.out.println(book.getTitle()));

        List<String> titlesByYear = bookList.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .map(Book::getTitle)
                .collect(Collectors.toList());
        System.out.println("\nTitles sorted by year: " + titlesByYear);

        Map<Integer, List<String>> groupedByYear = bookList.stream()
                .collect(Collectors.groupingBy(
                        Book::getYear,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
        System.out.println("Titles grouped by year: " + groupedByYear);

        double average = bookList.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0.0);
        System.out.printf("Average rating from stream: %.2f%n", average);
    }
}



