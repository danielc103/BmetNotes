package com.android.bmetnotes.Note;

import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.bmetnotes.R;
import com.android.bmetnotes.model.device;


/**
 * Created by Daniel Carroll on 8/17/2015.\
 * TODO: Put Strings in proper xml
 * TODO: Add spinner list
 * TODO: add methods to models to allow to save entries
 */
public class NoteCreateActivity extends ActionBarActivity {

    private EditText editTextTag;
    private EditText editTextSN;
    private EditText editTextManf;
    private EditText editTextModel;
    private EditText editTextSolution;

    private Button buttonCreate;

    private Spinner spinnerProjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get view for activity
        setContentView(R.layout.add_note);

        //action bar manipulation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create a New Note");

        //set up editText views
        editTextTag = (EditText) findViewById(R.id.editTextTag);
        editTextSN = (EditText) findViewById(R.id.editTextSN);
        editTextManf = (EditText) findViewById(R.id.editTextManf);
        editTextModel = (EditText) findViewById(R.id.editTextModel);
        editTextSolution = (EditText)findViewById(R.id.editTextSolution);
        //set up button view
        buttonCreate = (Button) findViewById(R.id.buttonCreate);
        //set up spinner view
        spinnerProjects = (Spinner) findViewById(R.id.spinnerProjects);

        //TODO: Populate spinner with adapter for projects

        createClick();

    }

    /**
     * events for clicking create button
     */
   private void createClick(){

       buttonCreate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String tag = editTextTag.getText().toString();
               String SN = editTextSN.getText().toString();
               String manf = editTextManf.getText().toString();
               String model = editTextModel.getText().toString();
               String solution = editTextSolution.getText().toString();

               if(tag == null){
                   Toast.makeText(getApplicationContext(), "Must have tag!", Toast.LENGTH_LONG).show();
               }
               else {

               }
           }
       });

   }




}
