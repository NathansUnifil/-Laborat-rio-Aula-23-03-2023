// Integrantes: Nathan Golçalves Rambalducci
import java.util.concurrent.ThreadLocalRandom;

public class main {

    public static void main(String[] args) {

        int k = 5;
        int count = 0;
        int min = 0;
        int max = 1;
        boolean stop = false;
        while (stop == false) {
            int bool = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (bool == 1){
                k = k + 1;
            } else {
                k = k - 1;
            }
            System.out.println(k);
            count =  count + 1;
            if (count == 5) {
                if (k <= 0) {
                    stop = true;
                }
                count = 0;
                System.out.println("Aqui contou");
            }
        }
    }
}
