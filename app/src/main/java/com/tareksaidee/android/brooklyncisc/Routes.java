package com.tareksaidee.android.brooklyncisc;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tareksaidee.android.brooklyncisc.fragments.CmElec;
import com.tareksaidee.android.brooklyncisc.fragments.CmOther;
import com.tareksaidee.android.brooklyncisc.fragments.CmReq;
import com.tareksaidee.android.brooklyncisc.fragments.CsMElec;
import com.tareksaidee.android.brooklyncisc.fragments.CsMOther;
import com.tareksaidee.android.brooklyncisc.fragments.CsMReq;

public class Routes extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ViewPagerAdapter adapter;
    int sourceID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sourceID = getIntent().getExtras().getInt("buttonID");
        setContentView(pickRoute());
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        pickFragments();
        viewPager.setAdapter(adapter);
    }

    private void pickFragments() {
            switch (sourceID){
                case R.id.major_cm:
                    adapter.addFragment(new CmReq(), "Requirements");
                    adapter.addFragment(new CmElec(), "Electives");
                    adapter.addFragment(new CmOther(), "Other");
                    break;
                case R.id.major_cs:
                    adapter.addFragment(new CsMReq(), "Requirements");
                    adapter.addFragment(new CsMElec(), "Electives");
                    adapter.addFragment(new CsMOther(), "Other");
                    break;
                default:
                    adapter.addFragment(new CmReq(), "Requirements");
                    adapter.addFragment(new CmElec(), "Electives");
                    adapter.addFragment(new CmOther(), "Other");
            }
    }

    private int pickRoute() {
        switch (sourceID) {
            case R.id.minor_cs:
                return R.layout.csminor;
            case R.id.major_mmc:
                return R.layout.mmcmajor;
            case R.id.minor_mmc:
                return R.layout.mmcminor;
            case R.id.minor_pdc:
                return R.layout.pdcminor;
            case R.id.major_cm:
                return R.layout.cmmajor;
            default:
                return R.layout.csmajor;
        }
    }
}
