package com.example.parsingpeliculastrend;


import com.google.gson.annotations.SerializedName;

public class Pelicula {

    @SerializedName("title")
    private String title;
    @SerializedName("year")
    private Integer year;
    @SerializedName("ids")
    private Ids ids;

    public Pelicula() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Ids getIds() {
        return ids;
    }

    public void setIds(Ids ids) {
        this.ids = ids;
    }
}
