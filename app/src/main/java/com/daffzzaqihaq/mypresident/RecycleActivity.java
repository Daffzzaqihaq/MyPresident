package com.daffzzaqihaq.mypresident;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaPresident,detailPresident;
    int[] gambarPresident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaPresident = getResources().getStringArray(R.array.president_name);
        detailPresident = getResources().getStringArray(R.array.president_detail);
        gambarPresident = new int[]{R.drawable.soekarno, R.drawable.soeharto, R.drawable.habibie, R.drawable.gusdur, R.drawable.megawati, R.drawable.sby, R.drawable.jokowi};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarPresident,namaPresident,detailPresident);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}
