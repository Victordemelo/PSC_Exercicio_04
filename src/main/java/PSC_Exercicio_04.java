
/**
 *
 * @author victo
 */import java.util.Scanner;

public class PSC_Exercicio_04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String usuario;
        int idade;

        System.out.println("Digite a o Nome do usuário: ");
        usuario = leitor.nextLine();
        System.out.println("Digite a idade do Usuário: ");
        idade = leitor.nextInt();

        if (idade <= 25 && idade >= 15) {
            System.out.println("ACEITO");
            } else {
                System.out.println(usuario + " NÃO ACEITO");
            }
        }
    }
