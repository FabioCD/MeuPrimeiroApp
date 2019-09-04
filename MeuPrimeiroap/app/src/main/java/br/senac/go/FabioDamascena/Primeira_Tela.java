package br.senac.go.FabioDamascena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Primeira_Tela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira__tela);


        Button openBT = findViewById(R.id.button3);
        openBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CronogramaActivity.class);
                intent.putExtra("teste",R.id.textView4);

                startActivity(intent);

            }
        });
    }
}
