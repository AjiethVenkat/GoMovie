package edu.newhaven.gomovie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.loginButton);
        ed1 = (EditText) findViewById(R.id.emailLogin);
        ed2 = (EditText) findViewById(R.id.passwordLogin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().equals("Admin")&&ed2.getText().equals("Admin")){
                    Toast.makeText()
                }
            }
        });


    }
}
