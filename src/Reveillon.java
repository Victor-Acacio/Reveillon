import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Reveillon {

    private static final List<String> MES_JANEIRO = List.of("JANEIRO", "JAN", "1", "01");
    private static final List<String> MES_FEVEREIRO = List.of("FEVEREIRO", "FEV", "2", "02");
    private static final List<String> MES_MARCO = List.of("MARÇO", "MARCO", "MAR", "3", "03");
    private static final List<String> MES_ABRIL = List.of("ABRIL", "ABR", "4", "04");
    private static final List<String> MES_MAIO = List.of("MAIO", "MAI", "5", "05");
    private static final List<String> MES_JUNHO = List.of("JUNHO", "JUN", "6", "06");
    private static final List<String> MES_JULHO = List.of("JULHO", "JUL", "7", "07");
    private static final List<String> MES_AGOSTO = List.of("AGOSTO", "AGO", "8", "08");
    private static final List<String> MES_SETEMBRO = List.of("SETEMBRO", "SET", "9", "09");
    private static final List<String> MES_OUTUBRO = List.of("OUTUBRO", "OUT", "10");
    private static final List<String> MES_NOVEMBRO = List.of("NOVEMBRO", "NOV", "11");
    private static final List<String> MES_DEZEMBRO = List.of("DEZEMBRO", "DEZ", "12");

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int dia;
        int mes = 0;
        int diasRestantes = 365;
        String mesEscrito;

        System.err.println("informe o dia de hoje: ");
        dia = scan.nextInt();

        System.err.println("informe o mês: ");
        mesEscrito = scan.next().toUpperCase(Locale.ROOT);

        //condição do valor do mês//
            if (MES_JANEIRO.contains(mesEscrito)){
                mes = 1;

            } else if (MES_FEVEREIRO.contains(mesEscrito)) {
                diasRestantes = (365 - 31);
                mes = 2;

            } else if (MES_MARCO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28);
                mes = 3;

            } else if (MES_ABRIL.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31);
                mes = 4;

            } else if (MES_MAIO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30);
                mes = 5;

            } else if (MES_JUNHO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31);
                mes = 6;

            } else if (MES_JULHO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30);
                mes = 7;

            } else if (MES_AGOSTO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30 - 31);
                mes = 8;

            } else if (MES_SETEMBRO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31);
                mes = 9;

            } else if (MES_OUTUBRO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30);
                mes = 10;

            } else if (MES_NOVEMBRO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31);
                mes = 11;

            } else if (MES_DEZEMBRO.contains(mesEscrito)) {
                diasRestantes = (365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30);
                mes = 12;

            } else {
                System.out.println("Erro no valor do mês");
            }

        System.out.println("hoje é dia " + dia + "/" + mes );
        System.out.println("Faltam apenas " + (diasRestantes - dia) + " para o ano novo.");
        System.out.println("se o ano for bisexto " + (diasRestantes - dia +1) + ". :) ");

    }
}