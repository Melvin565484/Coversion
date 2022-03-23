package com.example.conversiondolares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    public void convertir (View view){
        EditText EditText  = findViewById(R.id.EditText);
        String DolaresString = EditText.getText().toString();
        Double Dolares = Double.parseDouble(DolaresString);
        Double Euros = Dolares * 2 ;
        String EurosString = String.format("%.2f",Euros);
        String mensaje = "  Dolares  " + DolaresString + "  Euros  " + EurosString;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

    }

    ImageButton btnmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmas=(ImageButton) findViewById(R.id.btnmas);

        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Ajustes.class);
                startActivity(i);

            }
        });
    }
}