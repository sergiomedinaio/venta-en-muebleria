public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ObjetoVendible silla = new ObjetoVendible("Mi silla cómoda", 2000.0);
        Cliente mario = new Cliente("Mario Mario");
        Vendedor luigi = new Vendedor("Luigi Mario");
        //mario va a querer reservar la silla
        Reserva reservaDeHoy = new Reserva(mario, luigi, silla);
        //reservaDeHoy.agregarReserva();
        Compra compraDeHoy = new Compra(mario, luigi);
        compraDeHoy.agregarAlCarrito(silla);
        compraDeHoy.generarTicket("Efectivo", 1, 0);
    }
}