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
public class Cajera extends Thread{
    
private String nombre;
private Cliente cliente;

private long initialTime;


    Cajera(String cajera_1, Cliente clie, long initial) {
        this.nombre = cajera_1;
        this.initialTime = initial;
        this.cliente = clie;
       
    }

	// Constructor, getter y setter

	//public void procesarCompra(Cliente cliente, long timeStamp) {
@Override
                        public void run(){
		System.out.println("La cajera " + this.getNombre() + 
				" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.getCliente().getNombre() + 
				" EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000	+
				"seg");

		for (int i = 0; i < getCliente().getCarroCompra().length; i++) { 
				this.esperarXsegundos(getCliente().getCarroCompra()[i]); 
				System.out.println("Procesado el producto " + (i + 1) +  
				" ->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + 
				"seg");
		}

		System.out.println("La cajera " + this.getNombre() + " HA TERMINADO DE PROCESAR " + 
				getCliente().getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the initialTime
     */
    public long getInitialTime() {
        return initialTime;
    }

    /**
     * @param initialTime the initialTime to set
     */
    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

}