package Sintatico;

import Models.Token;
import Models.Lista;
import java.util.LinkedList;
import java.util.List;

public class AnalisadorSintatico {

    private LinkedList<Integer> pilha = new LinkedList<Integer>();
    private int linha;
    private String nomeToken;
    public static final int AnaliseSintatica_Fim      = 0;
    public static final int AnaliseSintatica_SemErros = 1;
    public static final int AnaliseSintatica_ComErros = 2;
    
    
    public String returnErro() {
        return "Erro Sintatico"
                + "\nLinha: " + linha
                + "\nPalavra: " + nomeToken;
    }    
    
    public AnalisadorSintatico() {
        pilha.addFirst(44);
        System.out.println("Insiriu na pilha a regra numero: 44");
        pilha.addFirst(46); 
        System.out.println("Insiriu na pilha a regra numero: 46\n\n");
        
    }

    public Integer Analisar(Lista tokens) {
        for (int i=0;i<tokens.tamanho();i++){
            Token token = tokens.retorna(i);
            int resu = Analisador(Integer.parseInt(token.getCodigo()));
            
            if (resu == AnaliseSintatica_ComErros){ 
                linha = Integer.parseInt(token.getLinha());
                nomeToken =  token.getNome();
                return AnaliseSintatica_ComErros;
            }    
        }
        return AnaliseSintatica_Fim;
    }

    public Integer Analisador(Integer sEntrada) { //0 - fim , 1- sai sem erros 2-sai comerro
        Integer topPilha;
        Integer simboloEntrada;

        topPilha = pilha.getFirst(); 
        simboloEntrada = sEntrada;

        do {
            System.out.println("Simbolo Inicial: " +simboloEntrada + "\tTopo da Pilha:"+topPilha+ "\tPilha:"+pilha);
            if (topPilha == 18) {
                
                pilha.removeFirst(); //Retire o elemento do topo da pilha
                
                topPilha = pilha.getFirst();   //X recebe o topo da pilha 
            } else if ((topPilha >= 1) && (topPilha <= 45)) { //Se X é terminal então
                if (topPilha == simboloEntrada) {//Se X=a então
                    pilha.removeFirst();//Retire o elemento do topo da pilha
                    
                    return AnaliseSintatica_SemErros; //Sai do Repita // 
                } else {
                    return AnaliseSintatica_ComErros; //Encerra o programa  	
                }
            } else if ((topPilha >= 46) && (topPilha <= 75)) { //Senão (* X é não-terminal*)
                TabelaParsing tabelaParsing = new TabelaParsing();
                Integer regra = tabelaParsing.regra(topPilha, simboloEntrada);
                if (regra != 0) { //Se M(X,a) <> ∅ então (existe uma regra)
                    pilha.removeFirst();//Retire o elemento do topo da pilha
                    
                    //Coloque o conteúdo da regra na pilha
                    Gramatica regrasGramatica = new Gramatica();
                    String regras[] = regrasGramatica.getGramatica(regra);
                    for (int i = (regras.length - 1); i >= 0; i--) {
                        pilha.addFirst(Integer.valueOf(regras[i]));
                    }
                    topPilha = pilha.getFirst(); //X recebe o topo da pilha
                } else {
                    return AnaliseSintatica_ComErros; //Encerra o programa  	
                }
            }
        } while (topPilha != 44);
        return AnaliseSintatica_Fim;
    }
}