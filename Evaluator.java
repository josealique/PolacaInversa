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
                System.out.println(resultado);
            }
        }
        return resultado;
    }

//    //Entrada (Expresión en Postfija)
//    String expr = "2 23 6 + * 1 -"; // equivale a 2*(23+6)-1
//    String[] post = expr.split(" ");
//
//    //Declaración de las pilas
//    Stack < String > E = new Stack < String > (); //Pila entrada
//    Stack < String > P = new Stack < String > (); //Pila de operandos
//
//    //Añadir post (array) a la Pila de entrada (E)
//    for (int i = post.length - 1; i >= 0; i--) {
//        E.push(post[i]);
//    }
//
//    //Algoritmo de Evaluación Postfija
//    String operadores = "+-*/%";
//    while (!E.isEmpty()) {
//        if (operadores.contains("" + E.peek())) {
//            P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
//        }else {
//            P.push(E.pop());
//        }
//    }
//
//    //Mostrar resultados:
//    System.out.println("Expresion: " + expr);
//    System.out.println("Resultado: " + P.peek());
//
//}

//    private static int evaluar(String op, String n2, String n1) {
//        int num1 = Integer.parseInt(n1);
//        int num2 = Integer.parseInt(n2);
//        if (op.equals("+")) return (num1 + num2);
//        if (op.equals("-")) return (num1 - num2);
//        if (op.equals("*")) return (num1 * num2);
//        if (op.equals("/")) return (num1 / num2);
//        if (op.equals("%")) return (num1 % num2);
//        return 0;
//    }
}