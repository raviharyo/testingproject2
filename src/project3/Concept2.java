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
public class Concept2 extends Concept1{
     public int returnperiod (Style model){
       switch (model.getperiod()){
           case "6 Months":
               return 100000;
           case "1 Year":
               return 175000;
           default:
               return 0;
            
       }
    }
}
//goods