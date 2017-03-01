package com.example.abdul.encryptedmessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by abdul on 2/28/2017.
 */

public class DecryptionPopup extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.decryptioninput);

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width), (int) (height));
    }
        //Decrypt the text now
        int key = 0;
        Button SubmitButton;

        //When the submit button is pressed

        public void getKey(View view)
        {
            //Comment this code all out if it is causing errors

            //Trying to see if I can detect button clicks on the submit button
            SubmitButton = (Button)view;

            if(SubmitButton != null)
            {
                SubmitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    //This method runs everytime the decrypt button is clicked
                    public void onClick(View v) {


                        EditText decryptionEditText = (EditText)findViewById(R.id.editText_inputKey);
                        String value = decryptionEditText.getText().toString();


                        //Log.d("Test: ", value);

                    }


                });

            }


        }


    }
