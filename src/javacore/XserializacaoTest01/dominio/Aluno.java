package javacore.XserializacaoTest01.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 4179808963842996291L;
    private long id;
    private String name;
    private String  password;
    //Transient significa que ele não deve ser serializado.
    private static String nomeEscole = "ABC";
    private transient Turma turma;


    public Aluno(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + nomeEscole + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
