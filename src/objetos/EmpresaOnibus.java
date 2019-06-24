
package objetos;

import implementacaoDasListasLigadas.MinhaLista;

public class EmpresaOnibus {
   private String nomeEmpresa;
   
    private MinhaLista<Onibus> frotas;
    MinhaLista<Pessoa> passageiros;
    

    public EmpresaOnibus(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frotas = new MinhaLista<Onibus>();
    }

    public boolean cadastrarOnibus(String nomeOnibus,String origem,String destino){
        Onibus onibus = new Onibus(origem, origem, destino);
        frotas.add(onibus);
        return true;
    }
     
    public boolean CadastrarPassageiros(String nome, int idade,String nomeOnibus,String origem,String destino){
        
        for(int i = 0 ; i < frotas.size() ; i++){
            if(frotas.get(i).getNomeOnibus().equalsIgnoreCase(nomeOnibus) && frotas.get(i).getOrigem().equalsIgnoreCase(origem) && frotas.get(i).getDestino().equalsIgnoreCase(destino)){ //A empresa possui estes onibus?
               Pessoa pessoa = new Pessoa(nome, idade);
               passageiros.add(pessoa);
               return true;
            }
        }
        return false; 
    }
    
   
    @Override
    public String toString() {
        return "EmpresaOnibus{" + "nomeEmpresa=" + nomeEmpresa + ", frotas=" + frotas + '}'+"\n";
    }
    

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public MinhaLista<Onibus> getFrotas() {
        return frotas;
    }

    public void setFrotas(MinhaLista<Onibus> frotas) {
        this.frotas = frotas;
    }
    
    
    
    
}
