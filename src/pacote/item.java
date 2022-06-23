package pacote;

public class item {
    private String nomeItem;
    private int quantidadeItem;
    private double valorItem;

    public item(String nomeItem, int quantidadeItem, double valorItem){
        this.nomeItem = nomeItem;
        this.quantidadeItem = quantidadeItem;
        this.valorItem = valorItem;
    }

    @Override
    public String toString(){
        String result;

        result = String.format("Nome do item......: %s\n", nomeItem) +
                 String.format("Valor do item.....: %s\n", valorItem) +
                 String.format("Quantidade do item: %s\n", quantidadeItem);
        
        return (result);
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }
    
    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public double getValorItem() {
        return valorItem;
    }
}
