package com.bw.combatweek1.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bw.combatweek1.R;
import com.bw.combatweek1.base.BaseActivity;
import com.bw.combatweek1.view.fragment.HomeFragment;
import com.bw.combatweek1.view.fragment.MyFragment;
import com.bw.combatweek1.view.fragment.XinwenFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private ViewPager viewPager;
    private RadioGroup radioGroup;
    List<Fragment>fragmentList=new ArrayList<>();

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.vp);
        radioGroup = findViewById(R.id.rg);
        fragmentList.add(new HomeFragment());
        fragmentList.add(new XinwenFragment());
        fragmentList.add(new MyFragment());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                radioGroup.check(radioGroup.getChildAt(position).getId());

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rg1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.rg2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.rg3:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });


    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
    public void onTiao(){
        viewPager.setCurrentItem(2);
    }
}
