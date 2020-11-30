package com.mycompany.test_diario;

import lombok.Data;


/**
 *
 * @author Gaston
 */

@Data
public class Noticia {
    private String tit;
    private String url;
    private String genero;
    private String desc;
    
    public Noticia(String t, String url){
        this.tit = t;
        this.url = url;
    }

}
