package com.example.rentit;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private TextView Message;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new home_fragment()).commit();

//        rv = findViewById(R.id.rv_id);
//
//        LinearLayoutManager lilama = new LinearLayoutManager(this);
//        lilama.setOrientation(LinearLayoutManager.VERTICAL);
//        rv.setLayoutManager(lilama);
//        List<HomeModelClass> OwnerList = new ArrayList<>();
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Prajwal Ghimire", "Sukedhara"));
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Gaman Aryal", "Kadaghari"));
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Samir Singh", "Dhumbarahi"));
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Gaurav Raut", "Setopul"));
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Dipjyoti Adhikari", "Thuladurlung"));
//        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Ashish Parajuli", "Sanadurlung"));
//
//        HomeAdapter adapter = new HomeAdapter(OwnerList);
//        rv.setAdapter(adapter);
////        Message = (TextView)findViewById(R.id.)
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new home_fragment() ;
                            break;
                        case R.id.nav_message:
                            selectedFragment = new message_fragment() ;
                            break;
                        case R.id.nav_search:
                            selectedFragment = new search_fragment() ;
                            break;
                        case R.id.nav_notification:
                            selectedFragment = new notification_fragment() ;
                            break;
                        case R.id.nav_setting:
                            selectedFragment = new setting_fragment() ;
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            };
}
