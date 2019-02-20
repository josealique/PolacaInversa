import java.util.*;

public class Token {
    enum Toktype { NUMBER, OP, PAREN }

    // Pensa a implementar els "getters" d'aquests atributs
    private Toktype ttype;
    private int value;
    private char tk;

    public Toktype getTtype() { return ttype; }

    public int getValue() { return value; }

    public char getTk() { return tk; }

    // Constructor privat. Evita que es puguin construir objectes Token externament
    private Token() {}

    // Torna un token de tipus "NUMBER"
    static Token tokNumber(int value) {
        Token number = new Token();
        number.ttype = Toktype.NUMBER;
        number.value = value;
        return number;
    }

    // Torna un token de tipus "OP"
    static Token tokOp(char c) {
        Token operador = new Token();
        operador.ttype = Toktype.OP;
        operador.tk = c;
        return operador;
    }

    // Torna un token de tipus "PAREN"
    static Token tokParen(char c) {
        Token parentesis = new Token();
        parentesis.ttype = Toktype.PAREN;
        parentesis.tk = c;
        return parentesis;
    }

    // Mostra un token (conversió a String)
    public String toString() {
       Token token = new Token();
       return token.toString();
    }

    // Mètode equals. Comprova si dos objectes Token són iguals
    public boolean equals(Object o) {
        Token token = (Token) o;
        return this.ttype == token.ttype;
    }

    // A partir d'un String, torna una llista de tokens
    public static Token[] getTokens(String expr) {
        // Creamos una Lista
        List<Token> t = new ArrayList<>();
        for (int i = 0; i < expr.length(); i++) {
            // Si encuentra un espacio continua
            if (expr.charAt(i) == ' '){
                continue;
            }
            /* Si el caracter no es un operador crearemos una variable de tipo int
            para poder guardar el numero en la lista
             */
            if (!operadores(expr.charAt(i))){
                int numero = 0;
                for (int j = i; j < expr.length(); j++) {
                    if (operadores(expr.charAt(j))){
                        break;
                    }
                    numero += j;
                    i = j;
                }
                t.add(Token.tokNumber(numero));
            } else if (EsParentesis(expr.charAt(i))) {
                t.add(Token.tokParen(expr.charAt(i)));
            } else if (operadores(expr.charAt(i))) {
                t.add(Token.tokOp(expr.charAt(i)));
            }
        }
        return t.toArray(new Token[t.size()]);
    }

    // Método que comprueba los paréntesis
    static boolean EsParentesis(char c){
        return (c == '(' || c == ')');
    }

    // Método que comprueba los operadores
    static boolean operadores(char c){
        return (c == ' ' || c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')');
    }
}