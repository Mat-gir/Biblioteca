public class Prestito {
    private Libro libro;
    private Socio socio;


    public Prestito(){

    }

    public Prestito(Libro libro, Socio socio){
        setLibro(libro);
        setSocio(socio);
    }

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public void setSocio(Socio socio){
        this.socio = socio;
    }

    @Override
    public String toString() {
        return  socio.getCodiceFiscale() +": "+libro.getTitolo();
    }

}
