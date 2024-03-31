public class ExceptionCalculadora extends Exception {

    public ExceptionCalculadora(String message) {
        super(message);
    }

    public static ExceptionCalculadora erroAoDividirPorZero() {
        return new ExceptionCalculadora("Não posso dividir por zero");
    }

    public static ExceptionCalculadora parametrosNulos() {
        return new ExceptionCalculadora("Parâmetros não podem ser nulos");
    }

    public static ExceptionCalculadora parametrosInvalidos() {
        return new ExceptionCalculadora("Parâmetros inválidos, devem ser números válidos");
    }

    public static ExceptionCalculadora resultadoInvalido() {
        return new ExceptionCalculadora("Resultado da operação é inválido");
    }

    public static ExceptionCalculadora operacaoNaoSuportada() {
        return new ExceptionCalculadora("Operação não suportada");
    }
}
