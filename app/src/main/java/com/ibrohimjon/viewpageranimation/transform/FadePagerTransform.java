package com.ibrohimjon.viewpageranimation.transform;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Ibrohimjon on 11.04.2020.
 */
public class FadePagerTransform implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        page.setTranslationX(page.getWidth() * -position);

        if (position <= -1 || position >= 1) {
            page.setAlpha(0);
        } else if (position == 0) {
            page.setAlpha(1);
        } else {
            page.setAlpha(1 - Math.abs(position));
        }
    }
}
