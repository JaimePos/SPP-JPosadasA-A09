
package spp.jposadasa.a09;
import java.util.*;
public class SPPJPosadasAA09 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x;
        x = solicitaTamaño();
        System.out.println("Matriz 1");
        int [][] matrizA = matriz(x);
        System.out.println("Matriz 2");
        int [][] matrizB = matriz(x);
        
        sumatriz(matrizA, matrizB);
    }

    public static int solicita(){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int entero = 0;
        do {
            try{
                System.out.println("Introduce un numero entero");
                entero = kb.nextInt();
                flag = false;
            }catch (Exception e){
                System.out.println("El dato no es entero");
                kb.next();
                flag = true;
            }
        } while (flag);
    return entero;
                }
    
    public static int [][] matriz (int x){
       int [][] matriz = new int [x][x];
        for (int i = 0; i < matriz[i].length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = solicita();
        }}
        return matriz;
    }
    
    public static int solicitaTamaño (){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int entero = 0;
        do {
            System.out.println("Introduce el tamaño del arreglo");
            try{
                entero = kb.nextInt();
                flag = false;
            }catch (Exception er){
                System.out.println("El dato no es entero");
                flag = true;
                kb.next();
            }
        } while (flag);
    return entero;
                }
    
    public static int [][] sumatriz (int [][] matrizA, int [][] matrizB){
        int [][] matrizC = new int [matrizA.length][matrizA.length];
        System.out.println("La suma es: ");
        for (int i = 0; i < matrizA[i].length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.println(matrizC[i][j]);
        }System.out.println("");
        }
        return matrizC;
    }
   
    
}