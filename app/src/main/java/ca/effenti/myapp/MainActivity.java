package ca.effenti.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button loginButton;
    private Button navigateButton;
    private EditText usernameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define components
        usernameInput = findViewById(R.id.usernameInput);

        loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(this);

        navigateButton = findViewById(R.id.btnNavigate);
        navigateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == loginButton){
            String inputUsername = usernameInput.getText().toString();
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(SecondActivity.EXTRA_USERNAME, inputUsername);
            startActivity(intent);
        } else if (v == navigateButton){
            startActivity(new Intent(this, BottomNavigationActivity.class));
        }
    }
}
