package Factory;

public class CalaveraGrande implements Enemigo{

    private String tipoEnemigo;

    CalaveraGrande() {
        tipoEnemigo = "Calavera Grande";
    }

    @Override
    public void imprimirTipo() {
        System.out.println(tipoEnemigo);
    }
    
}
