package com.muse.muse_android.fragments;

import androidx.fragment.app.Fragment;

import com.muse.muse_android.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ArtsFragment extends CategoryFragment {

    public ArtsFragment() {

        this.categoryName = "Arts";
        this.titles[0] = "Recent";
        this.titles[1] = "More";

        this.layoutName = R.layout.fragment_arts;
        this.recycler = R.id.artsView;
    }

    public ArtsFragment getInstance() {
        ArtsFragment fragment = new ArtsFragment();
        return fragment;
    }
}