import java.util.Date;

public class Paperbook extends Book
{
    String series;
    String month;


    public Paperbook(int pages, Date released, String title, String isbn) {
        super(pages, released, title, isbn);
    }
}
