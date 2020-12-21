package com.example.tech_er;
import com.example.tech_er.InformationPages.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tech_er.MainMenuP.CreditsPage;
import com.example.tech_er.MainMenuP.JavaPage;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    public Button java;
    public Button hardware;
    public Button personalPage;
    public Button forum;
    public Button credits;
    public Button logout;
    public TextView username;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu2);

        java = findViewById(R.id.javaButton);
        hardware = findViewById(R.id.hardwareButton);
        personalPage = findViewById(R.id.personaPage);
        forum = findViewById(R.id.forumPage);
        credits = findViewById(R.id.creditsButton);
        username = findViewById(R.id.usernameDisplay);
        logout = findViewById(R.id.logoutButton);

        Intent intent = getIntent();
        String text= intent.getStringExtra(MainActivity.EXTRA_NAME);
        username.setText("Welcome: " + text);

        java.setOnClickListener(this);
        hardware.setOnClickListener(this);
        personalPage.setOnClickListener(this);
        forum.setOnClickListener(this);
        credits.setOnClickListener(this);
        logout.setOnClickListener(this);


       

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.javaButton) {
            Intent intent = new Intent(this, JavaPage.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.hardwareButton){
            Intent intent = new Intent(this, temp_info.class );
            startActivity(intent);
        }

        if (v.getId() == R.id.personaPage){
            username.setText("Personal page will be displayed");
        }

        if (v.getId() == R.id.forumPage){
            username.setText("Forum page will be displayed");
        }

        if (v.getId() == R.id.creditsButton){
            Intent intent = new Intent(this, CreditsPage.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.logoutButton){
            finish();
        }


    }


}