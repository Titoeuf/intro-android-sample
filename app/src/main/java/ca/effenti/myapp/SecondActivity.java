package ca.effenti.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find the text view
        TextView txtHello = findViewById(R.id.txtHello);

        // Compute the username
        String username = "";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            username = extras.getString(EXTRA_USERNAME, "");
        }

        String helloUser = String.format(getString(R.string.hello_user), username);

        // Set the text
        txtHello.setText(helloUser);
    }
}
