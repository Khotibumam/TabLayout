package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {


    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { //menapilkan fragment apa yang dipilih
        Fragment fragment;
        switch (position) {
            case 0: fragment =new SatuFragment();
                return fragment;
            case 1: fragment =new DuaFragment();
                return fragment;
            default:fragment =new SatuFragment();
                return fragment;
        }


    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Satu";
            case 1: return "Dua";
            default:return "Satu";
        }


    }
}
