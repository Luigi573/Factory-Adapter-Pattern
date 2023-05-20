package Factory;

public class Calavera implements Enemigo{

    private String tipoEnemigo;

    public Calavera() {
        tipoEnemigo = "Calavera";
    }

    @Override
    public void imprimirTipo() {
        System.out.println(tipoEnemigo);
    }
    
}
