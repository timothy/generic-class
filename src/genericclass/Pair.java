/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 *
 * @author Timothy Bradford
 * @param <F> generic type F
 * @param <S> generic type S
 */
public class Pair<F, S> {

    public F f;
    public S s;

    public Pair() {}

    public Pair(F f, S s) {
        this.f = f;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Pair{" + "f=" + f + ", s=" + s + '}';
    }

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }
}
