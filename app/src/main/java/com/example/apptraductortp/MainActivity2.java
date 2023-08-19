package com.example.apptraductortp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.apptraductortp.databinding.ActivityMain2Binding;
import com.example.apptraductortp.modelo.Palabra;

public class MainActivity2 extends AppCompatActivity {

    private MainActivity2ViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain2Binding binding= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivity2ViewModel.class);
        Intent intent= getIntent();
        String p=(String) intent.getStringExtra("palabra");
        mv.getPalabra().observe(this, new Observer<Palabra>(){
           @Override
           public void onChanged (Palabra p){
               binding.tvPalabra.setText(p.getPalabra());
               binding.tvTraduccion.setText(p.getTraduccion());
               binding.imagen.setImageResource(p.getImagen());
           }
        });
        mv.traducir(p);
    }
}