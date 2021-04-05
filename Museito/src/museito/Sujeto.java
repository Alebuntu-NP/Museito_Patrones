package museito;

public interface Sujeto {
    //Implementación patrón Observador
    
    public void registerObserver(Observador o);

    public void removeObserver(Observador o);

    public void notifyObservers(Obra obra);

}
