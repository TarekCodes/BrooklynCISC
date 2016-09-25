package com.tareksaidee.android.brooklyncisc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tareksaidee.android.brooklyncisc.R;

public class MmcMnReq extends Fragment {
    public MmcMnReq(){}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mmc_mn_req, container, false);
    }
}
