import  java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Estacionamento{
private List<Carro> carrosEstacinados;
public  Estacionamento (){
    carrosEstacinados = new ArrayList<>();
}
public  void visualizarCarrosEstacinados(){
    System.out.println("__________Carros Estacioandos__________");
    if (carrosEstacinados.isEmpty()) {
        System.out.println("Nenhum Carro Estacionado");
    }else {
        for (Carro carro : carrosEstacinados){
            System.out.println(carro);

        }
    }
}
public void  inserirNovoCarro (String nomeCarro, double permanencia, String placa, String nomeDonoCarro){
    Carro carro = new Carro(nomeCarro,permanencia,placa,nomeDonoCarro);
     carrosEstacinados.add(carro);
}
public void atualizarCarrosEstacionados(String placa) {
    Carro carroEncontrado = encontrarCarroPorPlaca(placa);
    if (carroEncontrado !=null) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Permanencia adicional: ");
        double permaneciaAdicional = scanner.nextDouble();
        carroEncontrado.atualizarPermanencia(permaneciaAdicional);
        System.out.println("Carro atualizado");
    }else {
        System.out.println("Carro nao encontrado");
    }
    }
    public void sairDoEstacionamento(String placa){
    Carro carroRemovido = encontrarCarroPorPlaca(placa);
    if (carroRemovido !=null) {
        carrosEstacinados.remove(carroRemovido);
        System.out.println("Carro Removido");
    }else {
        System.out.println("Carro nao encontrado");
    }
    }

    private Carro encontrarCarroPorPlaca(String placa) {
    for (Carro carro : carrosEstacinados){
        if (carro.getPlaca().equals(placa)){
            return carro;
        }
    }
    return null;
    }}


