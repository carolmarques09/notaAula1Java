import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Gerente g = new Gerente();
            Programador pro = new Programador();
            Funcionario fun = new Funcionario();

            System.out.println("Digite o nome do projeto: ");
            g.setProjeto(sc.next());
            System.out.println("Informe a linguagem: ");
            pro.setLinguagem(sc.next());
            System.out.println("Informe o salário: ");
            fun.setSalario(sc.nextDouble());

            System.out.println("Nome do projeto: " + g.getProjeto());
            System.out.println("Linguagem: " + pro.getLinguagem());
            System.out.println("Salário: R$ " + fun.getSalario());
        }
    }