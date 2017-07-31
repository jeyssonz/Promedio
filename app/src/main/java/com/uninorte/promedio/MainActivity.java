package com.uninorte.promedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText NT1EditText;
    EditText NT2EditText;
    EditText NT3EditText;
    EditText NT4EditText;
    TextView tvSalidTextViewa;
    boolean sw =false;
    boolean sw2 =false;
    boolean sw3 =false;
    boolean sw4 =false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NT1EditText =(EditText) findViewById(R.id.NT1);
        NT2EditText = (EditText) findViewById(R.id.NT2);
        NT3EditText = (EditText) findViewById(R.id.NT3);
        NT4EditText = (EditText) findViewById(R.id.NT4);
        tvSalidTextViewa =(TextView) findViewById(R.id.tvS);

    }




    public void onClickElBoton(View view) {
        int con =0;
        float Nota1=0;
        float Nota2=0;
        float Nota3=0;
        float Nota4=0;
        float NotaF;
        String entrada = NT1EditText.getText().toString();
        String entrada2 = NT2EditText.getText().toString();
        String entrada3 = NT3EditText.getText().toString();
        String entrada4 = NT4EditText.getText().toString();
        if (entrada.isEmpty())
        {con=con+1;
            sw= true;
        }
        else
        {
          Nota1 =Float.parseFloat(entrada);
        }
        if (entrada2.isEmpty())
        {
            con=con+1;
            sw2= true;
        }
        else
        {
             Nota2 =Float.parseFloat(entrada2);
        }
        if (entrada3.isEmpty())
        {con=con+1;
            sw3= true;
        }
        else
        {
             Nota3 =Float.parseFloat(entrada3);
        }
        if (entrada4.isEmpty())
        {con=con+1;
            sw4= true;
        }
        else
        {
             Nota4 =Float.parseFloat(entrada4);
        }



            if(sw==true)
            {
                NT1EditText.setText("0");
                Nota1=0;
            }
            if(sw2==true)
            {
                NT2EditText.setText("0");Nota2=0;
            }
            if(sw3==true)
            {
                NT3EditText.setText("0");Nota3=0;
            }
            if(sw4==true)
            {
                NT4EditText.setText("0");Nota4=0;
            }

        if((sw2==false)&&(sw==false)&&(sw4==false)&&(sw3==false))
        {
            NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
            tvSalidTextViewa.setText(String.valueOf(NotaF));
        }
        else {
            if(con==1)
            {
                if (sw==true)
                {
                    NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
                    Nota1=(NotaF/3);
                    Nota1= 3.8f - Nota1;
                    NT1EditText.setText("0");
                }
                if(sw2==true)
                {
                    NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
                    Nota2=(NotaF/3);
                    Nota2= 3.8f - Nota2;
                    NT2EditText.setText("0");
                }
                if (sw3==true)
                {
                    NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
                    Nota3=(NotaF/3);
                    Nota3= 3.8f - Nota3;
                    NT1EditText.setText("0");
                }
                if(sw4==true)
                {
                    NotaF=(Nota1+Nota2+Nota3+Nota4)/4;
                    Nota4=(NotaF/3);
                    Nota4= 3.8f - Nota4;
                    NT2EditText.setText("0");
                }

            }
            tvSalidTextViewa.setText(String.valueOf(3.8));
            if ((sw==true)&&(sw2==true)&&(sw3==true)&&(sw4==true))
            {
                NT1EditText.setText(String.valueOf(3.8));
                NT2EditText.setText(String.valueOf(3.8));
                NT3EditText.setText(String.valueOf(3.8));
                NT4EditText.setText(String.valueOf(3.8));
            }
        }
    }
}
