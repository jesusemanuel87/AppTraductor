package com.example.apptraductortp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public void traducir(String palabra){
        if (palabra.length()==0) {
            Toast.makeText(context,"Debe ingresar una palabra",Toast.LENGTH_LONG).show();
        }else{

            Intent intent= new Intent(context, MainActivity2.class);
            intent.putExtra("palabra",palabra);
            intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }

    }
}
