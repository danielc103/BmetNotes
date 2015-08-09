package com.android.bmetnotes.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by Daniel Carroll on 8/9/2015.
 */

/**
 * Table: deviceNote - information pertaining to device
 */
@Table(name = "deviceNote")
public class deviceNote extends Model {

    //Primary key - id is created by ActiveAndroid

    @Column(name = "tagNum")
    private String tagNum;

    @Column(name = "description")
    private String description;

    @Column(name = "creationDate")
    private Date creationDate;

    public deviceNote(){super();}

    public deviceNote(String tagNum, String description, Date creationDate){
        super();
        this.tagNum = tagNum;
        this.description = description;
        this.creationDate = creationDate;
    }

}
