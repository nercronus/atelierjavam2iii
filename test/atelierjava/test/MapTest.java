/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapTest {
    
    @Test
    public void mapKetSetOK(){
        
         HashMap<String, String> paysCapitales = new HashMap<>();
            paysCapitales.put("france", "Paris");
            paysCapitales.put("brasil", "brasilia");
            paysCapitales.put("italie", "rome");
            
            Set<String> cles = paysCapitales.keySet();
            System.out.println(paysCapitales);
            System.out.println(cles );
            
            for (String pays : cles){
                System.out.println(pays +" 000 "+ paysCapitales.get(pays));
            }
          
           
    }
    
    //@Test
    public void mapPutGetOK(){
        HashMap<String, String> paysCapital = new HashMap<>();
            paysCapital.put("france", "Paris");
            paysCapital.put("brasil", "brasilia");
            paysCapital.put("italie", "rome");
            
            System.out.println(paysCapital.get("brasil"));
    }
}
