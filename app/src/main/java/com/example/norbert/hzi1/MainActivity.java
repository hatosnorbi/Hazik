package com.example.norbert.hzi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button osszead=(Button)findViewById(R.id.button1);
        Button kivon=(Button)findViewById(R.id.button2);
        Button szoroz=(Button)findViewById(R.id.button3);
        Button oszt=(Button)findViewById(R.id.button4);

       final EditText szam1=(EditText) findViewById(R.id.editText1);
       final EditText szam2=(EditText)findViewById(R.id.editText2);

       final TextView eredmeny=(TextView)findViewById(R.id.textView);


        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double eredmeny1=Double.parseDouble(szam1.getText().toString())+Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(eredmeny1));
            }
        });


        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double eredmeny1=Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(eredmeny1));
            }
        });


        szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double eredmeny1=Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(eredmeny1));
            }
        });


        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double eredmeny1=Double.parseDouble(szam1.getText().toString())/Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(eredmeny1));
            }
        });




    }
}
