package br.senac.go.FabioDamascena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CronogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        Intent intent = getIntent();
        if(intent.hasExtra("teste")){
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("teste", -1);
            if(argInt == 1){
                throw new IllegalStateException("Não é um inteiro ");
            }

            TextView ads = findViewById(argInt);
            ads.setTypeface(ads.getTypeface(), Typeface.BOLD);
        }
        Button openBT = findViewById(R.id.button6);
        openBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Primeira_Tela.class);
                startActivity(intent);

            }
        });
    }
}
