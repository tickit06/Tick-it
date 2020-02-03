package com.example.tick_it;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Home_Fragment extends Fragment {
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    TabItem tabMovies, tabEvents, tabSports, tabPopularEvents;
    Fragment selectedFragment = null;










    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        TabItem tabMovies = view.findViewById(R.id.TabMovies);
        TabItem tabEvents = view.findViewById(R.id.TabEvents);
        TabItem tabSports = view.findViewById(R.id.TabSports);
        TabItem tabPopularEvents = view.findViewById(R.id.TabPopularevents);
        ViewPager viewPager = view.findViewById(R.id.viewPager);


        PagerAdapter pageAdapter = new PagerAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));





        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//









//        viewPager = (ViewPager) view.findViewById(R.id.pager);
//        tabLayout = (TabLayout) view.findViewById(R.id.tablayout);

//        return view;
        return inflater.inflate(R.layout.fragment_home , container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//                if (tab.getPosition() == 1) {
//
//                    selectedFragment = new Movies_Fragment();
//
//
//                } else if (tab.getPosition() == 2) {
//                    selectedFragment = new Events_Fragment();
//
//                } else {
//                    selectedFragment = new Sports_Fragment();
//
//
//                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });

    }


    private void setupViewPager(ViewPager viewPager) {
    }
}
