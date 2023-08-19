package com.example.apptraductortp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.apptraductortp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private MainActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding.btTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mv.traducir(binding.etPalabra.getText().toString());
            }
        });

    }
}