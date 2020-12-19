/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Giu
 */
public class Moeda {
    
    //Atributos
    private static Moeda cofre = null; 
    private String valor;
    private int um_centavo;
    private int cinco_centavos;
    private int dez_centavos;
    private int vinte_e_cinco_centavos;
    private int cinquenta_centavos;
    private int um_real;
    
    // Metodos
    // Metodo estatico para obter instancia da classe
    public static Moeda getCofre(String valor){
        if(cofre == null){
            cofre = new Moeda(valor);
        }
        return cofre;
    }
    
    // Construtor Privado
    private Moeda (String valor){
        this.valor = valor;
      }
    
    // gets
    public String getValor(){ return valor;}
    public int get1Cent(){ return um_centavo;}
    public int get5Cent(){ return cinco_centavos;}
    public int get10Cent(){ return dez_centavos;}
    public int get25Cent(){ return vinte_e_cinco_centavos;}
    public int get50Cent(){ return cinquenta_centavos;}
    public int get1Real(){ return um_real;}
    
    //sets
    public void setUm_centavo(int um_centavo) {this.um_centavo += um_centavo;}
    public void setCinco_centavos(int cinco_centavos) {this.cinco_centavos += cinco_centavos;}
    public void setDez_centavos(int dez_centavos) {this.dez_centavos += dez_centavos;}
    public void setVinte_e_cinco_centavos(int vinte_e_cinco_centavos) {this.vinte_e_cinco_centavos += vinte_e_cinco_centavos;}
    public void setCinquenta_centavos(int cinquenta_centavos) {this.cinquenta_centavos += cinquenta_centavos;}
    public void setUm_real(int um_real) {this.um_real += um_real;}
    
    
    //metodos
    public float TotalMoedas(){
        float total_de_moedas;
        total_de_moedas = (float) ((um_centavo*0.01) + (cinco_centavos*0.05) + (dez_centavos*0.10) + (vinte_e_cinco_centavos*0.25) + (cinquenta_centavos*0.50) + (um_real*1.00));
        return total_de_moedas;
    }
    
    public int ContarMoedas(){
        int total_de_moedas;
        total_de_moedas = um_centavo + cinco_centavos + dez_centavos + vinte_e_cinco_centavos + cinquenta_centavos + um_real;
        return total_de_moedas;
    }
    
    
}
