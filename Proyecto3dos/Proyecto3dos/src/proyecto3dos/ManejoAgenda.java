/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3dos;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author alex_
 */
@FunctionalInterface
public interface ManejoAgenda {
       public String leerArchivo(BufferedReader br)throws IOException;//e considera que una linea terminada cuando hay un salto de línea ('\ n'), un retorno de carro ('\ r'), o un retorno de carro seguido inmediatamente por un salto de línea.
    
    
}