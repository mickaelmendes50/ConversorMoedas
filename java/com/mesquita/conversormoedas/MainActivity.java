package com.mesquita.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHoler = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHoler.editValue = findViewById(R.id.edit_value);
        this.mViewHoler.textDolar = findViewById(R.id.text_dolar);
        this.mViewHoler.textEuro = findViewById(R.id.text_euro);
        this.mViewHoler.buttonCalculate = findViewById(R.id.button_calculate);

        this.mViewHoler.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calculate) {
            String value = this.mViewHoler.editValue.getText().toString();
            if ("".equals(value)) {
                Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
            } else {

            }
        }
    }
    private void clearValues() {
        this.mViewHoler.textDolar.setText("");
        this.mViewHoler.textEuro.setText("");
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;
    }
}
