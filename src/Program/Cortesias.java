package Program;

import Entities.Cliente;
import Service.ClienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cortesias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ClienteService service = new ClienteService();


        while(true){
            System.out.println("--MENU CORTESIAS--");
            System.out.println("1- adicionar cortesia");
            System.out.println("2- atualizar status cortesia");
            System.out.println("3 - Status cortesia");
            System.out.println("4- lista cortesias");
            System.out.println("5- encerrar programa");
            System.out.print("\nEscolha: ");
            int escolha = sc.nextInt();

            if (escolha == 1){

                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Celular/Telefone: ");
                String telefone = sc.nextLine();

                System.out.print("Item: ");
                String item = sc.nextLine();

                System.out.print("Valor: ");
                Double valor = sc.nextDouble();

                service.adicionarCortesia(new Cliente(nome,telefone, item, valor));

            } else if (escolha == 2) {
                sc.nextLine();

                System.out.print("Celular/Telefone: ");
                String telefone = sc.nextLine();

                Cliente cliente = service.buscaNumero(telefone);

                if (cliente == null){
                    System.out.println("Cortesia nao encontrada!!\n");
                    continue;
                }
                System.out.println("Cliente resgatou a cortesia(S/N)? ");
                char resposta = sc.next().charAt(0);

                service.atualizarStatus(telefone, resposta == 'S' || resposta == 's');

                System.out.println("Status da cortesia atualizada\n");

            } else if (escolha == 3) {
                sc.nextLine();

                System.out.print("Celular/Telefone: ");
                String telefone = sc.nextLine();

                System.out.println(service.buscaCortesia(telefone));

            } else if (escolha == 4) {
                if (service.listaVazia()){
                    System.out.println("Nenhuma cortesia cadastrada!\n");
                    continue;
                }
                for (Cliente c: service.getListaClientes()){
                    System.out.println(c);
                    System.out.println();
                }

            } else if (escolha == 5){
                System.out.println("Programa encerrado!");
                break;
            }
            else {
                System.out.println("Opção invalida!");
            }
        }
        sc.close();
    }
}
