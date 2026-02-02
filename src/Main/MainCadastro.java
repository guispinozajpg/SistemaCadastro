package Main;

import java.util.Scanner;
import java.util.ArrayList;
import sistemacadastro.Cadastro;

public class MainCadastro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Cadastro> funcionario = new ArrayList<Cadastro>();
        System.out.println("Sistema de cadastro");

        int escolha; // sendo usado para decidir o que fazer 
        int achar; // sendo usado para buscar o ID 
        int remover; // sendo usado para excluir um funcionário

        // ---------PENSAR EM UMA FORMA PARA ATUALIZAR O CADASTRO--------- //
        // atualizar o cadastro - quero que primeiro apareça o funcionário, despois posso usar um input para edita-lo e
        // ver qual parte quero editar
        // criar tela
        // ainda muito a melhorar
        do {

            System.out.println("""
                               1 - Cadastrar funcionário
                               2 - Listar funcionários
                               3 - Buscar por ID
                               4 - Remover funcionário
                               0 - Sair""");
            escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1: // cadastrar
                    Cadastro cadastro = new Cadastro();

                    while (true) {
                        try {
                            System.out.println("Digite o nome:");
                            cadastro.setNome(input.nextLine());
                            break;
                        } catch (IllegalArgumentException erro) {
                            System.out.println(erro.getMessage());
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Digite o cargo:");
                            cadastro.setCargo(input.nextLine());
                            break;
                        } catch (IllegalArgumentException erro) {
                            System.out.println(erro.getMessage());
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Digite a idade:");
                            cadastro.setIdade(input.nextLine());
                            break;
                        } catch (IllegalArgumentException erro) {
                            System.out.println(erro.getMessage());
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Digite o id do funcionário:");
                            cadastro.setId(input.nextLine());
                            break;
                        } catch (IllegalArgumentException erro) {
                            System.out.println(erro.getMessage());
                        }
                    }

                    funcionario.add(cadastro);

                    break;

                case 2: // listar
                    System.out.println("Lista de Funcionários\n");
                    for (Cadastro saida : funcionario) {
                        System.out.println(saida);
                        System.out.println("-------------------------");
                    }
                    break;

                case 3: // buscar
                    System.out.println("Digite o ID do funcionário:");
                    achar = input.nextInt();
                    boolean encontrado = false;

                    for (Cadastro c : funcionario) {
                        if (c.getId() == achar) {
                            System.out.println();
                            System.out.println("-------------------------");
                            System.out.println(c);

                            System.out.println("-------------------------");
                            System.out.println();

                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado!");
                        System.out.println();
                    }
                    break;

                case 4: // excluir
                    System.out.println("Digite o ID do funcionário:");
                    remover = input.nextInt();
                    boolean removido = false;

                    for (int i = 0; i < funcionario.size(); i++) {
                        if (funcionario.get(i).getId() == remover) {
                            funcionario.remove(i);
                            System.out.println("Funcionário removido!");
                            System.out.println();
                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Funcionário não encontrado!");
                        System.out.println();
                    }
                    break;

                case 0: // sair
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
}
