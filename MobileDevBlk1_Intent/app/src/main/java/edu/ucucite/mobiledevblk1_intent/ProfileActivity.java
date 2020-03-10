package edu.ucucite.mobiledevblk1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String stName=bundle.get("name").toString();

        Toast.makeText(this, "Welcome " + stName, Toast.LENGTH_SHORT).show();

    }
}
