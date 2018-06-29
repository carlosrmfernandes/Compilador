/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Polo UAB
 */
import java.util.Objects;

public abstract class Identificador extends Token {

    private final int nivel;

    public Identificador(Token token, int nivel) {
        token.getCodigo();
        token.getNome();
        this.nivel = nivel;
    }

    public int nivel() {
        return nivel;
    }

    public abstract String categoria();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Identificador that = (Identificador) o;
        return this.nivel >= that.nivel
                && Objects.equals(this.getNome(), that.getNome())
                && Objects.equals(this.categoria(), that.categoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel, getNome());
    }

    @Override
    public String toString() {
        return "Nome:" + getNome() + '\n'
                + "Nivel=" + nivel + '\n'
                + "Categoria=" + getClass();
    }
}
