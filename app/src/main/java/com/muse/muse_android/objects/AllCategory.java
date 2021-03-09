package com.muse.muse_android.objects;

import com.muse.muse_android.CategoriesActivity;
import com.muse.muse_android.fragments.ArtsFragment;
import com.muse.muse_android.fragments.CategoryFragment;
import com.muse.muse_android.fragments.FashionFragment;
import com.muse.muse_android.fragments.HomeFragment;
import com.muse.muse_android.fragments.LifestyleFragment;
import com.muse.muse_android.fragments.MusicFragment;
import com.muse.muse_android.requests.fetchCategoryData;

import java.util.ArrayList;

public class AllCategory {

    public static CategoryFragment [] fragments = new CategoryFragment[CategoriesActivity.getCategories().length];
    public static ArrayList<CategoryArticle> [] allCategory = new ArrayList[CategoriesActivity.getCategories().length];

    public AllCategory() {
        fragments[0] = new HomeFragment();
        fragments[1] = new LifestyleFragment();
        fragments[2] = new FashionFragment();
        fragments[3] = new MusicFragment();
        fragments[4] = new ArtsFragment();

        for (int i = 0; i < allCategory.length; i++) {
            allCategory[i] = new ArrayList<>();
            fetchCategoryData process = new fetchCategoryData(CategoriesActivity.getCategories()[i], 1, 20, i);
            process.execute();
        }
    }

}
