package javacore.Oexception.runtime.test;

import javacore.Oexception.dominio.Funcionario;
import javacore.Oexception.dominio.LoginInvalidoException;
import javacore.Oexception.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
