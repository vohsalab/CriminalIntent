package com.ibalashov.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ibalashov on 9/9/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
