package com.example.mid_exam_mohammedalshorbaji;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private static final String[] TITLES = {"First", "Second", "Third"};

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PageFragment.newInstance(TITLES[position] + " Fragment");
    }

    @Override
    public int getItemCount() {
        return TITLES.length;
    }

    public static String getTitle(int position) {
        return TITLES[position];
    }
}