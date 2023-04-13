package com.example.jokenpooo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public EditText idJogador1;
    public EditText idJogador2;

    public TextView idVencedor;

    public TextView idNomeJogador1;
    public TextView idNomeJogador2;

    public ImageView idImg1;
    public ImageView idImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idJogador1 = findViewById(R.id.idJogador1);
        idJogador2 = findViewById(R.id.idJogador2);
        idVencedor = findViewById(R.id.idVencedor);
        idNomeJogador1 = findViewById(R.id.idNomeJogador1);
        idNomeJogador2 = findViewById(R.id.idNomeJogador2);

        idImg1 = findViewById(R.id.idImg1);
        idImg2 = findViewById(R.id.idImg2);

    }
    public void Jogar (View view){
        Random aleatorio = new Random();

        String jogador1 = idJogador1.getText().toString();
        String jogador2 = idJogador2.getText().toString();

        int IDnum1 = aleatorio.nextInt((3 - 1) + 1) + 1;
        int IDnum2 = aleatorio.nextInt((3 - 1) + 1) + 1;

        // 1 papel
        // 2 tesoura
        // 3 pedra

        //Casos que o jogador 1 ganha:

        idNomeJogador1.setText(jogador1);
        idNomeJogador2.setText(jogador2);

        if (IDnum1 == IDnum2){
            idVencedor.setText("EMPATE");

        }
        else if (IDnum1 == 1 && IDnum2 == 3 ) {

            idVencedor.setText("O vencedor é :" + jogador1);
            idImg1.setImageResource(R.drawable.papel);
            idImg2.setImageResource(R.drawable.pedra);
        }
        else if (IDnum1 == 2 && IDnum2 == 1 ) {

            idVencedor.setText("O vencedor é :" + jogador1);
            idImg1.setImageResource(R.drawable.tesoura);
            idImg2.setImageResource(R.drawable.papel);
        }
        else if (IDnum1 == 3 && IDnum2 == 2 ) {

            idVencedor.setText("O vencedor é :" + jogador1);
            idImg1.setImageResource(R.drawable.pedra);
            idImg2.setImageResource(R.drawable.tesoura);
        }

        // Casos que o jogador 2 ganha:

        else if (IDnum1 == 3 && IDnum2 == 1 ) {

            idVencedor.setText("O vencedor é :" + jogador2);
            idImg1.setImageResource(R.drawable.pedra);
            idImg2.setImageResource(R.drawable.papel);
        }
        else if (IDnum1 == 1 && IDnum2 == 2 ) {

            idVencedor.setText("O vencedor é :" + jogador2);
            idImg1.setImageResource(R.drawable.papel);
            idImg2.setImageResource(R.drawable.tesoura);
        }
        else if (IDnum1 == 2 && IDnum2 == 3 ) {

            idVencedor.setText("O vencedor é :" + jogador2);
            idImg1.setImageResource(R.drawable.tesoura);
            idImg2.setImageResource(R.drawable.pedra);
        }

    }
}
