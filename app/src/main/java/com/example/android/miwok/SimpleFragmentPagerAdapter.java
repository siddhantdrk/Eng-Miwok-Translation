package com.example.android.miwok;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] categories= new String[]{"NUMBERS", "FAMILY", "COLORS", "PHRASES" };

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if(position==2){
            return new ColorsFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return categories[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
