package com.muse.muse_android.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.muse.muse_android.CategoriesActivity;
import com.muse.muse_android.fragments.CategoryFragment;
import com.muse.muse_android.objects.AllCategory;

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    public CategoryFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        CategoryFragment pageFragment = AllCategory.fragments[position];
        position = position + 1;
        return pageFragment;
    }

    @Override
    public int getCount() {
        return CategoriesActivity.getCategories().length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CategoriesActivity.getCategories()[position];
    }
}
