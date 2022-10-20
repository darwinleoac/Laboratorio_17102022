public class Main {
    public static void main(String[] args) {
        Lacteos l = new Lacteos("Yogurt",5);
        System.out.println(l.obtenerTipoProducto());
        System.out.println(l.verificarExistencia());

        Mercaderia m = new Mercaderia();
        m.comprar();
    }
}
