package com.mycompany.algoritimo470;

public class VerificaPrimo {
    
    public boolean verificador(int numero){
        int quantidade = 0;
        for(int i = 1; i <= numero; i++){
            if(numero%i == 0){
                quantidade++;
            }
        }
        if(quantidade <= 2){
            return true;
        }else{
            return false;
        }
    }
}
