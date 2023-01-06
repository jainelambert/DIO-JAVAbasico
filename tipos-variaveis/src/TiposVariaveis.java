//tipos primitivos
//estudem a classe String que representa texto na aplicação
public class TiposVariaveis{
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        System.out.println("Numero Short: " + numeroCurto);
        int numeroNormal = (int) numeroCurto;
        System.out.println("Numero int: " + numeroNormal);
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("Numero Short2: " + numeroCurto2);

        String meuNome = "Jaine Lambert";
        System.out.println("Nome: " + meuNome);

        final double NUMERO = 10;//constante
        System.out.println("CONSTANTE: " + NUMERO);

    }
}
