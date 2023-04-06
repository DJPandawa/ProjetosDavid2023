package devanandroid.david.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico() {
    }

    public static void metodoNaoEstatico() {
    }

    public static String mensagem() {
        return "Preencha com os Dados do Combustível";
    }


    // Preço da Gasolina : R$ 5,12 - Preço do Etanol : R$ 3,99
    // Preço Ideal da Gasolina = gasolina * 0,70 = R$ 3,548

    public static String calcularMelhorOpcao(double gasolina, double etanol) {


        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if (etanol <= precoIdeal) {
            mensagemDeRetorno = "Abastecer com Etanol";
        } else {
            mensagemDeRetorno = "Abastecer com Gasolina";
        }

        return mensagemDeRetorno;

        // Se o preço do Etanol for IGUAL ou MENOR que o PREÇO IDEAL, o IF vai fazer aparecer que
        // É melhor ABASTECER COM ETANOL. Caso Contrário, é melhor ABASTECER COM GASOLINA.
        // NO caso de If and Else, o If é a primeira instância e o Else é o resultado da instância do primeiro objeto.
    }


}