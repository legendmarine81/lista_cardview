package com.example.lista_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lista_cardview.adapters.UserRecyclerAdapter;
import com.example.lista_cardview.models.User;

import java.util.ArrayList;
import  java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.kisscrts, R.drawable.poisonss, R.drawable.waspblackie, R.drawable.skid, R.drawable.warrant, R.drawable.motleycrue, R.drawable.slayer};

    List<User> users = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllUsers();
        UserRecyclerAdapter adapter = new UserRecyclerAdapter(users,this);
        recyclerView = findViewById(R.id.myRecycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void getAllUsers(){
        String[] names = getResources().getStringArray(R.array.names_txt);
        String[] generes = getResources().getStringArray(R.array.genero_text);

        for(int i=0; i<names.length; i++){
            users.add(new User(names[i],generes[i],images[i]));
        }
    }
}