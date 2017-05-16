/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import Excepciones.PrestamoExcepcion;
import java.util.ArrayList;

/**
 *
 * @author gipao
 */
public class Mediateca {
    private ArrayList<Persona> clientes;
    private ArrayList<TipoDeSoporte> tipoDeSoporte;
    
    public void prestamo(Persona p, TipoDeSoporte articulo) throws PrestamoExcepcion{
        if(p.getPrestamos()< 3 && articulo.isDisponible()){
          p.agregarArticulo(articulo);
          articulo.setDisponible(false);
        }else{
            throw new PrestamoExcepcion();
        }

    }
    
    public void consulta(TipoDeSoporte t){
      for(TipoDeSoporte tipo: tipoDeSoporte){
          if(tipo.equals(t)&&tipo.isDisponible()){
              System.out.println("El libro esta disponible");
          }else{
              System.out.println("El libro no esta disponible");
          }
      }
    }

    
    public void devolucion(Persona p, TipoDeSoporte t){
       p.quitarArticulo(t);
       t.setDisponible(true);   
    }
    
    public void registrar(Persona p){
      clientes.add(p);
    }
}
