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
public class linlist {
    
    car head,a,c;
    String n;
    
    public linlist()
    {
        this.head=null;
    }
    
    public boolean isEmpty()
    {
        if(this.head==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void insert(String i)
    {
        a=new car(i);
        if(this.head==null)
        {
            this.head=a;
        }
        else
        {
            c=this.head;
            while(c.next!=null)
            {
                c=c.next;
            }
            c.next=a;
        }
    }
    
    
    public String remove()
    {
        c=this.head;
        n=this.head.getNumber();
        this.head=c.next;
        return n;    
    }
}
