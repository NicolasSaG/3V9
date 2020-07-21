/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaDoble;

/*
 * ABSTRACCION Y POLIMORFISMO
 * */
//Implements -> Herencia de 2 padres xd

public abstract class Animal {
    private String especie;

    public Animal(String especie) {
        super();
        this.especie = especie;
    }

    public abstract void comunica();
}

