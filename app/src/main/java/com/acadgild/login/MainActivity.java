package com.acadgild.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText urnumber,uremail;
    Button Clik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urnumber= (EditText) findViewById(R.id.number);
        uremail= (EditText) findViewById(R.id.email);
        Clik = (Button) findViewById(R.id.button);
    }

    public void move(View view) {

        {
        String stnumber = urnumber.getText().toString();
        String stemail = uremail.getText().toString();
   if (stemail.equals("betping1993@gmail.com")&&stnumber.equals("123456"))
   {
       Intent in= new Intent(MainActivity.this,ActivityB.class);
       startActivity(in);
   }
            else if (stemail.equals("")||stnumber.equals(""))
   {
       Toast.makeText(getBaseContext(),"Enter email and number",Toast.LENGTH_SHORT).show();
   }
       else
   {
       Toast.makeText(getBaseContext(),"wrong email and number entred",Toast.LENGTH_SHORT).show();
   }


        }



    }

}
