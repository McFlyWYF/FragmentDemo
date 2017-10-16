package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 王宇飞 on 2017/10/16/016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
