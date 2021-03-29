/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Comparator;
public class PriceComparator implements Comparator{
    
    //compare two plants
    public int compare(Object obj1, Object obj2){
        if((obj1 instanceof Plant) &&
           (obj2 instanceof Plant)){
            Plant p1 = (Plant)obj1;
            Plant p2 = (Plant)obj2;
            if(p1.getPrice() == p2.getPrice()) return 0;
            if(p1.getPrice() < p2.getPrice()) return -1;
            if(p1.getPrice() > p2.getPrice()) return 1;
            
        }
        throw new IllegalArgumentException();
    }

}
