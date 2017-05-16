/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author gipao
 */
public class Dvds extends TipoDeSoporte {
   private String actores;
   private int minDuración;

    public Dvds(String actores, int minDuración, String titulo, String autor) {
        super(titulo);
        this.actores = actores;
        this.minDuración = minDuración;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getMinDuración() {
        return minDuración;
    }

    public void setMinDuración(int minDuración) {
        this.minDuración = minDuración;
    }

    @Override
    public String toString() {
        return "Dvds{" + "actores=" + actores + ", minDuraci\u00f3n=" + minDuración + '}'+super.toString();
    }
   
    
   
}
