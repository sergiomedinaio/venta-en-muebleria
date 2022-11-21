public class ObjetoVendible {
    private String nombre;
    private double precioLista;

    public ObjetoVendible(String nombre, double precioLista) {
        this.nombre = nombre;
        this.precioLista = precioLista;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
