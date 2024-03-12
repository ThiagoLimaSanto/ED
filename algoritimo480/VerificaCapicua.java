package com.mycompany.algoritimo480;

public class VerificaCapicua {
    
    public boolean verificadaor(String text){    
        StringBuffer reverso = new StringBuffer(text);
        
        reverso.reverse();
        
        String textoAoContrario = reverso.toString();
        
        if(textoAoContrario.equals(text)){
            return true;
        }else{return false;}
    }
}
