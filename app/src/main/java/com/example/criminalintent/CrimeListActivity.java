package com.example.criminalintent;

import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by 王宇飞 on 2017/10/16/016.
 */

public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks,CrimeFragment.Callbacks{

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId(){
        return R.layout.activity_masterdetal;
    }

    @Override
    public void onCrimeSelected(Crime crime){
        if (findViewById(R.id.detial_fragment_container) == null){
            Intent intent = CrimePagerActivity.newIntent(this,crime.getmId());
            startActivity(intent);
        }else {
            Fragment newDetail = CrimeFragment.newInstance(crime.getmId());
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detial_fragment_container,newDetail)
                    .commit();
        }
    }

    @Override
    public void onCrimeUpdated(Crime crime){
        CrimeListFragment listFragment = (CrimeListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container);
        listFragment.updateUI();
    }
}
