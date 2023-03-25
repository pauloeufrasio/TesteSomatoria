public class Main {
    public static void main(String[] args) {
        // Atribuindo valores para as variavel
        int contador = 0;
        int total = 0;
        // Enquanto contador for menor igual 10 ele vai fazer a somatoria dos numeros
        while (contador <= 10) {
        //  Criando contador da somatoria 
            total = total +contador;
            contador++;
        }
        System.out.println(total);

    }
}