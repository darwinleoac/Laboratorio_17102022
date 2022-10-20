public abstract class Producto implements IProducto, IMercaderia{
    private String nombre;
    private int stock;
    protected Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    abstract int verificarExistencia();

    ;
    public String obtenerTipoProducto(){
        System.out.println("Obteniendo el tipo de producto");
        return nombre;
    }
    @Override
    public boolean ingresar(Producto producto){
        System.out.println("Ingresando producto");
        return false;
    }
    @Override
    public boolean darDeBaja(Producto producto){
        System.out.println("Quitando producto");
        return false;
    }
    @Override
    public void comprar() {
        System.out.println("Comprando Producto");
    }
}
