package com.example.david.moneda;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    final static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
     TextView resultado = (TextView) findViewById(R.id.resultado);
    Button botonlanzar = (Button) findViewById(R.id.botonlanzar);
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
        String result;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);
        Log.d(TAG, "Valor de randomNumber: " + randomNumber);

        if (randomNumber == 0) {
            result = "CARA";
        }
        else {
            result = "CRUZ";
        }

        resultado.setText(result);
    }
}
botonlanzar.setOnClickListener(listener);
        }
        }
