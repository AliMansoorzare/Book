package rah.agahi.ketab.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


import rah.agahi.ketab.HomeAdapter;
import rah.agahi.ketab.R;



public class HomeFragment extends Fragment {
View view;
TabLayout tabLayout;
ViewPager viewPager;
HomeAdapter homeAdapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_home, container, false);
        setUpView();
return view;
    }

    private void setUpView() {
        tabLayout = view.findViewById(R.id.simpleTabLayout);
        viewPager = view.findViewById(R.id.viewpager);
        homeAdapter = new HomeAdapter(getChildFragmentManager());
        homeAdapter.addFragment(new IranianFragment(),"ایرانی");
        homeAdapter.addFragment(new ForeignFragment(),"خارجی");
        viewPager.setAdapter(homeAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}