package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResult;
    private Button buttonReturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResult = findViewById(R.id.imageResult);
        buttonReturn = findViewById(R.id.buttonReturn);

        //recuperar dados

        Bundle dados = getIntent().getExtras();
        int number = dados.getInt("numero");

        if (number == 0 ){
            //cara
            imageResult.setImageResource(R.drawable.moeda_cara);
        }else{
            //coroa
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
    }
}
