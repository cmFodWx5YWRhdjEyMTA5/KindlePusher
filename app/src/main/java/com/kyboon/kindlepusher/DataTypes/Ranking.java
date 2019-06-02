package com.kyboon.kindlepusher.DataTypes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ranking {
    @SerializedName("_id")
    public String id;
    public String title;
    public String shortTitle;
    public String cover;
    public Boolean collapse;
    public String monthRank;
    public String totalRank;
    public String updated;
    public List<Book> books;
}
