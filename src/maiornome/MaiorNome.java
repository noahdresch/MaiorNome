/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiornome;

/**
 *
 * @author Noa
 */
public class MaiorNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String maiorNome = " ";
        String menorNome = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        
        for (int i = 0; i < 10; i++) {
            String nome = Entrada.leiaString("Informe um nome: ");
            
            if (nome.length() > maiorNome.length()) {
            maiorNome = nome;
            } else if (nome.length() < menorNome.length()) {
            menorNome = nome;
            }
            
    
        }
        
        System.out.println("Maior nome: " + maiorNome + ".");
        System.out.println("Numero de caracteres: " + maiorNome.length());
        System.out.println("Menor nome: " + menorNome + ".");
        System.out.println("Numero de caracteres: " + menorNome.length());
        
        System.exit(0);
    }
    
}
