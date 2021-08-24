package com.johhns.fragmentos_semana_4;

import static com.johhns.fragmentos_semana_4.R.menu.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private Toolbar    barra1 ;
    private TabLayout  tabs ;
    private ViewPager  viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra1 = findViewById( R.id.barra_ppl ) ;
        tabs = findViewById(R.id.miTabLayout1);
        viewPager = findViewById(R.id.viewPager1);

        if ( barra1 != null ){
            setSupportActionBar(barra1);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_principal,menu);
        return true;
    }
}