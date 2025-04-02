package org.example.main;

import org.example.entities.User;
import org.example.repository.UserRepository;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static UserRepository userRepository = new UserRepository();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário por ID");
            System.out.println("4 - Excluir usuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    buscarUsuario();
                    break;
                case 4:
                    excluirUsuario();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        User user = new User(UUID.randomUUID(), nome, email, senha);
        userRepository.save(user);
        System.out.println("Usuário cadastrado!");
    }

    private static void listarUsuarios() {
        userRepository.findAll().forEach(System.out::println);
    }

    private static void buscarUsuario() {
        System.out.print("Digite o UUID do usuário: ");
        UUID uuid = UUID.fromString(sc.nextLine());
        userRepository.findById(uuid).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Usuário não encontrado!")
        );
    }

    private static void excluirUsuario() {
        System.out.print("Digite o UUID do usuário: ");
        UUID uuid = UUID.fromString(sc.nextLine());
        userRepository.deleteById(uuid);
        System.out.println("Usuário removido!");
    }
}
