package org.example;


import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String PaisCliente;
        int anoNacimientoCliente;
        String mesNacimientoCliente;
        int diaNacimientoCliente;

        //pedimos los datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais de origen: ");
        PaisCliente=leerDato.nextLine();

        System.out.println("Ingrese mes que nacio: ");
        mesNacimientoCliente=leerDato.nextLine();

        System.out.println("Ingrese año que nacio: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese dia que nacio: ");
        diaNacimientoCliente=leerDato.nextInt();

        //procesando las entradas

        //1. ¿Como calcular la edad del cliente?
        //restar el año actual menos el año de nacimiento
        int edadCliente=2024-anoNacimientoCliente;

        System.out.println("su edad es: "+edadCliente);

        //2. Decidir con base en la edad si es cliente es mayor de edad
        if (edadCliente>=18){
            System.out.println("Usted es mayor de edad");
            //menu de licores
            System.out.println("MENU");
            System.out.println("1... Botella aguardiente antioqueño ---- $150 COP");
            System.out.println("2... Botella Don Julio ---- $600 COP");
            System.out.println("3... Botella de Blue Label ---- $1500 COP");
            System.out.println("4... Botella de Jagger ---- $200 COP");
            //botella de guaro--150
            //botella de don julio--600
            //botella de blue label--1500
            //botella de jagger--200
        }else{
            System.out.printf("usted es un niño vayase a mimir");
        }











    }
}



