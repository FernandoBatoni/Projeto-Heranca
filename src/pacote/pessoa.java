package pacote;

public abstract class  pessoa {
    private String nome;
    protected int anoInscricao;
    protected double totalCompra;

    public pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    abstract public double calcBonus(int anoAtual);

    public void addCompras(double compra){
        totalCompra += compra;
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoInscricao(int anoInscricao) {
        this.anoInscricao = anoInscricao;
    }

}
