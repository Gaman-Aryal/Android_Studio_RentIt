package com.example.rentit;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private TextView Message;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rv = findViewById(R.id.rv_id);

        LinearLayoutManager lilama = new LinearLayoutManager(this);
        lilama.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(lilama);
        List<HomeModelClass> OwnerList = new ArrayList<>();
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Prajwal Ghimire", "Sukedhara"));
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Gaman Aryal", "Kadaghari"));
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Samir Singh", "Dhumbarahi"));
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Gaurav Raut", "Setopul"));
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Dipjyoti Adhikari", "Thuladurlung"));
        OwnerList.add(new HomeModelClass(R.drawable.ic_launcher_background, "Ashish Parajuli", "Sanadurlung"));

        HomeAdapter adapter = new HomeAdapter(OwnerList);
        rv.setAdapter(adapter);
//        Message = (TextView)findViewById(R.id.)
    }
}
