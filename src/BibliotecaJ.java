import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BibliotecaJ {

    private HashMap<String, Libro> elencoLibri;
    private TreeMap<String, Socio> elencoSoci;
    private HashMap<String, String> elencoPrestiti;

    public BibliotecaJ() {
        elencoLibri = new HashMap<>();
        elencoSoci = new TreeMap<>();
        elencoPrestiti = new HashMap<>();
    }

    //metodi di aggiunta

    public void addLibro(Libro libro){
        elencoLibri.put(libro.getISBN(), libro);
        System.out.println("libro aggiunto"); // in questo modo il libro sarà trovato tramite ISBN
    }

    public void addSocio(Socio socio){
        elencoSoci.put(socio.getCodiceFiscale(), socio);
        System.out.println("socio aggiunto"); // in questo modo il socio sarà trovato tramite il codice fiscale
    }

    //metodi gestione prestiti

    public void richiedi(Socio socio,Libro libro){
        if ((elencoLibri.containsKey(libro.getISBN())) && (elencoSoci.containsKey(socio.getCodiceFiscale()))) {
            if(!elencoPrestiti.containsKey(libro.getISBN())){
                elencoPrestiti.put(libro.getISBN(), socio.getCodiceFiscale());
                System.out.println("Prestito registrato con successo!");
            }
            
        }
    }

    public void ritorna(Libro libro){
        if (elencoPrestiti.remove(libro.getISBN()) != null) {
            System.out.println("Libro restituito.");
        }
    }


    //metodi ricerca oggetti

    public Libro trovaLibro(Libro libro) {
        return elencoLibri.get(libro.getISBN());
    }

    public Socio trovaSocio(Socio socio) {
        return elencoSoci.get(socio.getCodiceFiscale());
    }

    public void mostraPrestiti() {
        if (elencoPrestiti.isEmpty()) {
            System.out.println("non ci sono prestiti");
        }else{
            System.out.println(elencoPrestiti.toString());
        }
    }

}