package ca.bcit.comp2522.bookstorelab5;

/**
 * A Novel with a title, author, and year published.
 *
 * @author David Martinez,
 * @author Daniel Do
 * @version 1.0
 */
public class Novel
        implements Comparable<Novel>
{
    /** The minimum year value allowed for a novel */
    public static final int MIN_YEAR_PUBLISHED = 1455;
    private static final int LESS_THAN    = -1;
    private static final int GREATER_THAN =  1;

    private final String title;
    private final String author;
    private final int    yearPublished;

    /**
     * Full constructor.
     *
     * @param title the title of the novel
     * @param author the author of the novel
     * @param yearPublished the year the novel was published
     */
    Novel(final String title,
          final String author,
          final int yearPublished)
    {
        checkString(title);
        checkString(author);
        checkYearPublished(yearPublished);

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /*
    Checks year published for negative year value, invalid if true
    Throws new IllegalArgumentException
     */
    private static void checkYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR_PUBLISHED)
        {
            throw new IllegalArgumentException("Year published is invalid");
        }
    }

    /*
    Checks string for null or blankness, invalid if true
    Throws new IllegalArgumentException
     */
    private static void checkString(final String s)
    {
        if (s == null || s.isBlank())
        {
            throw new IllegalArgumentException("String is null or blank");
        }
    }

    /**
     * Getter for title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Getter for author name.
     *
     * @return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Getter for the year published.
     *
     * @return the year published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * CompareTo implementation that compares
     * novels based on their title in alphabetic order.
     *
     * @param that another book
     * @return {@value LESS_THAN} if this book comes before
     *          {@value GREATER_THAN} if this book comes after
     *          on tie we compare lengths
     *          {@value LESS_THAN} if this book has shorter title
     *          {@value GREATER_THAN} if this book has longer title
     */
    @Override
    public int compareTo(final Novel that)
    {
        final String thisTitle;
        final String thatTitle;
        final int    minLength;

        thisTitle = this.title.toLowerCase();
        thatTitle = that.title.toLowerCase();

        minLength = Math.min(thisTitle.length(),
                             thatTitle.length());

        for (int i = 0; i < minLength; i++) {
            final char thisChar;
            final char thatChar;

             thisChar = thisTitle.charAt(i);
             thatChar = thatTitle.charAt(i);

            if (thisChar < thatChar) {
                return LESS_THAN; // this comes before other
            }
            else if (thisChar > thatChar) {
                return GREATER_THAN; // this comes after other
            }
            // if equal, continue to next character
        }

        // Return LESSON_THAN if this title is shorter, 1 if this title is longer, or 0 if equal.
        return Integer.compare(thisTitle.length(), thatTitle.length());
    }

    /**
     * toString implementation for Novel class.
     *
     * @return string sentence of instance data
     */
    @Override
    public String toString() {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("\"");
        sb.append(title);
        sb.append("\"");
        sb.append(" by ");
        sb.append(author);
        sb.append(", ");
        sb.append(yearPublished);

        return sb.toString();
    }
}
