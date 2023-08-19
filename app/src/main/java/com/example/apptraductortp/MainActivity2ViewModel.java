package com.example.apptraductortp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apptraductortp.modelo.Palabra;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2ViewModel extends AndroidViewModel {

    private List<Palabra> lista=new ArrayList<>();

    private Context context;
    private MutableLiveData<Palabra> traduccion;

    public MainActivity2ViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
        lista.add(new Palabra("perro","dog",R.drawable.dog));
        lista.add(new Palabra("gato","cat",R.drawable.cat));
        lista.add(new Palabra("caballo", "horse",R.drawable.horse));
        lista.add(new Palabra("vaca","cow",R.drawable.vaca));
        lista.add(new Palabra("gallina","chicken",R.drawable.chicken));
    }
    public void traducir(String palabra){
        boolean found=false;
        for (Palabra p : lista){
            if (p.getPalabra().equals(palabra)){
                traduccion.setValue(p);
                found=true;
                break;
            }
        }
        if (!found){
            traduccion.setValue(new Palabra("Palabra no encontrada", "Words not found",R.drawable.notfound));
        }
    }

    public LiveData<Palabra> getPalabra(){
        if (traduccion == null){
            traduccion=new MutableLiveData<Palabra>();
        }
        return traduccion;
    }

}
