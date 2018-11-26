package com.example.omin.myapp02_viewpager;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyViewPagerAdapter extends FragmentPagerAdapter {

    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return ItemFragment.newInstance(images[i]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
