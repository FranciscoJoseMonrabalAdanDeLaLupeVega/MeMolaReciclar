package com.example.francisco.memolareciclar;

import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Francisco on 28/01/2018.
 */

public class Frase {

    private String frase;
    private ImageView pic;
    private Button fav;
    private int counter;

    public Frase(String frase) {
        this.frase = frase;
        this.counter = 0;
    }

    public Frase() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public ImageView getPic() {
        return pic;
    }

    public void setPic(ImageView pic) {
        this.pic = pic;
    }

    public Button getFav() {
        return fav;
    }

    public void setFav(Button fav) {
        this.fav = fav;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter () {

        this.counter++;
    }
}
