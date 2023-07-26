public class Carro {
private String nomeCarro;
private double permanencia;
private String placa;
private  String nomeDonoCarro;
private  double valorapagar;

public Carro(String nomeCarro,double permanencia,String placa,String nomeDonoCarro){
    this.nomeCarro = nomeCarro;
    this.permanencia = permanencia;
    this.placa = placa;
    this.nomeDonoCarro = nomeDonoCarro;
    this.valorapagar = calcularValoraPagar(permanencia);}
        public String getNomeCarro(){
        return nomeCarro;
}
       public double getPermanencia() {
       return permanencia;
}
         public String getPlaca() {
        return placa;
}

        public String getNomeDonoCarro() {
            return nomeDonoCarro;
        }
        public double getValorapagar(){
        return valorapagar;
        }

        public void atualizarPermanencia(double permanenciaAdicional) {
            permanencia += permanenciaAdicional;
            this.valorapagar = calcularValoraPagar(permanencia);
        }

        private double calcularValoraPagar (double permanencia){
    double valor = 0;
    if (permanencia <= 1) {
        valor = 10;
    }else  if ( permanencia <= 1.5) {
        valor = 10 + 2;
    }else  if (permanencia <= 12) {
        valor = 10 + 2 + ((int) (permanencia - 1.5)) * 2;
    }else {
        valor = 90;
    }return  valor;
    }
    @Override
public String toString(){
    return "Carro: "+ nomeCarro + ",Permanencia: "+ permanencia + "h,Placa : "+ placa
            +",Dono: " + nomeDonoCarro + "Valor a pagar: "+ valorapagar + " reais";
    }}










