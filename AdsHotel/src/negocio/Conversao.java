package negocio;

public class Conversao {
    String variavelint ;
    String variaveldouble;
    public void validaInt(String variavelint) {//converte string em int
        try {
            int conversaoInt = Integer.parseInt(variavelint);
            System.out.println("Resultado: " + variavelint);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }
    }
    public void validaDouble(String variaveldouble) {//converte string em double
        try {
            double conversaoDouble = Double.parseDouble(variaveldouble);
            System.out.println("Resultado: " + variaveldouble);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }
    }
}
