
public class Pista {

    private int numeroKart;

    public Pista(int numeroKart) {

        this.numeroKart = numeroKart;

    }

    public synchronized void entrataInPista() {

        String nomePilota = Thread.currentThread().getName();

        try {

            System.out.println(nomePilota + " il pilota entra nello spogliatoio e indossa la sua tuta");

            while (numeroKart <= 0) {

                System.out.println(nomePilota + " il pilota aspetta di salire sul proprio kart");

                
                wait();
            }

            numeroKart--;

            System.out.println(nomePilota + " ora sale sul suo kart");

        } catch (InterruptedException e) {
        }

    }

    public synchronized void esceDallaPista() {

        String nomePilota = Thread.currentThread().getName();

        System.out.println(nomePilota + " ora esce dalla pista e rientra negli spogliatoi");

        numeroKart++;

        notifyAll();

    }

}