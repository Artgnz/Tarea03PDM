package com.example.tarea02;

import android.os.Bundle;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.nav_view);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.nav_open,
                R.string.nav_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_generator) {
            Log.d("Drawer", "Generador de contraseñas");
            Toast.makeText(this, "Generador de contraseñas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_vault) {
            Log.d("Drawer", "Bóveda de contraseñas");
            Toast.makeText(this, "Bóveda de contraseñas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_secure_notes) {
            Log.d("Drawer", "Notas seguras");
            Toast.makeText(this, "Notas seguras", Toast.LENGTH_SHORT).show();
        }

        drawerLayout.closeDrawers();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            Log.d("ActionBar", "Búsqueda");
            Toast.makeText(this, "Búsqueda", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_information) {
            Log.d("ActionBar", "Información");
            Toast.makeText(this, "Información", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_profile) {
            Log.d("ActionBar", "Perfil");
            Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings) {
            Log.d("ActionBar", "Configuraciones");
            Toast.makeText(this, "Configuraciones", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

}