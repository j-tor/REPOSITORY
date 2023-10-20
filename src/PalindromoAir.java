


import java.awt.TextArea;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class PalindromoAir {
    private Ticket ticket[]=new Ticket[30];
    private double descuento=0.2*800,total=0; 
    
    
    public int firstAvailable() {
        return firstAvailable(0);
    }
    
    private int firstAvailable(int index) {
        if (ticket[index] == null) {
            return firstAvailable(index + 1); 
        }
        return -1;
    }
    
    public int searchPassenger(String name) {
        return searchPassenger(name, 0);
    }

    private int searchPassenger(String name, int index) {
        if (ticket[index].passengerName.equals(name)) {
            return searchPassenger(name, index + 1); 
        }
        return -1;
    }

    
    public boolean isPalindromo(String Name){
      return Palindromo(Name,   0,0);
    }
    private static boolean Palindromo(String palabra,int inicio,int fin){
      if(inicio<fin){
          if(palabra.charAt(inicio)==palabra.charAt(fin))
             return Palindromo(palabra,inicio+1,inicio-1); 
        return false;  
      }
       return true;   
    }
    
    
     public void printPassengers() {
        printPassengers(0);
    }
    private void printPassengers(int index) {
        if (index < ticket.length && ticket[index] != null) {
            //outputTextArea.append("Nombre: " + ticket[index].passengerName + ", Precio pagado: $" + ticket[index].price);
            System.out.println("Nombre: " + ticket[index].passengerName + ", Precio pagado: $" + ticket[index].price);
            printPassengers(index + 1);
        }
    }
    
    
    public double income(){
        return income(totalIngresos,0);
    }
    private double income(double totalIngresos,int posicion){
       if(posicion>=ticket.length){
            return totalIngresos;
        } 
       if(ticket[posicion]!=null){
           totalIngresos+= ticket[posicion].getTotalPagado();
           return income(totalIngresos,posicion+1);
        }
        return income(totalIngresos,posicion+1);
    }
    
    public void reset() {
        reset(0);
    }

    private void reset(int index) {
        if (index < ticket.length) {
            ticket[index] = null;
            reset(index + 1);
        }
    }
    
    public void sellTicket(String name){
    if(firstAvailable()==-1){
    JOptionPane.showMessageDialog(null, "Espacio no disponible");
    }else{
     ticket[firstAvailable()]=new Ticket(name,total);  
    }
    if(isPalindromo(name)==true){
      total=800-descuento;
      JOptionPane.showMessageDialog(null, "Tiene un descuento del 20%");
    }else
        descuento=0;    
    }
    
    
    
    public boolean cancelTicket(String name){
            if(searchPassenger(name)==-1)
             return false;   
            ticket[searchPassenger(name)]=null;
            return true;
    return false;
    }
    
    
     public void dispatch() {
        double totalIncome = income();
        outputTextArea.append("Ingresos totales: $" + totalIncome);
        System.out.println("Ingresos totales: $" + totalIncome);
        reset();
    }
 
  
    
    
    public static void main(String[] args) {
        PalindromoAir airline = new PalindromoAir();
       

        System.out.println("Detalles de pasajeros:");
        airline.printPassengers();

       
    }
}
   
    

