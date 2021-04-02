package museito;

public interface Sujeto {

    public void registerObserver(Observador o);

    public void removeObserver(Observador o);

    public void notifyObservers();

}
