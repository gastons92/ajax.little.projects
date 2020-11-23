package com.mycompany.test_diario;
import lombok.Data;

/**
 *
 * @author Gaston
 */

@Data
public class Noticia {
    private String titulo;
    private String urlImg;
    private String genero;
    private String descripcion;
    
    public Noticia(String t, String url){
        titulo = t;
        urlImg = url;
    }
    
    public void setTit(String s){
        titulo = s;
    }
    public void setUrl(String s){
        urlImg = s;
    }
    public void setGen(String s){
        genero = s;
    }
    public void setDesc(String s){
        descripcion = s;
    }
    
    public String getTit(){
        return titulo;
    }
    public String getUrl(){
        return urlImg;
    }
    public String getGen(){
        return genero;
    }
    public String getDesc(){
        return descripcion;
    }
}
