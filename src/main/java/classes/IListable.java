/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrador
 */
public interface IListable {
    
    public void add();
    public int find();
    public void findNearest();
    public void clear();
    public void returnVehicle();
    public int getTicket();
    public String getInfo();
    public void remove (int index);
    
}
