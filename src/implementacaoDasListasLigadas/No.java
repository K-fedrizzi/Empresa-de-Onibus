
package implementacaoDasListasLigadas;


public class No<T> {
   T elemento;
   No<T>prox;
   public No(T e)
   {
       setElemento(e);
       setProx(null);
   }
   public String toString()
   {
       if(prox == null)
       {
           elemento.toString();
       }
       return elemento.toString()+" "+prox;
   }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }
    
}
