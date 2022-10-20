import org.w3c.dom.ls.LSOutput;

public class Lacteos extends Producto {
    protected Lacteos(String nombre, int stock) {
        super(nombre, stock);
    }

    public int verificarExistencia() {
        System.out.println("Verificando la existencia de productos");
        return 0;
    }

}
