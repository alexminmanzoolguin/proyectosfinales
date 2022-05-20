/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author alex_
 */
public class Proyecto2 {

     public static<T>List<T>consulta(List<T> lista,Predicate<T> predicate){
        List<T>consulta= new ArrayList<>();
        for(T t:lista){
            if(predicate.test(t)){
                consulta.add(t);
            }

        }
            return   consulta;
        
        }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
           java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("MANZO OLGUIN ALEX YAZMIN 8S12");
        System.out.println("BIEVENIDOS AL DIRECTORIO TELEFONICO");
        
        System.out.println("METODO LANBDAS");
        List<Datos> Lista_agenda = new ArrayList<>();
     Lista_agenda.add(new Datos("MANZO ZARATE JOSE ANTONIO",1990309716,"MAZA4803218B9"));
     Lista_agenda.add(new Datos("OLGUIN TAPIA MARIA ALEJANDRA",435319959,"OUTA710425TW0"));
     Lista_agenda.add(new Datos("MANZO OLGUIN ALEX YAZMIN",285561128,"MAOA990922N89")); 
     Lista_agenda.add(new Datos("HERNANDEZ GONZALEZ MIGUEL ALBERTO",2030787385,"HEGM9105229N6")); 
     Lista_agenda.add(new Datos("GARCIA PEREZ ROSA",922237397,"GAPR7405146M9"));
     Lista_agenda.add(new Datos("MARTINEZ RODRIGUEZ JORGE",737176780,"MARJ790619DL2 "));
     Lista_agenda.add(new Datos("LOPEZ SANCHEZ JUANA",891701932,"LOSJ840619SS0"));
        List<Datos> consulta = consulta(Lista_agenda, (Datos nombre_completo) -> nombre_completo.gettelefono()>1);
        for (Datos nombre_completo : consulta) {
            System.out.println("el nombre es: " + " " + nombre_completo.getnombre_completo()+"el telefono es: " + " "+nombre_completo.gettelefono()+"el rfc es: " +""+ nombre_completo.getrfc() + " " );
        }
        
        System.out.println("INTERFACES FUNCIONALES");
     FuntionalInterfaceDemo fi =()->{
        try{//e utiliza cuando se desean prever excepciones en el transcurso de la ejecución de un programa.
        InputStream ins=new FileInputStream("agenda.txt");
            
        }catch(FileNotFoundException e){//donde se especifica la excepción que se sabe puede ocurrir.
            e.printStackTrace();//e utiliza para imprimir el registro del stack donde se ha iniciado la excepción
        }
     };
     fi.doSomething();
    
    
     
        System.out.println("INTERFACES FUNCIONALES PEZONALIZADAS");
        // Fichero del que queremos leer
		File fichero = new File("agenda.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... AGENDA TELEFONICA ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}

                System.out.println("Busqueda");
                 System.out.println("Introduce una cadena de texto a buscar: ");
	 String request = scanner.next();
	 	try {
			final BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"));
			String line = "";
			while((line = reader.readLine())!= null){
				if(line.indexOf(request)!= -1){
					System.out.println("su dato es encontrado"+line);
				}
			}reader.close();
	 	} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException           e) {e.printStackTrace();
		}
    }
        
        
        
    }
    
