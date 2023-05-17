import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Pista pista = new Pista(9);

        ArrayList<Pilota> listaPiloti = new ArrayList<>();

        for (int i = 0; i < 24; i++) {

            listaPiloti.add(new Pilota("Pilota: " + (i + 1), pista));

        }

        for (Pilota pilota : listaPiloti) {

            pilota.start();

        }
    }
}