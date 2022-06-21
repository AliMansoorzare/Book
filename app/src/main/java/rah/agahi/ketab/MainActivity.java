package rah.agahi.ketab;

import androidx.annotation.NonNull;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import rah.agahi.ketab.fragment.HomeFragment;
import rah.agahi.ketab.fragment.ProfileFragment;
import rah.agahi.ketab.fragment.SearchFragment;
import rah.agahi.ketab.util.Base;

public class MainActivity extends Base implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private void setUpViews() {
        bottomNavigationView = findViewById(R.id.btnBottomNav);
        frameLayout = findViewById(R.id.f);
        getSupportFragmentManager().beginTransaction().replace(R.id.f,new HomeFragment()).commit();

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.homeFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.f,new HomeFragment()).commit();
                break;
            case R.id.searchFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.f,new SearchFragment()).commit();
                break;
            case R.id.profileFragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.f,new ProfileFragment()).commit();
                break;
        }
        return true;
    }
}