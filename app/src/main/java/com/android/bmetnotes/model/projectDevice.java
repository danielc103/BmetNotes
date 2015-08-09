package com.android.bmetnotes.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

/**
 * Created by Daniel Carroll on 8/9/2015.
 */

/**
 * Table: projectDevice - association table between project and device
 */
@Table(name = "projectDevice")
public class projectDevice extends Model {

    //Composite Key
    @Column(name = "IdProject", unique = true, notNull = true)
    private long IdProject;

    //Composite Key
    @Column(name = "tagNum", unique = true, notNull = true)
    private long tagNum;

    public projectDevice(){super();}

    public projectDevice(long IdProject, long tagNum){
        super();
        this.IdProject = IdProject;
        this.tagNum = tagNum;
    }



}
