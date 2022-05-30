package com.example.nonton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.nonton.fragment.BaruFragment;
import com.example.nonton.fragment.PopulerFragment;

public class ViewAdapter extends FragmentStateAdapter {
    public ViewAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new BaruFragment();
            case 1 :
                return new PopulerFragment();
            default:
                return new BaruFragment();
        }
    }

    @Override
    public int getItemCount() {

        return 2;
    }
}