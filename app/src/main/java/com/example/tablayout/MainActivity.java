package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.about,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //nenekan Ctrl + o
        switch (item.getItemId()){
            case R.id.m_About:  Toast.makeText(this,"Abaout",Toast.LENGTH_SHORT).show();


            case R.id.m_option:  Toast.makeText(this,"Option",Toast.LENGTH_SHORT).show();
            break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =findViewById(R.id.tab_layout);
        viewPager= findViewById(R.id.viewpager);
        ViewpagerAdapter adapter =new ViewpagerAdapter(getSupportFragmentManager(),1);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
