package com.example.primeiraaulanoite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.primeiraaulanoite.modelo.Controle;

public class MainActivity extends AppCompatActivity
{
    EditText edtNumero1;
    EditText edtNumero2;
    Button btnSomar;
    Button btnSubtrair;
    Button btnMultiplicar;
    Button btnDividir;
    TextView txvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        configuracao();
        eventos();
    }

    public void configuracao()
    {
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        txvResposta = findViewById(R.id.txvResposta);
    }

    public void eventos()
    {
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Executar("+");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Executar("-");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Executar("*");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Executar("/");
            }
        });
    }

    private void Executar(String op)
    {
        Controle controle = new Controle(edtNumero1.getText().toString(), edtNumero2.getText().toString(), op);
        if (controle.getMensagem().equals(""))
        {
            txvResposta.setText(controle.toString());
        }
        else
        {
            //txvResposta.setText(controle.getMensagem());
            Toast.makeText(this, controle.getMensagem(), Toast.LENGTH_LONG).show();
        }


    }
}