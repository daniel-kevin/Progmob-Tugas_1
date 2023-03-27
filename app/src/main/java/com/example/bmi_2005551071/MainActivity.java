package com.example.bmi_2005551071;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countBmi(View v){
        EditText textTinggi = findViewById(R.id.editTextTinggi);
        String Stinggi = textTinggi.getText().toString();
        EditText textBerat = findViewById(R.id.editTextBerat);
        TextView textHasil = findViewById(R.id.BmiText);
        String Sberat = textBerat.getText().toString();
        float tinggi = 0;
        float berat = 0;
        try {
            tinggi = Float.parseFloat(Stinggi);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        try {
            berat = Float.parseFloat(Sberat);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        if(tinggi < 1){
            Toast.makeText(getApplicationContext(), "Tinggi harus lebih besar dari 0", Toast.LENGTH_SHORT).show();
        }
        else if(berat < 1){
            Toast.makeText(getApplicationContext(), "Berat harus lebih besar dari 0", Toast.LENGTH_SHORT).show();
        }
        else{
            tinggi = tinggi/100;
            float hasil = (float) (berat/Math.pow(tinggi,2));
            textHasil.setText(Float.toString(hasil));
        }

//        System.out.println(tinggi);
    }
}