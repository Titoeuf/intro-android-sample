package ca.effenti.myapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int stringId;
        switch (item.getItemId()) {
            case R.id.navigation_home:
                stringId = R.string.title_home;
                break;
            case R.id.navigation_dashboard:
                stringId = R.string.title_dashboard;
                break;
            case R.id.navigation_notifications:
                stringId = R.string.title_notifications;
                break;
            default:
                return false;
        }
        NavigationFragment newFragment = new NavigationFragment();
        Bundle args = new Bundle();
        args.putString(NavigationFragment.ARGUMENT_MESSAGE, getString(stringId));
        newFragment.setArguments(args);

        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, newFragment)
                .commit();
        return true;
    }
}
