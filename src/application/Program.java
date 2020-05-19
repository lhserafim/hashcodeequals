package application;

import entities.Client;

public class Program {
    public static void main(String args[]) {
        String a = "Maria";
        String b = "José";

        //HashCode - retorna um número inteiro
        //HashCode é MUITO MAIS RÁPIDO, bom pra testar uma massa grande de dados.
        //Porem como ele é limitado a números inteiros ele pode falhar!!!
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // 100% garantido. Mais lento
        System.out.println(a.equals(b));

        // Truque.
        // Fazer o hashCode da massa de dados e os casos que derem iguais, fazer equals para garantir

        System.out.println("-------------------------------------------------------");
        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Maria","jose@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        // 100% garantido. Mais lento // o comando == NÃO FUNCIONA pois a ref. de memória é diferente
        System.out.println(c1.equals(c2));

    }
}
