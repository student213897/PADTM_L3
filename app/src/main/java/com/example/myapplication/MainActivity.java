package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Kliknieto przycisk FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {/* ; */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk " + item.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings1:
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk " + item.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings2:
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk " + item.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings3:
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk " + item.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings4:
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk " + item.toString(), Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        Bitmap bitmap = (Bitmap) bundle.get("data");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.cont);
        constraintLayout.setBackground(new BitmapDrawable(getResources(), bitmap));

    }

    public void kliknij(View view) {
        Toast.makeText(getApplicationContext(), "Kliknięto przycisk Button", Toast.LENGTH_SHORT).show();
    }

    public void login(View view) {
        Intent intencja = new Intent(this, LoginActivity2.class);
        startActivity(intencja);
    }

    public void imgCapture(View view) {
        Intent intencja = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intencja, REQUEST_IMAGE_CAPTURE);
    }

    public void zad2(View view) {
        ImageButton button = findViewById(R.id.imageButton);
        Random random = new Random();
        Integer randInt = random.nextInt(7);
        int x;
        switch (randInt) {
            case 0:
                x = android.R.drawable.alert_dark_frame;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 1:
                x = android.R.drawable.arrow_down_float;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 2:
                x = android.R.drawable.ic_delete;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 3:
                x = android.R.drawable.ic_input_add;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 4:
                x = R.drawable.img3;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 5:
                x = R.drawable.ic_stat_name;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
            case 6:
                x = R.drawable.ic_launcher_background;
                button.setImageDrawable(getResources().getDrawable(x, getTheme()));
                break;
        }

        Drawable drawable = new DrawableContainer();
        Toast.makeText(getApplicationContext(), randInt.toString(), Toast.LENGTH_SHORT).show();
    }
}
