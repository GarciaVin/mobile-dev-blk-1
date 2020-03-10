package edu.ucucite.mobiledevblk1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText eUsername;
        EditText ePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername=findViewById(R.id.mEditUsername);
        ePassword=findViewById(R.id.mEditPassword);
    }

    //Button
    public void clickConnect(View view){
        String stUsername=eUsername.getText().toString();
        String stPassword=ePassword.getText().toString();

       //Getting Data
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String stName=bundle.get("name").toString();
        String stUser=bundle.get("username").toString();
        String stPass=bundle.get("pass").toString();


        if(stUser.equals(stUsername.toString()) && stPass.equals(stPassword)){

            //startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            Intent intentProfile=new Intent(MainActivity.this, ProfileActivity.class);
            intentProfile.putExtra("name", stName);
            startActivity(intentProfile);

        }else{
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
        }


    }

    public void clickSign(View view){
        startActivity(new Intent(MainActivity.this,SignUpActivity.class ));
    }
}
