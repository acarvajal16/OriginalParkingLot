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
public class Node implements Comparable {
    public Object objeto;
    public CircularDLL siguiente;
    public CircularDLL anterior;
    
    public Node() 
    {
        this.objeto = null;
        this.siguiente = null;
        this.anterior = null;
        
    }
    public Node(Object objeto) {
        this.objeto = objeto;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public Node(Object objeto, Node siguiente, Node anterior) {
        this.objeto = objeto;
        //this.siguiente = siguiente;
        //this.anterior = anterior;
    }

    Node(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object getObject() {
        return objeto;
    }
    
    public void setObject(Object objeto) {
        this.objeto = objeto;
    }
    
    public boolean isEquals(Object objeto) {
        if (this.getObject().toString().equals(objeto.toString())) {
            return true;
        }
        return false;
    }
    
    public boolean isEquals(Node node) {
        if (this.toString().equals(node.toString())) {
            return true;
        }
        return false;
    }
    
    
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  
