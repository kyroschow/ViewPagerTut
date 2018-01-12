package com.example.chow.viewpagertut;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by per6 on 1/10/18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new ChildFragment1(); //ChildFragment1 at position 0
            case 1:
                return new ChildFragment2(); //ChildFragment2 at position 1
            case 2:
                return new ChildFragment3(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 3; //three fragments
    }
}
