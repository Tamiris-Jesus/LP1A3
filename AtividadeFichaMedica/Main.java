import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int opcao;

    	do {
    	/*	MENU DE OPÇÕES DAS AÇÕES QUE O USUÁRIO PODE REALIZAR*/
        System.out.println("");
        System.out.println("######################################################### ");
        System.out.println("    MENU DE OPCOES - MANIPULACAO DE ARQUIVOS EM JAVA    \n");
        System.out.println("1. Criar ficha medica");
        System.out.println("2. Atualizar ficha medica");
        System.out.println("3. Exibir ficha medica");
        System.out.println("0. Sair");
        System.out.print("Digite uma opcao: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        // VERIFICA A AÇÃO ESCOLHIDA E CHAMA O MÉTODO CORRESPONDENTE 
        switch (opcao) {
            case 1:
                criarFichaMedica();
                break;
            case 2:
                atualizarFichaMedica();
                break;
            case 3:
                exibirFichaMedica();
                break;
            case 0:
            	System.out.println("Encerrando programa...");
            default:
            	if(opcao > 4)
                System.out.println("Digite uma opcao valida!");
        }

    } while(opcao != 0);
   }
    // MÉTODO RESPONSÁVEL POR CRIAR A FICHA MÉDICA DE UM PACIENTE 
    public static void criarFichaMedica() {
        try {
        	// LÊ AS INFORMAÇÕES DO PACIENTE 
            System.out.println("Digite os dados do paciente:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Genero: ");
            String genero = scanner.nextLine();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); 

            /*	UTILIZAÇÃO DO FILEWRITER EM CONJUNTO COM O BUFFEREDWRITER
             * PARA TORNAR A ESCRITA EM DISCO MAIS EFICIENTE. OS DADOS PRIMEIRO
             * SÃO GUARDADOS NO BUFFER E DEPOIS SÃO PASSADOS PERIODICAMENTE PARA O FILEWRITER
             * PARA SEREM GRAVADOS NO ARQUIVO*/
            
            String nomeArquivo = nome + ".txt";
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
           
            // LÊ OS DADOS DO PACIENTE, SALVANDO COM UMA FORMATAÇÃO LEGÍVEL
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Idade: " + idade + " anos");
            writer.newLine();
            writer.write("Genero: " + genero);
            writer.newLine();
            writer.write("Altura: " + altura + " metros");
            writer.newLine();
            writer.write("Peso: " + peso + " kg");

            writer.close();
            System.out.println("\nA ficha medica do paciente foi criada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // MÉTODO PARA ATUALIZAR FICHA MÉDICA DO PACIENTE 
    public static void atualizarFichaMedica() {
        try {
        	// LÊ O NOME DO PACIENTE PARA BUSCAR SUA FICHA MÉDICA 
            System.out.print("Digite o nome do paciente: ");
            String nome = scanner.nextLine();

           // OBTEM UMA REFERÊNCIA À FICHA MÉDICA DO PACIENTE 
            String nomeArquivo = nome + ".txt";
            File arquivo = new File(nomeArquivo);

            // VERIFICA SE A FICHA EXISTE 
            if (!arquivo.exists()) {
                System.out.println("\nNao existe ficha medica salva para esse paciente.");
                return;
            }

            // LÊ AS INFORMAÇÕES DO PACIENTE ATUALIZADAS 
            System.out.println("Digite os novos dados do paciente:");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Genero: ");
            String genero = scanner.nextLine();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); 

            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Idade: " + idade + " anos");
            writer.newLine();
            writer.write("Genero: " + genero);
            writer.newLine();
            writer.write("Altura: " + altura + " metros");
            writer.newLine();
            writer.write("Peso: " + peso + " kg");

            writer.close();
            System.out.println("\nA Ficha medica foi atualizada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void exibirFichaMedica() {
        try {
        	// LÊ O NOME DO PACIENTE 
            System.out.print("Digite o nome do paciente: \n"); 
            String nome = scanner.nextLine();

            String nomeArquivo = nome + ".txt";
            File arquivo = new File(nomeArquivo);

            if (!arquivo.exists()) {
                System.out.println("\nA ficha médica do paciente não foi encontrada! \n");
                return;
            }

            // CRIA OBJETOS PARA LER O ARQUIVO 
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            // LÊ O ARQUIVO, LINHA POR LINHA 
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
