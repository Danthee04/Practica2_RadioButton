package com.example.practica2_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private RadioButton rb1,rb2,rb3,rb4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicacion);
        rb4 = (RadioButton)findViewById(R.id.rb_division);
        tv1 = (TextView)findViewById(R.id.tv_resultado );
    }

    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        if(rb1.isChecked() == true){
            int Suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(Suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked() == true){
            int Resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(Resta);
            tv1.setText(resultado);
        } else if (rb3.isChecked() == true){
            int Multiplicacion = valor1_Int * valor2_Int;
            String resultado = String.valueOf(Multiplicacion);
            tv1.setText(resultado);
        }else if (rb4.isChecked() == true) {

            if (valor2_Int != 0) {
                int Division = valor1_Int / valor2_Int;
                String resultado = String.valueOf(Division);
                tv1.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de 0", Toast.LENGTH_LONG).show();
            }
        }
    }
}
