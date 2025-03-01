public class Libro {
    private String ISBN;
    private String titolo;

    public Libro (){

    }

    public Libro (String ISBN,String titolo){
        setISBN(ISBN);
        setTitolo(titolo);
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getTitolo(){
        return titolo;
    }

    @Override
    public String toString() {
        return titolo +": "+ISBN;
    }

    

}
