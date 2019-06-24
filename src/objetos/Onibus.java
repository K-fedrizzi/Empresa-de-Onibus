
package objetos;

import implementacaoDasListasLigadas.MinhaLista;


public class Onibus {
    private String nomeOnibus;
    private String origem;
    private String destino;
    
    private MinhaLista<Pessoa> poltronas ;

    public Onibus(String nome, String origem, String destino) {
        this.nomeOnibus = nome;
        this.origem = origem;
        this.destino = destino;
        this.poltronas = new MinhaLista<Pessoa>();
    }

    @Override
    public String toString() {
        return "Onibus{" + "nome=" + nomeOnibus + ", origem=" + origem + ", destino=" + destino + ", poltronas=" + poltronas + '}'+"\n";
    }  

    public String getNomeOnibus() {
        return nomeOnibus;
    }

    public void setNomeOnibus(String nome) {
        this.nomeOnibus = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public MinhaLista<Pessoa> getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(MinhaLista<Pessoa> poltronas) {
        this.poltronas = poltronas;
    }
    
    
}
