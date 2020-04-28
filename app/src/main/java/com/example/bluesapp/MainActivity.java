package com.example.bluesapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.example.bluesapp.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

import Adaptadores.AdaptadorCardChats;
import Modelos.UsuarioChat;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
    ArrayList<UsuarioChat> llenarLista;
    AdaptadorCardChats adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);


        llenarLista = new ArrayList<>();
        adaptador = new AdaptadorCardChats(llenarLista);
        recycle = findViewById(R.id.recy_chatList);

        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(adaptador);

        llenarLista.add(new UsuarioChat("Jimena-chan", "supongo que se acabo..."));
        llenarLista.add(new UsuarioChat("Pinocho", "help!"));
        llenarLista.add(new UsuarioChat("Adriana", "\uD83D\uDE0E"));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}