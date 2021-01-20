/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author ucauta
 */
public class Concept1 extends Style{
    public int returnplan (Style model) {
        switch (model.getplan()){
            case "One Time Insurance":
               return  50000;
            case "Subscribe Plan":
                return  0;  
            default :
                return 0;
        }
    }
    
    public int returnpack (Style model) {
      switch (model.getpack()){
          case "Silver":
              return 20000;
          default :
              return 50000;
      }
   
  
          
    }
    //utk polymorph
    public int returnperiod (Style model){
     
    return 0;
            
    }
}
//goods