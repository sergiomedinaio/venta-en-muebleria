import java.util.ArrayList;

public class Transaccion {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ObjetoVendible> vendibles;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ObjetoVendible> getVendibles() {
        return vendibles;
    }

    public void setVendibles(ArrayList<ObjetoVendible> vendibles) {
        this.vendibles = vendibles;
    }

    public void agregarVendible(ObjetoVendible vendible) {
        getVendibles().add(vendible);
    }

    public Transaccion(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        setVendibles(new ArrayList<ObjetoVendible>());
    }
}
