import java.util.*;

public class Evaluator {

    public static int calculate(String expr) {
        // Convertim l'string d'entrada en una llista de tokens
        Token[] tokens = Token.getTokens(expr);
        // Efectua el procediment per convertir la llista de tokens en notació RPN
        // Finalment, crida a calcRPN amb la nova llista de tokens i torna el resultat
        return 0;
    }

    public static int calcRPN(Token[] list) {
        // Calcula el valor resultant d'avaluar la llista de tokens
        String expr = "";
        List<Token> output = new ArrayList<>();
        Stack<Token> stack = new Stack<>();
        return 0;
    }
}