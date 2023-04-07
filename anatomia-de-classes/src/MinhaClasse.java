public class MinhaClasse {
    public static void main (String[] args) {
        String primeiroNome = "Allyne";
        String sobrenome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome + segundoNome;
    }
}
