package com.ibrohimjon.viewpageranimation;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ibrohimjon on 11.04.2020.
 */
public class PagerAdapter extends android.support.v4.view.PagerAdapter {
    Activity activity;
    List<PlatformData> data;
    LayoutInflater layoutInflater;

    public PagerAdapter(Activity activity, List<PlatformData> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.pager_item, container, false);

        ImageView imageView = itemView.findViewById(R.id.image_view);
        TextView txt_view = itemView.findViewById(R.id.txt_view);

        imageView.setBackgroundResource(data.get(position).getImageId());
        txt_view.setText(data.get(position).getName());

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);
    }
}
