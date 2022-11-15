import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

 public class colaCircularTDA<E> {
    private int maxtam;   //Tamaño maximo
    int [] colaCir= new int [maxtam];
    //private E[] colaCir;
    private int finl;
    private int frente;       
    private int elemts; //Número de elementos en la cola
    
    public colaCircularTDA() {
        this.maxtam = 5;
        colaCir= new int [maxtam];
        finl=0;
        frente=0;       
        elemts=0; //Número de elementos en la cola
    }

    // Agrega elementos al final     
    public void agregar(int dato){
        if(elemts==colaCir.length){
         System.out.println("Cola circular está llena.");
        }else{
         colaCir[finl] = dato;
         finl= (finl + 1) % colaCir.length;    
         elemts++; // Incrementa numero de elementos
         System.out.println("FINAL= "+ finl+ "\tFRENTE= "+ frente);
         
        }
        
    }
 
     //Saca elementos del frente
    public int eliminar(){
        int eliminado = 0;
        if(elemts==0){
         System.out.println("Cola circular está vacía");
        }else{
           eliminado = colaCir[frente];
         colaCir[frente] = 0;
         frente = (frente + 1) % colaCir.length;
            elemts--; // Reduce el numero de elementos en la cola
         System.out.println("FINAL= "+ finl+ "\tFRENTE= "+ frente);
        }
       return eliminado;
    }
    
    public void imprimirCola(){
        int i;
        if(frente != finl){
            i = (frente +1) %colaCir.length;
            while(i!=finl){
                System.out.print(""+colaCir[i-1]);
                i = (i+1) % colaCir.length;
            }
        }
        else
        System.out.println("Cola vacia!");
    }
    
  
    public static void main(String[] args) {
        ArrayList<Integer> cc = new ArrayList<Integer>(5); //tamaño original de la cola
        colaCircularTDA cocir = new colaCircularTDA();
        int dato, opc;
        Scanner sc= new Scanner(System.in);
        
        do{
            System.out.print("\n\t\tMENÚ\n1.Agregar a cola\t\t2.Eliminar a cola\t\t3.Salir\n");
            System.out.print("Ingrese una opción: ");
            opc=sc.nextInt();
        switch (opc){
            case 1: 
                System.out.print("Ingrese entero a agregar: ");
                dato=sc.nextInt();
                cocir.agregar(dato);
                cocir.imprimirCola();

                break;
             
            case 2: 
                System.out.print("Eliminando: "+cocir.eliminar()+" \n");
                cocir.imprimirCola();
                break;
                
            case 3:
                System.exit(0);
                break;
            
            default:
                System.out.println("Opción no válida.");
                    
        }
        }while (opc!=0);
       
    }
 }