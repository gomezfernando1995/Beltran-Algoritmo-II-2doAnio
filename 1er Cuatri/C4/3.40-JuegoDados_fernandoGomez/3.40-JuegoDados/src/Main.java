/*
Ejercicio 3.40: Dados
Escribe un programa para jugar a los dados con el ordenador.
Las reglas deljuego son las siguientes:

-> El jugador humano dispondrá de una cantidad inicial de dinero que seintroducirá por teclado
-> El jugador apostará una cantidad de dinero (siempre igual o menor delque le queda)
-> Después, se tirarán tres dados (lo cual se puede simular con el métodoMath.random())
-> Si en los tres dados sale la misma cantidad, el dinero apostado por el
jugador:  a) se  multiplica  por  5  si  en  los  dados  ha  salido  un  6; 
          b) semultiplica por 3 si sale cualquier otra cantidad; 
          c) si solo en dos dados de los tres sale la misma cantidad, el dinero apostado se multiplica por 2
-> En cualquier otro caso, el dinero apostado se pierde
-> El proceso se repite hasta que el jugador se queda sin dinero o hasta quedecide dejar de jugar

 */

public class Main {

    public static void main(String[] args) {

        double user_dinero, user_apuesta, dinero_ganado,respuesta=0;
        User usuario = new User();
        

        user_dinero = usuario.ingresarDinero(" Con que cantidad de dinero desea comenzar a jugar ? ");
        while (usuario.vRangosDiner(user_dinero, 0, 100000) != 0) {
            user_dinero = usuario.ingresarDinero(" Error! Ingreso una cifra invalida, reingrese dinero : ");
        }
        usuario.setDineroI(user_dinero);

        // COMIENZA EL JUEGO
        do {
            
            System.out.println(" ----------------------------------- \n          Dinero  : "+usuario.getDineroI()+"\n ----------------------------------- ");
           
            user_apuesta = usuario.ingresarDinero(" Ingrese monto a apostar: ");
            while (usuario.vRangosDiner(user_apuesta, 0, user_dinero) != 0) {
                user_apuesta = usuario.ingresarDinero(" Error! Ingreso una apuesta incorrecta, reingrese apuesta : ");
            }
            usuario.setApuestaI(user_apuesta);
            System.out.println(" ----------------------------------- \n          Apuesta : "+usuario.getApuestaI()+"\n ----------------------------------- ");
            Dado dadoUno = new Dado();
            Dado dadoDos = new Dado();
            Dado dadoTres = new Dado();
              
            System.out.println(" Dado uno = "+dadoUno.getValor()+"\n Dado dos = "+dadoDos.getValor()+"\n Dado tres = "+dadoTres.getValor()+"\n\n");
            
            if (dadoUno.getValor() == 6 && dadoDos.getValor() == 6 && dadoTres.getValor() == 6) {

                dinero_ganado = usuario.getDineroI() + (user_apuesta * 5);
                usuario.setDineroI(dinero_ganado);               
                System.out.println("Ganastes: "+dinero_ganado);

            } else if ((dadoUno.getValor() < 6 && dadoUno.getValor() == dadoDos.getValor() && dadoUno.getValor() == dadoTres.getValor())
                    || (dadoDos.getValor() < 6 && dadoDos.getValor() == dadoUno.getValor() && dadoDos.getValor() == dadoTres.getValor())
                    || (dadoTres.getValor() < 6 && dadoTres.getValor() == dadoUno.getValor() && dadoTres.getValor() == dadoDos.getValor())) {

                dinero_ganado = usuario.getDineroI() + (user_apuesta * 3);
                System.out.println("Ganastes: "+user_apuesta * 3);
                usuario.setDineroI(dinero_ganado);

            } else if (dadoUno.getValor() == dadoDos.getValor() || dadoUno.getValor() == dadoTres.getValor() || dadoDos.getValor() == dadoTres.getValor()) {
                dinero_ganado = usuario.getDineroI() + (user_apuesta * 2);
                System.out.println("Ganastes: "+user_apuesta * 2);
                usuario.setDineroI(dinero_ganado);
            } else {
                dinero_ganado = usuario.getDineroI() - (user_apuesta);
                System.out.println(" Lo siento, no gano esta vez , perdio : $" + usuario.getApuestaI());
                usuario.setDineroI(dinero_ganado);
            }
            
            if(usuario.getDineroI()>0)
            {            
               System.out.println(" ----------------------------------- \n          Dinero restante : "+usuario.getDineroI());
               respuesta = usuario.ingresarDinero("\n        Desea seguir jugando ? 1-Para seguir / 2-Para salir");
               while(!(respuesta ==1 || respuesta==2))
               {
               respuesta = (int) usuario.ingresarDinero(" Error, Desea seguir jugando ? 1-Para seguir / 2-Para salir");
               }
                System.out.println("\n ----------------------------------- ");
                
                if(respuesta == 2){  System.out.println(" Gracias por jugar capo chau !"); }
                
            }else{      System.out.println(" Se quedo sin dinero , gracias por jugar"); }      
            
        }while(!(usuario.getDineroI()==0 || respuesta ==2));// FINALIZA EL JUEGO
        
    }
}
