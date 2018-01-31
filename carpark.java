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
public class carpark {
    
    int t,c;            //t=Number of cars allowed in the car park   c=Current number of cars in the car park  
    car head,a,b;
    linlist l=new linlist();
    
    public carpark(int t)
    {
        this.t=t;
        this.head=null;
        this.c=0;
    }
    
    public boolean isFull()
    {
        if(this.c<this.t)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void enter(String i)
    {
        a=new car(i);
        if(this.isFull()==false)
        {
            if(this.head==null)
            {
                this.head=a;
            }
            else
            {
                b=this.head;
                while(b.next!=null)
                {
                    b=b.next;
                }
                b.next=a;
            }
            this.c=this.c+1;
            System.out.println("Car entered......"+a.getNumber());
            a.moves();
        }
        else
        {
            l.insert(i);
            System.out.println("No space wait in the waiting list");
        }
    }
    
    public void leave(String i)
    {
        int m=0;
        b=this.head;
        car p=this.head;
        while(b!=null)
        {
            m++;
            if(i.equals(b.getNumber()))
            {
                if(i.equals(this.head.getNumber()))
                {
                    b=this.head;
                    this.head=b.next;
                    b.moves(m);
                }
                else
                {
                    p.next=b.next;
                    b.moves(m);
                }
                System.out.println(b.getNumber()+" Car moved out... "+"Moves :-"+b.getMoves());
                this.c=this.c-1;
                if(l.isEmpty()==false)
                {
                    this.enter(l.remove());
                    this.c=this.c+1;
                }
                return;
            }
            else
            {
                p=b;
                b.moves();
                b=b.next;
            }
        }
        
        System.out.println("The car isn't in the park");
    }
    
    public void printCar()
    {
        b=this.head;
        System.out.println("The cars in the car park");
        while(b!=null)
        {
            System.out.println(b.getNumber()+"-"+b.getMoves());
            b=b.next;
        }
    }
    
}
