/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SetTest {
    
    @Test
    public void assOK(){
        
        HashSet<String> set = new HashSet<>();
        
        set.add("vert");
        set.add("vert");
        set.add("rouge");
        
        System.out.println(set);
    }
    
}
