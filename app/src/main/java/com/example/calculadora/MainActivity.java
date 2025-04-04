package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etNumber2;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        View.OnClickListener operacaoClickListenner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = etNumber1.getText().toString();
                String num2Str = etNumber2.getText().toString();

                if (num2Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha ambos os campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);

                CalculadoraUtils calculadora = new CalculadoraUtils(num1, num2);
                double resultado = 0;

                if (v.getId() == R.id.btnSomar) {
                    resultado = calculadora.somar();
                } else if (v.getId() == R.id.btnSubtrair) {
                    resultado = calculadora.subtrair();
                } else if (v.getId() == R.id.btnMultiplicar) {
                    resultado = calculadora.multiplicar();
                } else if (v.getId() == R.id.btnDividir) {
                    try {
                        resultado = calculadora.dividir();
                    } catch (IllegalArgumentException e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                Toast.makeText(MainActivity.this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
            }
        };

        btnSomar.setOnClickListener(operacaoClickListenner);
        btnSubtrair.setOnClickListener(operacaoClickListenner);
        btnMultiplicar.setOnClickListener(operacaoClickListenner);
        btnDividir.setOnClickListener(operacaoClickListenner);

    }
}