package com.example.android.highwaycode;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.view.View;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    android.support.v4.app.FragmentTransaction ft;
    NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.main_container, new HomeFragment());
        ft.commit();
        getSupportActionBar().setTitle("Home");






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ts) {
            // Traffic signs
            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new TrafficSigns());
            ft.commit();
            getSupportActionBar().setTitle("Traffic Signs");
            item.setChecked(true);



        } else if (id == R.id.nav_rm) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new RoadMarkings());
            ft.commit();
            getSupportActionBar().setTitle("Road Markings");
            item.setChecked(true);



        } else if (id == R.id.nav_vm) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new VehicalMarkings());
            ft.commit();
            getSupportActionBar().setTitle("Vehical Markings");
            item.setChecked(true);


        } else if (id == R.id.nav_ped) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new Peds());
            ft.commit();
            getSupportActionBar().setTitle("Pedestrians");
            item.setChecked(true);


        } else if (id == R.id.nav_cyclist) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new Cyclist());
            ft.commit();
            getSupportActionBar().setTitle("Cyclists");
            item.setChecked(true);

        } else if (id == R.id.nav_motor) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new Motor());
            ft.commit();
            getSupportActionBar().setTitle("MotorCyclists");
            item.setChecked(true);
        }
        else if (id == R.id.nav_driver) {

            ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.main_container, new Drivers());
            ft.commit();
            getSupportActionBar().setTitle("Drivers");
            item.setChecked(true);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
