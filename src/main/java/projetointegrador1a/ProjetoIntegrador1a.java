
package projetointegrador1a;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gustavo Wilker
 */
public class ProjetoIntegrador1a {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        int sintoma; 
        int covid = 0,dengue = 0, tuberculose = 0, pneumonia = 0;
        
        System.out.println("                Bem-vindo ao Sistema de detecção de possivel doença!\n");
        System.out.println(" O Programa compara 4 doenças (Dengue, COVID-19, Tuberculose e Pneumonia)\ne informa a mais provável de ser de acordo com os sintomas informados.\n");
        System.out.println("Observe o quadro abaixo contendo os sintomas mais populares.");
        System.out.println(" 1  - Febre");
        System.out.println(" 2  - Tosse seca");
        System.out.println(" 3  - Cansaço");
        System.out.println(" 4  - Dores no corpo");
        System.out.println(" 5  - Diarreia");
        System.out.println(" 6  - Dor de Cabeça");
        System.out.println(" 7  - Perca de paladar ou olfato");
        System.out.println(" 8  - Dificuldade de respirar ou falta de ar");
        System.out.println(" 9  - Tosse com sangue");
        System.out.println(" 10 - Suor frio");
        System.out.println(" 11 - Forte dor nas articulações");
        System.out.println(" 12 - Perca de apetite");
        System.out.println(" 13 - Manchas avermelhadas na pele");
        System.out.println(" 14 - Catarro");
        System.out.println(" 15 - Calafrios");
        System.out.println(" Digite um número correspondente a um sintoma que você está sentindo");
            sintoma = s.nextInt();
        
        switch (sintoma){
                   case 1:
                       covid += 1; 
                       dengue += 1;
                       tuberculose +=1;
                       pneumonia += 1;
                       break;
                   case 2:
                       covid += 1;
                       pneumonia +=1;
                       tuberculose +=1;
                       break;
                   case 3:
                       covid += 1;
                       dengue +=1;
                       tuberculose +=1;
                       pneumonia += 1;
                       break;
                   case 4:
                       covid += 1;
                       dengue += 1;
                       break;
                   case 5:
                       covid += 1;
                       break;
                   case 6:
                       covid += 1;
                       dengue += 1;
                       break;
                   case 7:
                       covid += 1;
                       break;
                   case 8:
                       covid += 1;
                       pneumonia += 1;
                       break;
                   case 9:
                       tuberculose += 1;
                       break;
                   case 10:
                       dengue += 1;
                       tuberculose += 1;
                       pneumonia += 1;
                       break;
                   case 11:
                       dengue +=1;
                       break;
                   case 12:
                       dengue +=1;
                       tuberculose +=1;
                       break;
                   case 13:
                       dengue += 1;
                       break;
                   case 14:
                       covid += 1;
                       pneumonia +=1;
                       tuberculose +=1;
                       break;
                   case 15:
                       pneumonia +=1;
                       break;
                   default:
                       System.out.println("Sintoma não indentificado\n");                  
                       
                } 
        System.out.println("            Digite 0 ao acabar de citar todos os seus sintomas\n                      para finalizar o  programa:\n ");
        
       do{
           System.out.println("Digite um número correspondente a um outro sintoma que você está sentindo: ");
            sintoma = s.nextInt();
            
               switch (sintoma){
                   case 1:
                       covid += 1; 
                       dengue += 1;
                       tuberculose +=1;
                       pneumonia += 1;
                       break;
                   case 2:
                       covid += 1;
                       pneumonia +=1;
                       tuberculose +=1;
                       break;
                   case 3:
                       covid += 1;
                       dengue +=1;
                       tuberculose +=1;
                       pneumonia += 1;
                       break;
                   case 4:
                       covid += 1;
                       dengue += 1;
                       break;
                   case 5:
                       covid += 1;
                       break;
                   case 6:
                       covid += 1;
                       dengue += 1;
                       break;
                   case 7:
                       covid += 1;
                       break;
                   case 8:
                       covid += 1;
                       pneumonia += 1;
                       break;
                   case 9:
                       tuberculose += 1;
                       break;
                   case 10:
                       dengue += 1;
                       tuberculose += 1;
                       pneumonia += 1;
                       break;
                   case 11:
                       dengue +=1;
                       break;
                   case 12:
                       dengue +=1;
                       tuberculose +=1;
                       break;
                   case 13:
                       dengue += 1;
                       break;
                   case 14:
                       covid += 1;
                       pneumonia +=1;
                       tuberculose +=1;
                       break;
                   case 15:
                       pneumonia +=1;
                       break;
                   case 0:
                       System.out.println("OK! finalizando o programa\n");
                       break;
                   default:
                       System.out.println("Sintoma não indentificado.");                  
                       
                }                   
             
       }while (sintoma != 0);
       
    
    System.out.println("                   POSSÍVEIS DOENÇAS:    \n ");
    System.out.println(((dengue * 100)/15) + " % de chance de ser Dengue.");
    System.out.println(((covid * 100)/15) + " % de chance de ser COVID-19.");
    System.out.println(((tuberculose * 100)/15) + " % de chance de ser Tuberculose.");
    System.out.println(((pneumonia * 100)/15) + " % de chance de ser Pneumonia.\n");
    
     if((dengue !=0) && (covid!=0)&&(tuberculose!=0)&&(pneumonia!=0)){
         System.out.println("A doença que tiver a maior porcentagem, é a mais provável de ser.");
     }else if((dengue==0)&&(covid==0)&&(tuberculose==0)&&(pneumonia==0)){
         System.out.println("Provavelmente você não está com nemhuma dessas 4 doenças.");
     }
    
    
    
    
    
    
       
         
     
       
    }
    
}
