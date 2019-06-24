
package classe;


public class Main {

    
    public static void main(String[] args) {
        MinhaLista<String> minha = new MinhaLista<String>();
        
        minha.add("A");
        minha.add("B");
        minha.add("C");
        minha.remove("B");
        System.out.println(minha);
    }
    
}
