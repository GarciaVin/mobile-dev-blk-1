package edu.ucucite.mobiledevblk1_java_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnConnect;
    EditText eUsername;
    EditText ePassword;
    TextView txtDis;
    TextView txtUCU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePassword=findViewById(R.id.editPassword);
        btnConnect=findViewById(R.id.btnConnect);
        eUsername=findViewById(R.id.editUsername);
        txtDis=findViewById(R.id.txtDisplay);
        txtUCU=findViewById(R.id.txtUCU);

            btnConnect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String stUsername=eUsername.getText().toString();//Don
                    String stPassword=ePassword.getText().toString();

                    txtDis.setText("Your Username is: " + stUsername
                    + "\nYour Password is: " + stPassword);


                    txtUCU.setText("Your Username is: " + stUsername
                            + "\nYour Password is: " + stPassword);
                }
            });



        btnConnect.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "Sample Long click and Toast", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"Text", Toast.LENGTH_LONG).show();
                return false;
            }
        });


    }//OnCreate

    public void clickConnect(View view){
        String stUsername=eUsername.getText().toString();//Don
        String stPassword=ePassword.getText().toString();
                    txtDis.setText("Your Username is: " + stUsername
                    + "\nYour Password is: " + stPassword);



    }
}
