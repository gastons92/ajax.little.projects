package com.mycompany.test_diario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Gaston
 */

@Data
public class NoticiaDAO {
    private List<Noticia> noticias;
    
    public List<Noticia> getNoticias(){
        init();
        return noticias;
        }
    
    private void init(){
        noticias = new ArrayList<Noticia>();

            Noticia n1 = new Noticia("Contagiados de covid lamentan estar contagiados","imagen01.jpg");
            n1.setDesc("Al parecer los contagiados sienten malestar y no les sienta agradable el echo de tener covid");
            noticias.add(n1);
            
            Noticia n2 = new Noticia("Macri asegura: yo no soy un gato","imagen02.jpg");
            n2.setDesc("Cito luego de presentar una muestra de adn que parece indicar presencia de genes humanos en sangre");
            noticias.add(n2);
            
            Noticia n3 = new Noticia("Alberto ratifica: me aseguro que tenia 18","imagen03.jpg");
            n3.setDesc("Posteriormente aclaro que como presidente tiene derecho hacer lo que quiera y con quien quiera");
            noticias.add(n3);
    }
}
