package com.example.user.uts_edo_d1041161005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button btnIntent, btnService,btnActivity, btnBroadcast,btnContentprovider;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        btnIntent = (Button) findViewById(R.id.komponen1);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchIntent();
            }
        });

        btnService = (Button) findViewById(R.id.komponen2);
        btnService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { launchService();
            }
        });

        btnActivity = (Button) findViewById(R.id.komponen3);
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { launchActivity();
            }
        });

        btnBroadcast = (Button) findViewById(R.id.komponen4);
        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { launchBroadcast();
            }
        });

        btnContentprovider = (Button) findViewById(R.id.komponen5);
        btnContentprovider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { launchContentprovider();
            }
        });
    }
        private void launchIntent() {
            startActivity(new Intent(MainActivity.this, KomponenIntent.class));
            finish();
        }

        private void launchService() {
            startActivity(new Intent(MainActivity.this, KomponenService.class));
            finish();
        }

        private void launchActivity() {
            startActivity(new Intent(MainActivity.this, KomponenActivity.class));
            finish();
        }

        private void launchBroadcast() {
            startActivity(new Intent(MainActivity.this, KomponenBroadcastreceiver.class));
            finish();
        }

        private void launchContentprovider() {
            startActivity(new Intent(MainActivity.this, KomponenContentprovider.class));
            finish();
        }

}
