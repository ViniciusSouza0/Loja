package com.mycompany.loja;

import java.util.Locale;

public class Loja {   
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";
        String pessoa = "Vinicius";
        
        int idade = 72;
        int código = 5290;
        
        char genero = 'M';
        
        double preco1 = 2100;
        double preco2 = 650.50;
        double medidaDaMesa = 53.234567;
        
        System.out.printf("Produtos:\n%s está custando R$%.2f reais", produto1, preco1);
        System.out.printf("\n%s está custando R$%.2f reais", produto2, preco2);  
        System.out.printf("\nRegistro de pessoa: %s, %d anos, código %d e sexo: %c\n", pessoa, idade, código, genero);
        System.out.printf("\nMedida da Mesa com oito casas decimais: %f", medidaDaMesa); 
        System.out.printf("\nMedida da Mesa com três decimais: %.3f", medidaDaMesa );
        Locale.setDefault(Locale.US);   
        System.out.printf("\nMedida da Mesa com Ponto Decimal dos EUA: %.3f", medidaDaMesa);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
