package com.ibrohimjon.viewpageranimation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ibrohimjon.viewpageranimation.transform.PagerTransform;

import java.util.ArrayList;
import java.util.List;

public class Asosiy_oyna extends AppCompatActivity {

    PagerAdapter adapter;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asosiy_oyna);

        pager = findViewById(R.id.pager);

        adapter = new PagerAdapter(Asosiy_oyna.this, getData());
        pager.setAdapter(adapter);
        pager.setPageTransformer(true, new PagerTransform());
    }

    public List<PlatformData> getData() {
        List<PlatformData> lstResult = new ArrayList<>();

        PlatformData data = new PlatformData();

        data.name = "Android";
        data.imageId = R.drawable.iq_book;
        lstResult.add(data);

        data = new PlatformData();

        data.name = "Midas book";
        data.imageId = R.drawable.midas_book;
        lstResult.add(data);

        data = new PlatformData();

        data.name = "Rich Sister";
        data.imageId = R.drawable.rich_sister;
        lstResult.add(data);
        return lstResult;
    }
}
