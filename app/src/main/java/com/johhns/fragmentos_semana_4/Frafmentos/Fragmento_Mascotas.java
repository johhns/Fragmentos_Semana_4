package com.johhns.fragmentos_semana_4.Frafmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.johhns.fragmentos_semana_4.Adaptadores.Adaptador;
import com.johhns.fragmentos_semana_4.Mascota;
import com.johhns.fragmentos_semana_4.R;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class Fragmento_Mascotas extends Fragment {

    ArrayList<Mascota> arrayMascotas ;
    RecyclerView recView ;

    public Fragmento_Mascotas() {
        // Required empty public constructor
    }


    public static Fragmento_Mascotas newInstance() {
        Fragmento_Mascotas fragment = new Fragmento_Mascotas();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragmento__mascotas, container, false);

        arrayMascotas = new ArrayList<>();
        recView =  v.findViewById(R.id.rcView1);
        recView.setLayoutManager(new LinearLayoutManager(getContext()));

        crear_mascotas();

        Adaptador adapter = new Adaptador(arrayMascotas);
        recView.setAdapter(adapter);


        return v ;
    }

    private void crear_mascotas() {
        arrayMascotas.add( new Mascota( R.drawable.lazy , "Lazy" , 7 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.manchas , "Manchas" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.oso , "Oso" , 2 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.punky , "Punky" , 4 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rex , "Rex" , 3 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.rocky , "Rocky" , 5 ) ) ;
        arrayMascotas.add( new Mascota( R.drawable.romi , "Romy" , 4 ) ) ;
    }

}