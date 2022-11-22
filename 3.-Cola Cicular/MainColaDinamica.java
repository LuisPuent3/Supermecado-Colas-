import java.util.Scanner;

public class MainColaDinamica 
{
	public static void main(String[] args)
	{
		ColaDinamica colaPersona = new ColaDinamica();
        ColaDinamica colaCarrito = new ColaDinamica();
        ColaDinamica colaSuper = new ColaDinamica();
        ColaDinamica colaCaja1 = new ColaDinamica();
        ColaDinamica colaCaja2 = new ColaDinamica();
        ColaDinamica colaCaja3 = new ColaDinamica();
		
		colaPersona.Inicializar();
        colaCarrito.Inicializar();

        System.out.println("Bienvenido al supermercado");
        System.out.println("Estas son las personas que estan en la cola por entrar al supermercado");
        System.out.println();
       
        //lleno el arreglo de personas con numeros consecutivos 
        //tamaño del arreglo aleatorio entre 5 y 50
        // los guardo en la cola colaPersona
        int tam = (int) (Math.random() * 46 + 5);
        int[] personas = new int[tam];
        for (int i = 0; i < tam; i++) {
            personas[i] = i + 1;
            colaPersona.Acolar(personas[i]);
        }
        System.out.println("Personas en la cola: ");
		MostrarCola(colaPersona);

        //lleno el arreglo de carritos con numeros de 1 - 25 y que cada numero este acompañado de una letra c al inicio
        //tamaño del arreglo 25
        // los guardo en la cola colaCarrito

        colaSuper.Inicializar();
        int[] carritos = new int[25];
        for (int i = 0; i < 25; i++) {
            carritos[i] = i + 1;
            colaCarrito.Acolar(carritos[i]);

        }
        System.out.println();
        System.out.println();
        System .out.println("Estos son los carritos disponibles que tienes en el supermercado: ");
        System.out.println();
        System.out.println("Carritos en la cola: ");
        MostrarCola(colaCarrito);


        // //lleno el la cola colaSuper con los datos de las personas y los carritos
        // //solo se agregan personas y carritos si hay carritos disponibles 
        // //los guardo en la cola colaSuper
        // //filtro los numeros repetidos y se sacan de la cola colaSuper

        // int i = 0;
        // while (!colaPersona.ColaVacia() && !colaCarrito.ColaVacia()) {
        //     colaSuper.Acolar(colaPersona.Primero());
        //     colaSuper.Acolar(colaCarrito.Primero());
        //     colaPersona.Desacolar();
        //     colaCarrito.Desacolar();

        //     //quito los numeros repetidos de la cola colaSuper
        //     int j = 0;
        //     while (j < colaSuper.Tamanio()) {
        //         int dato = colaSuper.Primero();
        //         colaSuper.Desacolar();
        //         if (dato != colaSuper.Primero()) {
        //             colaSuper.Acolar(dato);
        //         }
        //         j++;
        //     }
        // }
        // System.out.println("Personas y carritos en la cola: ");
        // MostrarCola(colaSuper);   

        //lleno el arreglo supermercado con los datos de las personas y los carritos
        //solo se agregan personas y carritos si hay carritos disponibles
        //imptimo el arreglo supermercado

        int[] supermercado = new int[100];
        int i = 0;
        while (!colaPersona.ColaVacia() && !colaCarrito.ColaVacia()) {
            supermercado[i] = colaPersona.Primero();
            supermercado[i + 1] = colaCarrito.Primero();
            colaPersona.Desacolar();
            colaCarrito.Desacolar();
            i += 2;
        }
        
        //imprimo el arreglo supermercado
        for (int j = 0; j < supermercado.length; j++) {
            if (supermercado[j] != 0) {
                
            }
        }
        System.out.println();

        //corrigo el arreglo supermercado
        // quito los numeros repetidosdel arreglo
        //imprimo el arreglo supermercado

        int j = 0;
        while (j < supermercado.length) {
            int dato = supermercado[j];
            if (dato != 0) {
                for (int k = j + 1; k < supermercado.length; k++) {
                    if (dato == supermercado[k]) {
                        supermercado[k] = 0;
                    }
                }
            }
            j++;
        }
       
        //imprimo el arreglo supermercado
        for (int k = 0; k < supermercado.length; k++) {
            if (supermercado[k] != 0) {
               
            }
        }
        System.out.println();

        //lleno la cola colaSuper con los datos del arreglo supermercado
        //imprimo la cola colaSuper

        for (int k = 0; k < supermercado.length; k++) {
            if (supermercado[k] != 0) {
                colaSuper.Acolar(supermercado[k]);
            }
        }

        System.out.println("Personas con carritos dentro del supermecado ");
        MostrarCola(colaSuper);
       

        ColaDinamica colaFila = new ColaDinamica();
        colaFila.Inicializar();

        //lleno el arreglo fila con numeros sin repetir de la colaSuper

       
 
        MostrarCola(colaFila);

        //
       

        //elimino los numeros repetidos de la cola colaSuper



        colaCaja1.Inicializar();
        colaCaja2.Inicializar();
        colaCaja3.Inicializar();


        //lleno las colas de las cajas con los datos de la cola colaSuper de forma equitativa
        //las guardo en la caja 1, 2 y 3
        //imprimo las colas de las cajas


       

        int opcion = 0;
        //el usuario ùede elegir una opcion del menu
        while (opcion != 8) {
            System.out.println("1. Ver carritos disponibles");
            System.out.println("2. Ver personas en fila de espera");
            System.out.println("3. Emparejar carritos y personas");
            System.out.println("4. Ver personas dentro del supermercado");
            System.out.println("5. Ver personas en fila de espera");
            System.out.println("6. Ver personas en fila de pago");
            System.out.println("7. Salir y pagar las personas del supermercado para liberar carritos");
            System.out.println("Ingrese una opcion: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Carritos disponibles: ");
                    MostrarCola(colaCarrito);
                    break;
                case 2:
                    System.out.println("Personas en fila de espera: ");
                    MostrarCola(colaPersona);
                    break;
                case 3:
                    System.out.println("Emparejando carritos y personas: ");
                    //creo condicon para ver si la cola de carritos y persona esta vacia 
                    //sino esta descolo la cola de carritos y personas y las guardo en un arreglo distinto cada uno

                    int[] carritosMenu = new int[100];
                    int[] personasMenu = new int[100];
                    int m = 0;
                    while (!colaCarrito.ColaVacia() && !colaPersona.ColaVacia()) {
                        carritosMenu[m] = colaCarrito.Primero();
                        colaCarrito.Desacolar();
                        personasMenu[m] = colaPersona.Primero();
                        colaPersona.Desacolar();
                        m++;
                    }
                    //sustituyo los valores del arreglo carritosMenu por numeros del 1 al tamaño del arreglo
                    // y los valores del arreglo personasMenu por numeros del 1 al tamaño del arreglo
                    for (int n = 0; n < carritosMenu.length; n++) {
                        if (carritosMenu[n] != 0) {
                            carritosMenu[n] = n + 1;
                        }
                    }
                    for (int n = 0; n < personasMenu.length; n++) {
                        if (personasMenu[n] != 0) {
                            personasMenu[n] = n + 1;
                        }
                    }
                    //imprimo los arreglos carritosMenu y personasMenu
                    System.out.println("Carritos: ");
                    for (int n = 0; n < carritosMenu.length; n++) {
                        if (carritosMenu[n] != 0) {
                            System.out.print(carritosMenu[n] + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Personas: ");
                    for (int n = 0; n < personasMenu.length; n++) {
                        if (personasMenu[n] != 0) {
                            System.out.print(personasMenu[n] + " ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Personas dentro del supermercado: ");
                    MostrarCola(colaSuper); 
                    break;
                case 5:
                    System.out.println("Personas en fila de espera: ");
                    MostrarCola(colaFila);
                    break;
                case 6:
                    System.out.println("Personas en fila de pago: ");
                                
                    int caja1 = 0;
                    int caja2 = 0;
                    int caja3 = 0;
                    while (!colaSuper.ColaVacia()) {
                        if (caja1 <= caja2 && caja1 <= caja3) {
                            colaCaja1.Acolar(colaSuper.Primero());
                            caja1++;
                        } else if (caja2 <= caja1 && caja2 <= caja3) {
                            colaCaja2.Acolar(colaSuper.Primero());
                            caja2++;
                        } else if (caja3 <= caja1 && caja3 <= caja2) {
                            colaCaja3.Acolar(colaSuper.Primero());
                            caja3++;
                        }
                        colaSuper.Desacolar();
                    }
        
                    //muestro las colas de las cajas
                    System.out.println("Caja 1: ");
                    MostrarCola(colaCaja1);
                    System.out.println("Caja 2: ");
                    MostrarCola(colaCaja2);
                    System.out.println("Caja 3: ");
                    MostrarCola(colaCaja3);
                    //vuelvo global las colas de las cajas




                    break;
                case 7:
                    System.out.println("Saliendo y pagando las personas del supermercado para liberar carritos: ");
                    //desacolo las colas de las cajas y las guardo en el arreglo cajaMenu

                    int[] cajaMenu = new int[100];

                    int n = 0;
                    while (!colaCaja1.ColaVacia()) {
                        cajaMenu[n] = colaCaja1.Primero();
                        colaCaja1.Desacolar();
                        n++;
                    }
                    while (!colaCaja2.ColaVacia()) {
                        cajaMenu[n] = colaCaja2.Primero();
                        colaCaja2.Desacolar();
                        n++;
                    }
                    while (!colaCaja3.ColaVacia()) {
                        cajaMenu[n] = colaCaja3.Primero();
                        colaCaja3.Desacolar();
                        n++;
                    }
                    //ordeno los numeros del arreglo de menor a mayor

                    for (int a = 0; a < cajaMenu.length; a++) {
                        for (int b = 0; b < cajaMenu.length - 1; b++) {
                            if (cajaMenu[b] > cajaMenu[b + 1]) {
                                int aux = cajaMenu[b];
                                cajaMenu[b] = cajaMenu[b + 1];
                                cajaMenu[b + 1] = aux;
                            }
                        }
                    }

                    //creo una condicion si es que la colaCarritos esta vacia 
                    //si colaCarrito esta vacia, lo lleno con los valores del arreglo cajaMenu
                    //si no esta vacia, desacolo la colaCarrito en un arreglo llamado carritosMenu
                    //y luego lleno la colaCarrito con los valores del arreglo cajaMenu
                    //y luego lleno la colaCarrito con los valores del arreglo carritosMenu
                    

                    if (colaCarrito.ColaVacia()) {
                        for (int a = 0; a < cajaMenu.length; a++) {
                            if (cajaMenu[a] != 0) {
                                colaCarrito.Acolar(cajaMenu[a]);
                            }
                        }
                    } else {
                        int[] carritosMenu2 = new int[100];
                        int f = 0;
                        while (!colaCarrito.ColaVacia()) {
                            carritosMenu2[f] = colaCarrito.Primero();
                            colaCarrito.Desacolar();
                            f++;
                        }
                        for (int a = 0; a < cajaMenu.length; a++) {
                            if (cajaMenu[a] != 0) {
                                colaCarrito.Acolar(cajaMenu[a]);
                            }
                        }
                        for (int a = 0; a < carritosMenu2.length; a++) {
                            if (carritosMenu2[a] != 0) {
                                colaCarrito.Acolar(carritosMenu2[a]);
                            }
                        }
                    }
                    System.out.println("Carritos liberados: ");
                    MostrarCola(colaCarrito);

                  
                    //sustituyo los valores del arreglo carritosMenu2 por numeros del 1 al tamaño del arreglo
    
             
                    break;

                case 8:
                    System.out.println("Saliendo del programa");
                    break;
                     //desacolo las colas colaCaja1, colaCaja2 y colaCaja3 en un arreglo en forma conseuctiva

                default:
                    System.out.println("Opcion incorrecta");

                
            }
        }
    


        // while (opcion != 7) {
        //     System.out.println("1. Ver carritos disponibles");
        //     System.out.println("2. Ver personas en fila de espera");
        //     System.out.println("3. Emparejar carritos y personas");
        //     System.out.println("4. Ver personas dentro del supermercado");
        //     System.out.println("5. Ver personas en fila de espera");
        //     System.out.println("6. Ver personas en fila de pago");
        //     System.out.println("7. Salir y pagar las personas del supermercado para liberar carritos");
        //     System.out.println("Ingrese una opcion: ");
            
        //     switch (opcion) {
        //         case 1:
        //             System.out.println("Carritos disponibles: ");
        //             MostrarCola(colaCarrito);
        //             break;
        //         case 2:
        //             System.out.println("Personas en fila de espera: ");
        //             MostrarCola(colaPersona);
        //             break;
        //         case 3:
        //             System.out.println("Emparejando carritos y personas: ");
        //             System.out.println("Personas y carritos en la cola: ");
        //             MostrarCola(colaSuper);
        //             break;
        //         case 4:
        //             System.out.println("Personas dentro del supermercado: ");
        //             MostrarCola(colaFila);
        //             break;
        //         case 5:
        //             System.out.println("Personas en fila de espera: ");
        //             MostrarCola(colaPersona);
        //             break;
        //         case 6:
        //             System.out.println("Personas en fila de pago: ");
        //             System.out.println("Caja 1: ");
        //             MostrarCola(colaCaja1);
        //             System.out.println("Caja 2: ");
        //             MostrarCola(colaCaja2);
        //             System.out.println("Caja 3: ");
        //             MostrarCola(colaCaja3);
        //             break;
        //         case 7:
        //             System.out.println("Saliendo y pagando las personas del supermercado para liberar carritos");
        //             break;
        //         default:
        //             System.out.println("Opcion incorrecta");
        //             break;}}
            
        








        
        // System.out.println("Personas y carritos en la cola: ");
        // MostrarCola(colaSuper);

        // System.out.println("Personas en fila ");
        // MostrarCola(colaPersona);
        // System.out.println("Carritos en fila ");
        // MostrarCola(colaCarrito);



	}
	
	public static void PasarCola(ColaDinamica origen, ColaDinamica destino)
	{
		while (!origen.ColaVacia())
		{
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void CopiarCola(ColaDinamica origen, ColaDinamica destino)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		PasarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			destino.Acolar(auxCola.Primero());
			origen.Acolar(auxCola.Primero());
			auxCola.Desacolar();
		}
	}
	
	public static void MostrarCola(ColaDinamica origen)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		CopiarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			System.out.print(auxCola.Primero() + ", ");
			auxCola.Desacolar();
		}
		
		System.out.println();
	}
}