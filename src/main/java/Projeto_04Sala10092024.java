/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author victo
 */import java.util.Scanner;
public class Projeto_04Sala10092024 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String usuario;
        int idade;
        
        System.out.println("Digite a o Nome do usuário: ");
                usuario = leitor.nextLine();
        System.out.println("Digite a idade do Usuário: ");
                idade = leitor.nextInt();
        
        if (idade >= 25){
            System.out.println("NÃO ACEITO");
        } else {
            if (idade <= 15){
                System.out.println("NÃO ACEITO");
            } else 
                System.out.println(usuario +" ACEITO");
        }       
    }
}
