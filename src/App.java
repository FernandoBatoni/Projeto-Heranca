import java.util.ArrayList;
import java.util.Scanner;
import pacote.item;
import pacote.pessoaFisica;
import pacote.pessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nome = "", CPF = "", CGC = "", nomeItem = "";
        int anoInscricao = 0, menu1 = 0, menu2 = 0, quantidadeItem = 0, anoAtual = 2022, tipoPessoa = 0, v = 0;
        double valorCompra = 0, valorItem = 0;
        pessoaJuridica Juridica = new pessoaJuridica(CGC, nome, anoInscricao);
        pessoaFisica Fisica = new pessoaFisica(CPF, nome, anoInscricao);
        ArrayList <item> itemCompra = new ArrayList<>();
        Fisica.setBase(2);
        
        do{
            System.out.println("\n1 - Digitar seus dados");
            System.out.println("2 - Digitar taxa de incentivo para Pessoas Jurídicas");
            System.out.println("3 - Realizar compras");
            System.out.println("4 - Sair do sistema");
            menu1 = entrada.nextInt();
            switch(menu1){
                case 1:System.out.println("Digite seu nome: ");
                nome = entrada.next();
                System.out.println("Digite o ano de inscrição: ");
                anoInscricao = entrada.nextInt();
                System.out.println("Digite se é pessoa fisica ou jurídica (1 para Fisica e 2 para Juridica): ");
                tipoPessoa = entrada.nextInt();
                if(tipoPessoa == 1){
                    System.out.println("Digite seu CPF: ");
                    CPF = entrada.next();
                    Fisica.setNome(nome);
                    Fisica.setAnoInscricao(anoInscricao);
                    Fisica.setCPF(CPF);
                    Fisica.setTipoPessoa("F");
                    break;
                }
                if(tipoPessoa == 0){
                    System.out.println("Digite seu CGC: ");
                    CGC = entrada.next();
                    Juridica.setAnoInscricao(anoInscricao);
                    Juridica.setNome(nome);
                    Juridica.setCGC(CGC);
                    Juridica.setTipoPessoa("J");
                    break;
                }else{
                    System.out.println("Opção inválida! Digite uma opção disponivel!");
                    break;
                }
                
                case 2: System.out.println("Digite a taxa de incentivo para pessoas jurídicas: ");
                double taxaIncentivo = entrada.nextDouble();
                Juridica.setTaxaIncentivo(taxaIncentivo);
                break;

                case 3: do{
                    if(Fisica.getTipoPessoa() == "F"){
                        System.out.println("\n1 - Digitar sua compra");
                        System.out.println("2 - Verificar bonus");
                        System.out.println("3 - Verificar lista de itens");
                        System.out.println("4 - Terminar compra");
                        menu2 = entrada.nextInt();
                        switch(menu2){
                            case 1: 
                            while(v!=1){
                                System.out.println("Digite o nome do item: ");
                                nomeItem = entrada.next();
                                System.out.println("Qual o valor do item: ");
                                valorCompra = entrada.nextDouble();
                                valorItem = valorCompra;
                                System.out.println("Quantos " + nomeItem + " comprou? ");
                                quantidadeItem = entrada.nextInt();
                                valorCompra = valorCompra * quantidadeItem;
                                Fisica.addCompras(valorCompra);
                                itemCompra.add(new item(nomeItem, quantidadeItem, valorItem));
                                System.out.println("Deseja digitar mais algum item? Digite 1 se sim");
                                int ver = entrada.nextInt();
                                if(ver == 1) v=0;
                                else v++;
                            }
                            break;

                            case 2: 
                                System.out.println("O Bonus é de: " + Fisica.calcBonus(anoAtual));
                                break;

                            case 3:
                                mostrar(itemCompra);
                                break;

                            case 4: 
                                System.out.println("O total a pagar é de:\n " + (Fisica.getTotalCompra() - Fisica.calcBonus(anoAtual)));
                                break;
                            
                            default: System.out.println("Opção inválida!");
                            break;


                        }
                    }
                    if(Juridica.getTipoPessoa() == "J"){
                        System.out.println("\n1 - Digitar sua compra");
                        System.out.println("2 - Verificar bonus");
                        System.out.println("3 - Verificar lista de itens");
                        System.out.println("4 - Terminar compra");
                        menu2 = entrada.nextInt();
                        switch(menu2){
                            case 1: 
                            while(v!=1){
                                System.out.println("Digite o nome do item: ");
                                nomeItem = entrada.next();
                                System.out.println("Qual o valor do item: ");
                                valorCompra = entrada.nextDouble();
                                valorItem = valorCompra;
                                System.out.println("Quantos " + nomeItem + " comprou? ");
                                quantidadeItem = entrada.nextInt();
                                valorCompra = valorCompra * quantidadeItem;
                                Fisica.addCompras(valorCompra);
                                itemCompra.add(new item(nomeItem, quantidadeItem, valorItem));
                                System.out.println("Deseja digitar mais algum item? Digite 1 se sim");
                                int ver = entrada.nextInt();
                                if(ver == 1) v=0;
                                else v++;
                            }
                            break;

                            case 2: 
                            System.out.println("O bonus é de: " + Juridica.calcBonus(anoAtual));
                            break;

                            case 3:
                                mostrar(itemCompra);
                                break;

                            case 4: 
                                System.out.println("O total a pagar é de:\n " + (Juridica.getTotalCompra() - Juridica.calcBonus(anoAtual)));
                                break;
                            
                            default: System.out.println("Opção inválida!");


                        }
                    } else {
                        System.out.println("Insira seus dados corretamente antes de realizar compras!");
                        break;
                    }
                }while(menu2 != 4);
                break;

                case 4: System.out.println("Saindo do sistema...");
                break;

                default: System.out.println("Opção inválida");
                break;
            }
        }while(menu1 != 4);
    }

    public static void mostrar(ArrayList<item> lista){
        for(item itemCompra:lista){
            System.out.printf("%s\n", itemCompra.toString());
        }
    }
}
