/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3dos;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author alex_
 */
public class LAMBDA {
 public static<T>java.util.List<T>consultar(java.util.List<T> lista,Predicate<T> predicate){
        java.util.List<T>consultar= new ArrayList<>();
        for(T t:lista){
            if(predicate.test(t)){
                consultar.add(t);
            }
        }
        return consultar;
    }
}
