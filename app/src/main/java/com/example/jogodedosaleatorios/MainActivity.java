package com.example.jogodedosaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    Random rand;
    ImageView imgV1;
    ImageView imgV2;
    int vetImagem[];
    int num;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV1 = findViewById(R.id.imgV1);
        imgV2 = findViewById(R.id.imgV2);

        vetImagem = new int[]{
                R.drawable.dedo_0,
                R.drawable.dedo_1,
                R.drawable.dedo_2,
                R.drawable.dedo_3,
                R.drawable.dedo_4,
                R.drawable.dedo_5
        };

        imgV1.setImageResource(R.drawable.dedo_semvalor);
        imgV2.setImageResource(R.drawable.dedo_semvalor);

    }


    public void Sort(){

        rand = new Random();

        num = rand.nextInt(6);
        num2 = rand.nextInt(6);

    }

    public void mostre(View v){

        Sort();

        imgV1.setImageResource(vetImagem[num]);

        //Sort(); é possivel chamar o metodo novamente para que não seja necessario a utilização da variavel num2 pois ele sortearia um novo numero randomico  imgV2.setImageResource(vetImagem[num]);
        imgV2.setImageResource(vetImagem[num2]);

    }
}