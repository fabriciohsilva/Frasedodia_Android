package com.fabriciohsilva.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();
    String sFrases[] = {
      "Hero can be anyone. Even a man knowing something as simple and reassuring as putting a coat around a young boy shoulders to let him know the world hadn't ended."
    , "It doesn't matter who we are. What matters is our plan."
    , "Ooh, you think darkness is your ally? You merely adopted the dark, I was born in it. Molded by it. I didn't see the light until I was already a man. By then there was nothing to be but blinded."
    , "There you are! There is nothing to fear but fear itseIf!"
    , "Do I really look like a guy with a plan?"
    , "It's not who I am underneath but what I do that defines me."
    , "Why do we fall? So we can learn to pick ourselves up."};

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.textNovaFrase = (TextView) findViewById(R.id.textNovaFrase);
        this.mViewHolder.buttonGerarFrase = (Button) findViewById(R.id.buttonNovaFrase);

        this.mViewHolder.buttonGerarFrase.setOnClickListener(this);


    }//end protected void onCreate(Bundle savedInstanceState)

    @Override
    public void onClick(View v){
        int id = v.getId();

        if (id == R.id.buttonNovaFrase){

            Random randomico = new Random();
            int num = randomico.nextInt( sFrases.length );

            this.mViewHolder.textNovaFrase.setText(sFrases[num]);
        }//end if (id == R.id.buttonNovaFrase)
    }//end public void onClick(View v)


    private static class ViewHolder {
        TextView textNovaFrase;
        Button   buttonGerarFrase;
    }//end private static class mviewHolder




}//end public class MainActivity extends AppCompatActivity