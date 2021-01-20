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
public class Logic extends Model{
    public int returnplan (Model model) {
        switch (model.getplan()){
            case "One Time Insurance":
               return  50000;
            case "Subscribe Plan":
                return  0;  
            default :
                return 0;
        }
    }
    
    public int returnpack (Model model) {
      switch (model.getpack()){
          case "Silver":
              return 20000;
          default :
              return 50000;
      }
   
  
          
    }
    //utk polymorph
    public int returnperiod (Model model){
     
    return 0;
            
    }
}
//goods