import java.util.Scanner;

public class EstacionamentoMenu{
private static final int SAIR =0;
private static  final  int Visualizar_Carros_Estacinados = 1;
private static  final  int Inserir_Novo_Carro = 2;
private static  final  int Atualizar_Carro_estacionado = 3;
private static  final  int Sair_do_Estacionamento = 4;

private Scanner scanner;
private  Estacionamento estacionamento;
public  EstacionamentoMenu(){
    scanner = new Scanner(System.in);
    estacionamento = new Estacionamento();
}
public void iniciar() {
    int opcao;
    do {
        exibirMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case Visualizar_Carros_Estacinados:
                estacionamento.visualizarCarrosEstacinados();
                break;
            case Inserir_Novo_Carro:
                inserirNovoCarro();
                break;
            case Atualizar_Carro_estacionado:
                atualizarCarrosEstacionados();
                break;
            case Sair_do_Estacionamento:
                sairDoEstacionamento();
                break;
            case SAIR:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção Nao valida");
                break;
        }
    }while (opcao != SAIR) ;
    }
    private void exibirMenu() {
        System.out.println("__________Menu__________");
        System.out.println(Visualizar_Carros_Estacinados + " - Visualizar Carros Estacionados");
        System.out.println(Inserir_Novo_Carro + " - Inserir Novo Carro");
        System.out.println(Atualizar_Carro_estacionado + "- Atualizar carro estacionado");
        System.out.println(Sair_do_Estacionamento + " - Sair do Estacionamento");
        System.out.println(SAIR + " - Sair");
        System.out.println(" Digite a opção desejada: ");
    }
    private void inserirNovoCarro() {
        System.out.println("__________Inserir Novo Carro __________");
        System.out.println("Nome do Carro( Modelo): ");
        String nomeCarro = scanner.nextLine();

        System.out.println("Permanencia: ");
        double permanencia = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Nome Completo do Dono: ");
        String nomeDonoCarro = scanner.nextLine();
        estacionamento.inserirNovoCarro(nomeCarro, permanencia, placa, nomeDonoCarro);
        System.out.println("Carro estacion");
    }
    private void atualizarCarrosEstacionados () {
        System.out.println("__________Atualizar Carros Estacionados__________");
        System.out.println("Digite a placa a ser atualizada: ");
        String placa = scanner.nextLine();
        estacionamento.atualizarCarrosEstacionados(placa);
    }
    private void sairDoEstacionamento () {
        System.out.println("__________Sair do Estacioanento__________");
        System.out.println("Digite a placa do carro que esta saindo: ");
        String placa = scanner.nextLine();
        estacionamento.sairDoEstacionamento(placa);
    }
}

