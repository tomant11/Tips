package com.example.tips;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
public static final double proc=0.1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kiek;
        final TextView tipsai, galut;
        final EditText suma;

        kiek=(Button) findViewById(R.id.button);
        tipsai=(TextView) findViewById(R.id.textViewKiek);
        suma=(EditText) findViewById(R.id.editTextSuma);
        galut=(TextView) findViewById(R.id.textViewGalut);

        kiek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double k=Double.parseDouble(suma.getText().toString());
                double i=k*proc;
                tipsai.setText(Double.toString(i));
                galut.setText(Double.toString(k+i));
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
