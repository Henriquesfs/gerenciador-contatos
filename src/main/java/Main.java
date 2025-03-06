import com.crud.dao.ContatoDAO;
import com.crud.model.Contato;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoDAO();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Insira uma ação: ");
            System.out.println("[1]- Adicionar Contato");
            System.out.println("[2]- Listar Contatos");
            System.out.println("[3]- Alterar Contato");
            System.out.println("[4]- Excluir Contato");
            System.out.println("[5]- Sair");
            System.out.println("Sua ação: ");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Insira o nome do contato: ");
                    String nome = sc.next();
                    System.out.println("Insira o número do Contato: ");
                    String numero = sc.next();
                    System.out.println("Insira o email do Contato: ");
                    String email = sc.next();
                    Contato novoContato = new Contato(nome, numero, email);
                    contatoDAO.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.println("Lista de contatos: ");
                    for(Contato contato : contatoDAO.listarContatos()){
                        System.out.println(contato);
                    }
                    break;
                case 3:
                    System.out.println("Alterar Contato: ");
                    System.out.println("Insira o ID do contato a ser alterado: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Novo Nome: ");
                    String novoNome = sc.next();
                    System.out.println("Novo Telefone: ");
                    String novoTelefone = sc.next();
                    System.out.println("Novo Email: ");
                    String novoEmail = sc.next();


                    Contato contatoAlterado = new Contato(id, novoNome, novoTelefone, novoEmail);
                    contatoDAO.alterarContato(contatoAlterado);
                    break;
                case 4:
                    System.out.println("Excluir Contato: ");
                    System.out.println("Insira o ID do contato a ser excluido: ");
                    int idExcluir = sc.nextInt();
                    contatoDAO.deletarContato(idExcluir);
                    break;
                case 5:
                    System.out.println("Saindo do Programa");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}