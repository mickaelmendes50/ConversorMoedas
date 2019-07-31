package com.mesquita.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHoler = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHoler.editValue = findViewById(R.id.edit_value);
        this.mViewHoler.textDolar = findViewById(R.id.text_dolar);
        this.mViewHoler.textEuro = findViewById(R.id.text_euro);
        this.mViewHoler.buttonCalculate = findViewById(R.id.button_calculate);
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;
    }
}
