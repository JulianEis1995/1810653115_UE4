import java.util.Date;

public class Paperbook extends Book
{
    private String series;
    private String month;

    public Paperbook(int pages, Date released, String title, String isbn, String series, String month)
    {
        super(pages, released, title, isbn);
        this.series = series;
        this.month = month;
    }

    public String getSeries(){return series;}

    public void setSeries(String series){this.series = series;}

    public String getMonth(){return month;}

    public void setMonth(String month){this.month = month;}

}
