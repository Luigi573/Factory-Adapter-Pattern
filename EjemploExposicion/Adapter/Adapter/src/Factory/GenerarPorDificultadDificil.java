package Factory;

import java.util.ArrayList;
import java.util.Random;

public class GenerarPorDificultadDificil extends GeneradorEnemigo{

    @Override
    public ArrayList<Enemigo> generar() {
        ArrayList<Enemigo> enemigos = new ArrayList<>();
        Random random = new Random();


        for(int i = 1; i <= 25; i++) {

            if(random.nextInt(10) >= 8) {
                Enemigo calavera = new Calavera();
                enemigos.add(calavera);

            } else {
                Enemigo calaveraGrande = new CalaveraGrande();
                enemigos.add(calaveraGrande);
            }

            
        }

        return enemigos;

    }
}
