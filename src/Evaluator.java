import java.util.*;

public class Evaluator {

    public static int calculate(String expr) {
        // Convertim l'string d'entrada en una llista de tokens
        Token[] tokens = Token.getTokens(expr);
        // Efectua el procediment per convertir la llista de tokens en notació RPN
        // Finalment, crida a calcRPN amb la nova llista de tokens i torna el resultat
        return 0;
    }

    /*
     Un - quita un + o -, *, /, ^
     Un + quita un + o -, *, /, ^
     Un * quita el / y ^
     Un / quita el * y ^
    */

    public static int calcRPN(Token[] list) {
        // Calcula el valor resultant d'avaluar la llista de tokens
        List<Token> salida = new ArrayList<>();
        int resultado = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTtype() == Token.Toktype.NUMBER){
                resultado += list[i].getValue();
                if (list[i].getTtype() == Token.Toktype.OP){

                }
            }
        }
        return resultado;
    }
}