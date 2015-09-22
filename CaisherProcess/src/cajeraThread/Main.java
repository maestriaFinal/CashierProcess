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
public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
       /* Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente1,initialTime );

        cajera1.start();
        cajera2.start();*/
        
        for (int x=0; x <=3; x++){
            
            new Thread(new cajeraThread.Cajera("Cajera "+ x, cliente1, initialTime)).start();
            new Thread(new cajeraThread.Cajera("Cajera "+ x, cliente2, initialTime)).start();
            new Thread(new cajeraThread.Cajera("Cajera "+ x, cliente2, initialTime)).start();
            new Thread(new cajeraThread.Cajera("Cajera "+ x, cliente1, initialTime)).start();
            new Thread(new cajeraThread.Cajera("Cajera "+ x, cliente2, initialTime)).start();
        }
    }
}
