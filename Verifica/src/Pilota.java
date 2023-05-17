public class Pilota extends Thread {

    private Pista pista;

    public Pilota(String nomePilota, Pista pista) {

        super(nomePilota);
        this.pista = pista;

    }

    @Override
    public void run() {

        this.pista.entrataInPista();

        try {

            int aspetta = (int) (Math.random() * 3000) + 5005;

            sleep(aspetta);

        } catch (InterruptedException e) {
        }

        this.pista.esceDallaPista();
    }
}