package com.mycompany.experimento01;
import java.util.ArrayList;
import java.util.Collections;
import lombok.Data;

@Data
public class UrlDAO {
    private ArrayList<String> urls;
    
    public UrlDAO(){
        urls = new ArrayList<String>();
        urls.add("imagen01.jpg");
        urls.add("imagen02.jpg");
    }
    public String getUrl(int i){
        return urls.get(i%urls.size()); // en caso que supere el size de la lista vuelve a indexar
    }
}
