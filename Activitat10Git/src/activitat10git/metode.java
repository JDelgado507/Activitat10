/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat10git;

/**
 *
 * @author javie
 */
public class metode {
    public static void imprimirEspacio(int i){
                for (int j=0; j < i  ;++j){
                System.out.print(" ");
            }
    }
    
    public static void imprimirTriangulo(String M , int i){
        for (int j=i; j < M.length() ;++j){
                System.out.print(M.charAt(j));
            }
        
      
    }
    
    public static void imprimirEspacio(String M , int i){
                for (int j=i; j < M.length() ;++j){
                System.out.print(" ");
            }
    }
   public static void imprimirSegundoTriangle(String M ,int i){
               for (int j= M.length() - i - 1; j < M.length(); ++j){
                System.out.print(M.charAt(j));
            }
   } 
   public static void imprimirPrimerTriangleSegundaParte(String M, int i){
     for (int j= i; j<M.length(); ++j){
                System.out.print(M.charAt(j));
            }
   }
   
   public static void imprimirSegundoTriangleSegundaParte(String M, int i){
              for(int j=0; j < i + 1; ++j){
                System.out.print(M.charAt(j));
            }
   }
}
