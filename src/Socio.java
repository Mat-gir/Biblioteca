public class Socio {
    private String nome;
    private String codiceFiscale;

    public Socio(){
        
    }

    public Socio(String nome,String codiceFiscale){
        setNome(nome);
        setCodiceFiscale(codiceFiscale);
        
    }

     public void setNome(String nome){
        this.nome = nome;
     }

     public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
     }

     public String getNome(){
        return nome;
     }

     public String getCodiceFiscale(){
        return codiceFiscale;
     }


     

}
