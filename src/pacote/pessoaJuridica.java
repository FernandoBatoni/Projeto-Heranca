package pacote;

public class pessoaJuridica extends pessoa {
    private String CGC;
    private double TaxaIncentivo;
    private String tipoPessoa;

    public pessoaJuridica(String CGC, String nome, int anoInscricao){
        super(nome, anoInscricao);
        this.CGC = CGC;
    }

    public double calcBonus(int anoAtual) {
        double bonus = (TaxaIncentivo * totalCompra)*(anoAtual - anoInscricao);
        return bonus;
    }

    public void setCGC(String cGC) {
        CGC = cGC;
    }
    
    public void setTaxaIncentivo(double taxaIncentivo) {
        TaxaIncentivo = taxaIncentivo / 100;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo;
    }
    
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa(){
        return tipoPessoa;
    }
}
