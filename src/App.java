public class App {
    public static void main(String[] args) {
        BibliotecaJ biblioteca = new BibliotecaJ();
        Socio socio1 = new Socio("CRLMNNT347L39Z", "CARLO MAGNANI");
        Libro libro1 = new Libro("784-5-6-333-56", "Delitto e Castigo");
        biblioteca.addLibro(libro1);
        biblioteca.addSocio(socio1);
        biblioteca.richiedi(socio1,libro1);
        biblioteca.mostraPrestiti();
        biblioteca.ritorna(libro1);
    }
    
}
