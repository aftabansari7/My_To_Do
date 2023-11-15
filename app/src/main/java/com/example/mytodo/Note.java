package com.example.mytodo;

import androidx.room.PrimaryKey;
import androidx.room.vo.PrimaryKey;

public class Note {
    private String title;
    private String desc;
    @PrimaryKey(autoGenerate = true)
    private int id;

    public String getTitle() {
        return title;
    }

//    constructor
    public Note(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
