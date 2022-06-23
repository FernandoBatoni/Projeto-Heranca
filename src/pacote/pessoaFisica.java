package pacote;

public class pessoaFisica extends pessoa {
    private String CPF;
    private double base;
    private String tipoPessoa;

    public pessoaFisica(String CPF, String nome, int anoInscricao){
        super(nome, anoInscricao);
        this.CPF = CPF;
    }

    public double calcBonus(int anoAtual){
        double bonus = 0;
        if (totalCompra > 12000){
            bonus = (anoAtual - anoInscricao) * base;
            return bonus;
        }else return bonus;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa(){
        return tipoPessoa;
    }

}
