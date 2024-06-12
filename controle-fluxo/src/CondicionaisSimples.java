// CaixaEletronico.java
public class CondicionaisSimples {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;
        //Condicional Simples
       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}