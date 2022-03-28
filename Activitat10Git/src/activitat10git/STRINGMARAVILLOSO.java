/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat10git;
public class STRINGMARAVILLOSO{
    public static void main(String[] args){
        String M = "MARAVILLOSO";
        //Version Con metodos
        System.out.println("LA versió que tenim a github ha estat actualitzada i és mes actual que la que tinc en local");
 
        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)
        for (int i =0; i<M.length();i++){
            //Imprime espacios de la primera parte para el primer triangulo 
            metode.imprimirEspacio(i);
            //Imprime el primer triangulo de la primer parte 
            metode.imprimirTriangulo(M, i);
            //Imprime espacios entre el primero y segundo triangulo de la primera parte
            metode.imprimirEspacio(M, i);
            //Imprime el segundo triangulo de la primera parte
            metode.imprimirSegundoTriangle(M, i);
            System.out.println();
        }
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        for (int i =0; i<M.length();i++){
            //Imprime primer triangulo de la segunda parte
          metode.imprimirPrimerTriangleSegundaParte(M, i);
            //Imprime espacios entre primer y segundo triangulo
           metode.imprimirEspacio(i);
            //Imprime segundo triangulo de la segunda parte  
           metode.imprimirSegundoTriangleSegundaParte(M, i);
            System.out.println();
        }
    }    
}
