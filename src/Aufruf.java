import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Aufgabe 3
        Book a = new Book(200, new Date(), "My Book", "1234567-1231231-12312312-12312");
        System.out.println("Das Buch hat " + a.getPages() + " Seiten, wurde am " + a.getReleased() + " veröffentlicht und hat den Titel " + a.getTitle());
        System.out.println("------------------------------------------------------");

        //Aufgabe 4
        //Array: kann unbegrenzt erweitert werden - Array hat eine definierte Größe
        List<Book> b = new ArrayList<>();
        b.add(new Book(200, new Date(), "My book 1", "125215-12521-73473"));
        b.add(new Book(200, new Date(), "My book 2", "6437-623623-24254"));
        b.add(new Book(200, new Date(), "My book 3", "26326-734737-732473"));
        b.add(new Book(200, new Date(), "My book 4", "745854-124412-3487438348"));
        b.add(new Book(200, new Date(), "My book 5", "1672-5236236-123483475125"));

        //For-Each Schleife
        for(Book f:b)
        {
            System.out.println(f.getTitle() + " hat" + f.getPages() + " Seiten und folgende ISBN: " + f.getIsbn());
        }



    }
}
