package com.android.bmetnotes.Project;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.bmetnotes.R;

/**
 * Created by Daniel Carroll on 8/17/2015.
 * TODO: Set button actions
 * TODO: Save to Project model
 */
public class ProjectCreateActivity extends ActionBarActivity{

    private Button buttonCreate;
    private EditText editTextProjName;
    private TextView textViewProjName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set up views
        editTextProjName = (EditText) findViewById(R.id.editTextProjectName);
        textViewProjName = (TextView) findViewById(R.id.textViewProjectName);

        buttonCreate = (Button) findViewById(R.id.buttonCreate);


        createClick();

    }


    private void createClick(){

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
