/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cajeraThread;



/**
 *
 * @author maveces
 */
public class Cliente {
    
private String nombre;
	private int[] carroCompra;

    Cliente(String cliente_1, int[] i) {
        this.nombre = cliente_1;
        this.carroCompra = i;
       
    }

	// Constructor, getter y setter

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the carroCompra
     */
    public int[] getCarroCompra() {
        return carroCompra;
    }

    /**
     * @param carroCompra the carroCompra to set
     */
    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }

}