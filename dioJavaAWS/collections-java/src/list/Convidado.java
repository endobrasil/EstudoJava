package list;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }

    @Override
    public String toString() {
        return nome +", " + codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codConvite);
    }
}
