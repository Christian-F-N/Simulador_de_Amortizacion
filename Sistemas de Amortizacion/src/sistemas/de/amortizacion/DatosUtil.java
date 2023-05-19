/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DatosUtil {
      public void mostrarDatos(ArrayList<?> entidades) {
        for (Object entidad : entidades) {
            Class<?> clase = entidad.getClass();
            Field[] campos = clase.getDeclaredFields();
            
            for (Field campo : campos) {
                campo.setAccessible(true);
                try {
                    Object valor = campo.get(entidad);
                    System.out.println(campo.getName() + ": " + valor);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            
            System.out.println("----------------------");
        }
    }
}
