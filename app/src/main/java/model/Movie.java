package model;

import java.io.Serializable;

/**
 * Created by olivi on 18/02/2016.
 */
public class Movie implements Serializable {

    private String mTitle;
    private String mDescription;
    private int mColor;

    public Movie(String mTitle, String mDescription, int mColor) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mColor = mColor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmColor(){
        return mColor;
    }
}
