/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 * A generic class Pair which has 2 type parameters, F and S, representing the
 * type of the first and second elements of a pair respectively.
 *
 * @author Timothy Bradford
 * @param <F> generic type F
 * @param <S> generic type S
 */
public class Pair<F, S> {

    public F f;
    public S s;

    /**
     * Default Constructor 
     */
    public Pair() {
    }

    /**
     * 
     * @param f generic value
     * @param s generic value
     */
    public Pair(F f, S s) {
        this.f = f;
        this.s = s;
    }

    /**
     *  method to display the first and second values of the pair 
     * @return the first and second values of the pair in string format
     */
    @Override
    public String toString() {
        return "Pair{" + "f=" + f + ", s=" + s + '}';
    }

    /**
     * 
     * @return generic value
     */
    public F getF() {
        return f;
    }

    /**
     * 
     * @param f generic value
     */
    public void setF(F f) {
        this.f = f;
    }

    /**
     * 
     * @return generic value
     */
    public S getS() {
        return s;
    }

    /**
     * 
     * @param s generic value
     */
    public void setS(S s) {
        this.s = s;
    }
}
