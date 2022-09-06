import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

import java.util.ArrayList;


/**
 * Este programa permite llevar el control de los anuncions generados para encontrar a un perro.
 * @author: Diego Fernando Gonzalez Gonzalez
 * @version: 05/09/202
 */

public class Principal {
    public static void main(String[]  args){       
        Scanner teclado = new Scanner(System.in);        
        Estacionamiento estacionamiento = new Estacionamiento();   

        ArrayList<Detalle> detalles;
        detalles = new ArrayList<Detalle>();

        int opt; 
        int idEstacionamiento;
        boolean isOut = false;

        System.out.println("=============================== INGRESO ESTACIONAMIENTO ===============================");
        System.out.println("---- Para poder empezar necesitamos los datos de los 5 estacionamientos: \n");


        /**
         * Datos de estacionamiento
        */
        System.out.println("\n Ingresa el nombre del estacionamiento:");
        estacionamiento.setNombre(teclado.nextLine());
        System.out.println("\n Ingresa la dirección del estacionamiento:");
        estacionamiento.setDireccion(teclado.nextLine());

        for(int i=0; i<1; i++){
            int techo;
            int aereo;

            /**
            * Datos de parqueo
            */
            EspacioParqueo parqueo = new EspacioParqueo();
            System.out.println("\n ====== ESPACIO NO." + i + 1);
            System.out.println("\n Ingresa el largo del estacionamiento:");
            parqueo.setLargo(Integer.parseInt(teclado.nextLine()));            
            System.out.println("\n Ingresa el ancho del estacionamiento:");
            parqueo.setAncho(Integer.parseInt(teclado.nextLine()));
            System.out.println("\n Ingresa el alto del estacionamiento:");
            parqueo.setAltura(Integer.parseInt(teclado.nextLine()));

            System.out.println("\n El parqueo es techado: 1.SI  2.NO");
            techo = Integer.parseInt(teclado.nextLine());
            if(techo == 1){
                parqueo.setIsTechado(true);
            }else{
                parqueo.setIsTechado(false);
            }

            System.out.println("\n El parqueo es aereo: 1.SI  2.NO");
            aereo = Integer.parseInt(teclado.nextLine());
            if(aereo == 1){
                parqueo.setIsAereo(true);
            }else{
                parqueo.setIsAereo(false);
            }

            System.out.println("\n Ingresa el precio de este espacio:");
            parqueo.setPrecio(Integer.parseInt(teclado.nextLine()));
            parqueo.setStatus(false);

            estacionamiento.setEspaciosParqueo(parqueo);
        }

        while(isOut == false){
        
            System.out.println("------------------- MENU OPCIONES -------------------");
            System.out.println("selecciona alguna de las siguientes opcines: ");

            System.out.println("1...........................Ingresar Carro");
            System.out.println("2...........................Egresar Carro");
            System.out.println("3...........................Estadisticas");
            System.out.println("4...........................Salir");
            opt = Integer.parseInt(teclado.nextLine());

            switch(opt){
                case 1:
                    Detalle newDetalle = new Detalle();
                    System.out.println("\n ------------------------ === INGRESO DE CARROS ------------------------ ===\n");

                    for(int i = 0 ; i < estacionamiento.getEspaciosParqueo().size() ; i++){
                        if(estacionamiento.getEspaciosParqueo().get(i).getStatus() == false){
                            System.out.println(("==================   ID: " + i+ "   ============================================"));
                            System.out.println("LARGO: " + estacionamiento.getEspaciosParqueo().get(i).getLargo() + "   ALTURA: " + estacionamiento.getEspaciosParqueo().get(i).getAltura() + "   ANCHO: " + estacionamiento.getEspaciosParqueo().get(i).getAncho());
                            System.out.println("TECHADO: " + estacionamiento.getEspaciosParqueo().get(i).getIsTechado() + "   ELEVADO: " + estacionamiento.getEspaciosParqueo().get(i).getIsAereo());
                            System.out.println("===================   PRECIO: " + estacionamiento.getEspaciosParqueo().get(i).getPrecio() + "   ===================");
                        }
                    }

                    System.out.println("\n selecciona una estacionamiento: ");
                    idEstacionamiento = Integer.parseInt(teclado.nextLine());
                    estacionamiento.getEspaciosParqueo().get(idEstacionamiento).setStatus(true);

                    System.out.println("Ingresa la placa del carro: ");
                    newDetalle.setPlaca(teclado.nextLine());
                    System.out.println("Ingresa la marca del carro: ");
                    newDetalle.setMarcal(teclado.nextLine());
                    System.out.println("Ingresa el modelo del carro: ");
                    newDetalle.setModelo(teclado.nextLine());
                    newDetalle.setStatus(true);
                    newDetalle.setEstacionamientos(estacionamiento);

                    detalles.add(newDetalle);
                    break;

                case 2:                
                    System.out.println("\n ------------------------ === EGRESO DE CARROS ------------------------ ===\n");
                    for(int i = 0 ; i < detalles.size() ; i++){
                        if(detalles.get(i).getStatus() == false){
                            System.out.println(("==================   ID: " + i+ "   ============================================"));
                            System.out.println(("PLACA: " + detalles.get(i).getPlaca() + "   MARCA: " + detalles.get(i).getMarcal() + "   MODELO: " + detalles.get(i).getModelo()));                        
                            System.out.println("================================================================================");
                        }    
                    }
                    System.out.println("selecciona el carro: ");
                    idEstacionamiento = Integer.parseInt(teclado.nextLine());

                    System.out.println("Ingresa el total de horas: ");
                    detalles.get(idEstacionamiento).setHorasEstacionado(Integer.parseInt(teclado.nextLine()));
                    System.out.println("Ingrese ");

                    detalles.get(idEstacionamiento).setStatus(false);                
                    break;
                case 3:
                    System.out.println("OPCION 3");
                    break;
                case 4:
                    isOut = true;
                    System.out.println("================ UN GUSTO PODER ATENDERTE ================");
                    break;
            }
        }

    }
}