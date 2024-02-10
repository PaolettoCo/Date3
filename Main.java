import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String anno = data.format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY));
        System.out.println(anno);
        String mese = data.format(DateTimeFormatter.ofPattern("MMMM", Locale.ITALY));
        System.out.println(mese);
        String giorno = data.format(DateTimeFormatter.ofPattern("dd", Locale.ITALY));
        System.out.println(giorno);
        String giornoDellaSettimana = data.format(DateTimeFormatter.ofPattern("EEEE", Locale.ITALY));
        System.out.println(giornoDellaSettimana);
    }
}