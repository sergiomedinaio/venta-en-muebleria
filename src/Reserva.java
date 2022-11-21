import java.util.ArrayList;

public class Reserva extends Transaccion{
    public Reserva(Cliente cliente, Vendedor vendedor, ObjetoVendible objetoVendible) {
        super(cliente, vendedor);
        agregarReserva(objetoVendible);
        System.out.println(String.format(
                "El vendedor %s pudo reservarle a %s el articulo %s",
                vendedor.getNombre(),
                cliente.getNombre(),
                objetoVendible.getNombre()
        ));

    }

    public void agregarReserva(ObjetoVendible vendible) {
        agregarVendible(vendible);
        vendible.setReserva(this);
    }
}
