package com.anmoraque.ejercicioevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout cajaVerde;
    private LinearLayout cajaAmarilla;
    private LinearLayout cajaAzul;
    private LinearLayout cajaRoja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cajaVerde = findViewById(R.id.cuadro1);
        this.cajaAmarilla = findViewById(R.id.cuadro2);
        this.cajaAzul = findViewById(R.id.cuadro3);
        this.cajaRoja = findViewById(R.id.cuadro4);
    }

    public void caja1(View view) {
        cajaVerde.setVisibility(View.INVISIBLE);
    }

    public void caja2(View view) {
        cajaAmarilla.setVisibility(View.INVISIBLE);
    }

    public void caja3(View view) {
        cajaAzul.setVisibility(View.INVISIBLE);
    }

    public void caja4(View view) {
        cajaRoja.setVisibility(View.INVISIBLE);
    }

}