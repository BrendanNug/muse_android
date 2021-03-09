package com.muse.muse_android.fragments;

import androidx.fragment.app.Fragment;

import com.muse.muse_android.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class LifestyleFragment extends CategoryFragment {

    public LifestyleFragment() {

        this.categoryName = "Lifestyle";
        this.titles[0] = "Recent";
        this.titles[1] = "More";

        this.layoutName = R.layout.fragment_lifestyle;
        this.recycler = R.id.lifestyleView;
    }

    public LifestyleFragment getInstance() {
        LifestyleFragment fragment = new LifestyleFragment();
        return fragment;
    }
}