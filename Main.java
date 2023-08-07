/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaganadero;

import java.util.ArrayList;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        
        Finca finca1 = new Finca("Finca A", "Ubicación A", "Encargado A", "1234567890", "1111111111", 3, 100.0, 50);
        Finca finca2 = new Finca("Finca B", "Ubicación B", "Encargado B", "0987654321", "2222222222", 5, 200.0, 80);
        Finca finca3 = new Finca("Finca C", "Ubicación C", "Encargado C", "9876543210", "3333333333", 2, 150.0, 40);

 
        Ganado ganado1 = new Ganado("001", "Ganado1", "01-01-2020", 200.0, 'M', "Raza1");
        Ganado ganado2 = new Ganado("002", "Ganado2", "02-02-2021", 180.0, 'H', "Raza2");
        Potrero potrero1 = new Potrero("P001", "Potrero1", "Ocupado", "01-01-2022", "31-12-2022", 20, true, "Terreno1");

        finca1.agregarGanado(ganado1);
        finca1.agregarPotrero(potrero1);

        finca2.agregarGanado(ganado1);
        finca2.agregarGanado(ganado2);
        finca2.agregarPotrero(potrero1);
        
        
    }
 }
  