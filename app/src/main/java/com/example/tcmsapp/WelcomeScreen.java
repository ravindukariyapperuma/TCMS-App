package com.example.tcmsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

public class WelcomeScreen extends AppCompatActivity {

    private int SLEEP_TIMER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_screen);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }
    private class LogoLauncher extends Thread
    {
        public void run()
        {
            try
            {
                sleep(1000 * SLEEP_TIMER);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent = new Intent(WelcomeScreen.this,Accounts.class);
            startActivity(intent);
            WelcomeScreen.this.finish();
        }
    }
}