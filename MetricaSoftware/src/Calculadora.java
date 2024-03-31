import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculadora {

    private Logger logger;

    public Calculadora() {
    }

    public Double add(Double par1, Double par2) throws ExceptionCalculadora {
        validarNumeros(par1, par2);
        return par1 + par2;
    }

    public Double sub(Double par1, Double par2) throws ExceptionCalculadora {
        validarNumeros(par1, par2);
        return par1 - par2;
    }

    public Double mul(Double par1, Double par2) throws ExceptionCalculadora {
        validarNumeros(par1, par2);
        return par1 * par2;
    }

    public Double div(Double par1, Double par2) throws ExceptionCalculadora {
        validarNumeros(par1, par2);
        if (par2 == 0) {
            throw ExceptionCalculadora.erroAoDividirPorZero();
        }
        return par1 / par2;
    }

    private void validarNumeros(Double par1, Double par2) throws ExceptionCalculadora {
        if (par1 == null || par2 == null) {
            throw ExceptionCalculadora.parametrosNulos();
        }
        if (Double.isNaN(par1) || Double.isNaN(par2) || Double.isInfinite(par1) || Double.isInfinite(par2)) {
            throw ExceptionCalculadora.parametrosInvalidos();
        }
    }

}
