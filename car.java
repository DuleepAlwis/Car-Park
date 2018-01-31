/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author user
 */
public class car {
    
    private String numPlate;
    private int moves;
    car next;
    
    public car(String n)
    {
        this.numPlate=n;
        this.moves=0;
        this.next=null;
    }
    
    public void moves()
    {
        this.moves=this.moves+1;
    }
    
    public void moves(int m)
    {
        this.moves=this.moves+m;
    }
    
    public int getMoves()
    {
        return (this.moves);
    }
    
    public String getNumber()
    {
        return this.numPlate;
    }
    
}
