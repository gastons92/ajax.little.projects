package com.mycompany.experimento01;
import static spark.Spark.get;

/**
 *
 * @author Gaston
 */
public class Main {
    //consulta -> http://localhost:4567/getImg
       
    get("/getImg",Controlador.getImg); 
}
