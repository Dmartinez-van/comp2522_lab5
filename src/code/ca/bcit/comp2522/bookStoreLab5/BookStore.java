package ca.bcit.comp2522.bookStoreLab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * BookStore can hold many {@link Novel} objects.
 * Has instance data for store name and list of bookList it has.
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class BookStore
{
    private static final double HUNDRED_PERCENT = 100.0;
    private static final int    DECADE_CALCULATION_DIVISOR = 10;
    private static final int    SAME = 0;

    private final String storeName;
    private final List<Novel> bookList;

    /**
     * Full constructor.
     * Constructs with a defined list of bookList
     *
     * @param storeName the store's name
     */
    BookStore(final String storeName)
    {
        checkString(storeName);

        this.storeName = storeName;

        //TODO Move to external file and read from file instead?
        bookList = new ArrayList<Novel>();
        bookList.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        bookList.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        bookList.add(new Novel("American Pastoral", "Philip Roth", 1997));
        bookList.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        bookList.add(new Novel("Animal Farm", "George Orwell", 1946));
        bookList.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        bookList.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        bookList.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        bookList.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        bookList.add(new Novel("Atonement", "Ian McEwan", 2002));
        bookList.add(new Novel("Beloved", "Toni Morrison", 1987));
        bookList.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        bookList.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        bookList.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        bookList.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        bookList.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        bookList.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        bookList.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        bookList.add(new Novel("Catch-22", "Joseph Heller", 1961));
        bookList.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookList.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        bookList.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        bookList.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        bookList.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        bookList.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        bookList.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        bookList.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        bookList.add(new Novel("A Death in the Family", "James Agee", 1958));
        bookList.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        bookList.add(new Novel("Deliverance", "James Dickey", 1970));
        bookList.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        bookList.add(new Novel("Falconer", "John Cheever", 1977));
        bookList.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        bookList.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        bookList.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        bookList.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        bookList.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        bookList.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        bookList.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookList.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        bookList.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        bookList.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        bookList.add(new Novel("Herzog", "Saul Bellow", 1964));
        bookList.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        bookList.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        bookList.add(new Novel("I, Claudius", "Robert Graves", 1934));
        bookList.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        bookList.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        bookList.add(new Novel("Light in August", "William Faulkner", 1932));
        bookList.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        bookList.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        bookList.add(new Novel("Lord of the Flies", "William Golding", 1954));
        bookList.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookList.add(new Novel("Loving", "Henry Green", 1945));
        bookList.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        bookList.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        bookList.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        bookList.add(new Novel("Money", "Martin Amis", 1984));
        bookList.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        bookList.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        bookList.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        bookList.add(new Novel("Native Son", "Richard Wright", 1940));
        bookList.add(new Novel("Neuromancer", "William Gibson", 1984));
        bookList.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        bookList.add(new Novel("1984", "George Orwell", 1948));
        bookList.add(new Novel("On the Road", "Jack Kerouac", 1957));
        bookList.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        bookList.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        bookList.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        bookList.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        bookList.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        bookList.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        bookList.add(new Novel("Possession", "A.S. Byatt", 1990));
        bookList.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        bookList.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        bookList.add(new Novel("Rabbit, Run", "John Updike", 1960));
        bookList.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        bookList.add(new Novel("The Recognitions", "William Gaddis", 1955));
        bookList.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        bookList.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        bookList.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        bookList.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        bookList.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        bookList.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        bookList.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        bookList.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        bookList.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        bookList.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        bookList.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        bookList.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        bookList.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        bookList.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        bookList.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        bookList.add(new Novel("Ubik", "Philip K. Dick", 1969));
        bookList.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        bookList.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        bookList.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        bookList.add(new Novel("White Noise", "Don DeLillo", 1985));
        bookList.add(new Novel("White Teeth", "Zadie Smith", 2000));
        bookList.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    /*
    Check a string for null or blankness, invalid if either is true.
    Throws new IllegalArgumentException
     */
    private void checkString(final String s)
    {
        if (s == null || s.isBlank())
        {
            throw new IllegalArgumentException("String cannot be null or blank");
        }
    }

    /**
     * Getter for store name
     *
     * @return store name as string
     */
    public String getStoreName()
    {
        return storeName;
    }

    /**
     * Prints all novel titles to screen in bookstores book list
     * Prints titles in all uppercase
     */
    public void printAllTitles()
    {
        if (bookList != null)
        {
            for(final Novel book: bookList)
            {
                System.out.println(book.getTitle().toUpperCase());
            }
        }
    }

    /**
     * Prints all titles that contain the specified parameter
     * Not case-sensitive
     *
     * @param word the parameter to search for
     */
    public void printBookTitle(final String word)
    {
        if (bookList != null)
        {
            for (final Novel book: bookList)
            {
                if (book.getTitle().contains(word))
                {
                    System.out.println(book.getTitle());
                }
            }
        }
    }

    /**
     * Prints all titles in alphabetical order, A-Z
     */
    public void printTitlesInAlphaOrder()
    {
        if (bookList != null)
        {
            Collections.sort(bookList);

            for (final Novel book: bookList)
            {
                System.out.println(book.getTitle());
            }
        }
    }

    /**
     * Prints all books published in the specified decade.
     * @param decade the target decade
     */
    public void printGroupByDecade(final int decade)
    {
        final int targetDecade;
        int bookDecade;

        targetDecade = decade / DECADE_CALCULATION_DIVISOR;

        if (bookList != null)
        {
            for (final Novel book : bookList)
            {
                bookDecade = book.getYearPublished() / DECADE_CALCULATION_DIVISOR;
                if (bookDecade == targetDecade)
                {
                    System.out.println(book.getTitle());
                }
            }
        }
    }

    /**
     * Finds and returns the novel with the longest title in the bookstore.
     * @return the Novel object with the longest title
     */
    public Novel getLongest()
    {
        Novel longestTitleNovel;
        int longestTitleLengthChars;

        longestTitleNovel = null;
        longestTitleLengthChars = 0;

        for (final Novel book : bookList)
        {
            final String rawTitle;
            int rawTitleLength;

            rawTitle = book.getTitle().replace(" ", "");
            rawTitleLength = rawTitle.length();

            if (rawTitleLength > longestTitleLengthChars)
            {
                longestTitleNovel = book;
                longestTitleLengthChars = rawTitleLength;
            }
        }

        return longestTitleNovel;
    }

    /**
     * Checks if there is a book written in the specified year.
     * @param year the year to check
     * @return true if at least one book was published in that year, false otherwise
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        if (bookList != null)
        {
            for (final Novel book: bookList)
            {
                if (book.getYearPublished() == year)
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Counts how many books contain the specified word in their title.
     * @param word the word to search for in book titles
     * @return the number of books that contain the word in their title
     */
    public int howManyBooksContain(final String word)
    {
        final String lowercaseWord;

        int containCount;

        containCount = 0;
        lowercaseWord = word.trim().toLowerCase();

        for (final Novel book: bookList)
        {
            String lowercaseBookTitle;
            lowercaseBookTitle = book.getTitle().toLowerCase();

            if (lowercaseBookTitle.contains(lowercaseWord))
            {
                containCount++;
            }
        }
        return containCount;
    }

    /**
     * Calculates what percentage of books were written between two years (inclusive).
     * @param first the starting year (inclusive)
     * @param last the ending year (inclusive)
     * @return the percentage of books written between these years
     */
    public double whichPercentWrittenBetween(final int first,
                                             final int last)
    {
        int bookCount;
        int totalBooks;
        double percentageBetween;

        bookCount = 0;

        for (final Novel book: bookList)
        {
            final int yearPublished;
            yearPublished = book.getYearPublished();

            if (yearPublished >= first && yearPublished <= last)
            {
                bookCount++;
            }
        }

        totalBooks = bookList.size();
        percentageBetween = ((double) bookCount / (double) totalBooks) * HUNDRED_PERCENT;

        return percentageBetween;
    }

    /**
     * Finds and returns the oldest book in the bookstore.
     * @return the Novel object with the earliest publication year
     */
    public Novel getOldestBook()
    {
        Novel oldestNovel;

        oldestNovel = null;

        for (final Novel book: bookList)
        {
            if (oldestNovel == null)
            {
                oldestNovel = book;
            }
            else if (oldestNovel.getYearPublished() > book.getYearPublished())
            {
                oldestNovel = book;
            }
        }

        return oldestNovel;
    }

    /**
     * Returns a list of all books whose title length matches the specified length.
     * @param titleLength the length of the title to search for
     * @return a List of Novel objects whose titles are exactly this length
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        // TODO: Implement
        return null;
    }

        /**
         * Runner class for lab5
         *
         * @param args unused
         */
    public static void main(final String[] args)
    {
        final BookStore bookStore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookStore = new BookStore("my Store");

        // printAllTitle() works
//        bookStore.printAllTitle();

        // printBookTitle() works
//        bookStore.printBookTitle("the");

        // printTitlesInAlphaOrder() works
//        bookStore.printTitlesInAlphaOrder();

        // printGroupByDecade() works
//        bookStore.printGroupByDecade(2000);
//        System.out.println();

//        System.out.println(bookStore.whichPercentWrittenBetween(2000, 2009));

//        System.out.println(bookStore.getLongest().toString());

        // Testing isThereABookWrittenIn() method
        final int[] yearsToCheck = {1801, 1901, 1960};
        for (final int checkYear : yearsToCheck)
        {
            System.out.printf("Is there a book written in %d?\n", checkYear);
            if (bookStore.isThereABookWrittenIn(checkYear))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

        // TESTING getOldestBook() method
        System.out.println("What is oldest book?\n" + bookStore.getOldestBook());

    }
}
