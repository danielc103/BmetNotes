package com.android.bmetnotes.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Daniel Carroll on 8/9/2015.
 */

/**
 * Table: Device
 */
@Table(name = "Device")
public class device extends Model{

    //Primary Key
    @Column(name = "tagNum", unique = true, notNull = true)
    private String tagNum;

    @Column(name = "serialNum")
    private String serialNum;

    @Column(name = "model")
    private String model;

    @Column(name = "manf")
    private String manf;


    public device(){super();}

    public device(String tagNum, String serialNum, String model, String manf) {
        super();
        this.tagNum = tagNum;
        this.serialNum = serialNum;
        this.model = model;
        this.manf = manf;
    }
}
