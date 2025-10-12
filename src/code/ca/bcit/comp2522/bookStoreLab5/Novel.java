package ca.bcit.comp2522.bookStoreLab5;

/**
 * A Novel has a title, author, and year published
 *
 * @author David Martinez,
 * Daniel Do
 * @version 1.0
 */
public class Novel implements Comparable<Novel>
{
    public static final int MIN_YEAR_PUBLISHED = 0;

    private final String title;
    private final String author;
    private final int yearPublished;

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
    private void checkYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR_PUBLISHED)
        {
            throw new IllegalArgumentException("Year published is negative");
        }
    }

    /*
    Checks string for null or blankness, invalid if true
    Throws new IllegalArgumentException
     */
    private void checkString(final String s)
    {
        if (s == null || s.isBlank())
        {
            throw new IllegalArgumentException("String is null or blank");
        }
    }

    /**
     * Get title
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Get author
     *
     * @return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Get year published
     *
     * @return the year published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Compares novels based on title's
     * Earlier in alphabetic is first
     *
     * @param that another book
     * @return -1 if this book comes before
     *          1 if this book comes after
     *          on tie we compare lengths
     *          -1 if this book has shorter title
     *          1 if this book has longer title
     *          0 if book titles are equal
     */
    @Override
    public int compareTo(final Novel that)
    {
        final String thisTitle;
        final String thatTitle;
        final int minLength;

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
                return -1; // this comes before other
            }
            else if (thisChar > thatChar) {
                return 1; // this comes after other
            }
            // if equal, continue to next character
        }

        // Return -1 if this title is shorter, 1 if this title is longer, or 0 if equal.
        return Integer.compare(thisTitle.length(), thatTitle.length());
    }
}
