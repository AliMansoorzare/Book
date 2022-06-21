package rah.agahi.ketab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends FragmentPagerAdapter {
    private List<String> lstTitle = new ArrayList<>();
    private List<Fragment> lstFragment = new ArrayList<>();
    public HomeAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return lstTitle.get(position);
    }
    public void addFragment(Fragment fragment , String title){
        lstTitle.add(title);
        lstFragment.add(fragment);
    }
}
