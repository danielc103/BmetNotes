package com.android.bmetnotes.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by Daniel Carroll on 8/9/2015.
 */

/**
 * Table: project
 */
@Table(name = "project")
public class project extends Model {

    //Primary Key - Id created by ActiveAndroid

    @Column(name = "name")
    private String name;

    @Column(name = "creationDate")
    private Date creationDate;

    public project(){super();}

    public project(String name, Date creationDate){
        super();
        this.name = name;
        this.creationDate = creationDate;
    }
}
