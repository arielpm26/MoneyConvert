package com.example.arielperezmartinez.moneyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainCalculos extends AppCompatActivity {

    private EditText Resultado;
    private EditText Moneda;
    private Spinner spinner;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculos);


        Resultado = (EditText)this.findViewById(R.id.txt_resultado);
        Moneda = (EditText)this.findViewById(R.id.txt_moneda);

        spinner = (Spinner) findViewById(R.id.s_elegir);

        String [] opciones ={"DOP","USD","EUR"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        spinner2 = (Spinner) findViewById(R.id.s_conversion);

        String [] op ={"DOP","USD","EUR"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, op);
        spinner2.setAdapter(adp);
    }

    public void Convert(View view){

        String valor1 = Moneda.getText().toString();
        int nro1 = Integer.parseInt(valor1);

        String select =  spinner.getSelectedItem().toString();

        String selec =  spinner2.getSelectedItem().toString();

      //  if (TextUtils)
        //{
          //  Toast.makeText(this, "¡Por favor digite moneda!", Toast.LENGTH_SHORT).show();

     //   }
       // else equals
       // {

        if (select.equals("DOP"))
        {
            if(selec.equals("USD"))
            {
                double sumar = nro1 * 0.021;
                String resu =String.valueOf(sumar);
                Resultado.setText("DOP $"+nro1+" = USD $"+resu);
            }
            else
            if(selec.equals("EUR"))
            {
                double sumar = nro1 * 0.018;
                String resu =String.valueOf(sumar);
                Resultado.setText("DOP $"+nro1+" = EUR $"+resu);
            }
        }
        else
            if (select.equals("USD"))
            {
                if(selec.equals("DOP"))
                {
                    double sumar = nro1 * 47.5;
                    String resu =String.valueOf(sumar);
                    Resultado.setText("USD $"+nro1+" = DOP $"+resu);
                }
                else
                if(selec.equals("EUR"))
                {
                    double sumar = nro1 * 0.90;
                    String resu =String.valueOf(sumar);
                    Resultado.setText("USD $"+nro1+" = EUR $"+resu);
                }
            }
            else
                if (select.equals("EUR"))
                {
                    if(selec.equals("DOP"))
                    {
                        double sumar = nro1 * 52.94;
                        String resu =String.valueOf(sumar);
                        Resultado.setText("EUR $"+nro1+" = DOP $"+resu);
                    }
                    else
                    if(selec.equals("USD"))
                    {
                        double sumar = nro1 * 1.11;
                        String resu =String.valueOf(sumar);
                        Resultado.setText("EUR $"+nro1+" = USD $"+resu);
                    }
                }

    }

    public void Salir(View view){
        finish();

    }
}
