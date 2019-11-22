/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    
    public static void main(String[] args) {
        final int cantidad_encargada = 3;
        final double cantidad_comprada;
        final String persona = "Jaimito";
        final String articulo = "Patatas";
        final String imprevisto = "Piruleta";
        final double dinero_entrgado = 1.00;
        final double precioPatata = 0.3;
        final double precioPiruleta = 0.2;
        // Variable
        double dinero_actual; 
        
        // Operaciones
        dinero_actual = dinero_entrgado - precioPiruleta;
        cantidad_comprada  = dinero_actual / precioPatata - 1;
//        dinero_actual = cantidad_comprada % precioPatata;
        
        
        // Cabecera
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
              
        // Salida consola
        System.out.printf("Persona encargada.....: %s%n", persona);
        System.out.printf("Articulo encargado....: %s%n", articulo);
        System.out.printf("Cantidad encargada....: %d kg %n", cantidad_encargada);
        System.out.println("---");
        System.out.printf("Precio encargo........: %3.2f €/kg %n", precioPatata);
        System.out.printf("Dinero suministrado...: %3.2f € %n", dinero_entrgado);
        System.out.println("---");
        System.out.printf("Articulo imprevisto...: %s%n", imprevisto);
        System.out.printf("Precio imprevisto.....: %3.2f € %n", precioPiruleta);
        System.out.println("---");
    }
    
}
