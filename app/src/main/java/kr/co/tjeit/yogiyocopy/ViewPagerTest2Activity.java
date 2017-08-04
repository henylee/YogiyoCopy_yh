package kr.co.tjeit.yogiyocopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import kr.co.tjeit.yogiyocopy.fragment.StoreListFragment;
import kr.co.tjeit.yogiyocopy.fragment.myProfileFragment;

public class ViewPagerTest2Activity extends AppCompatActivity {

    ViewPager myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_test2);
        myViewPager = (ViewPager) findViewById(R.id.myViewPager);
        myViewPager.setAdapter(new mainPagerAdapter(getSupportFragmentManager()));
    }

    // inner class => 클래스 안의 클래스

    class mainPagerAdapter extends FragmentStatePagerAdapter {

        public mainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0) {
                return new StoreListFragment();
            }
            else {
                return new myProfileFragment();
            }
        }
    }
}
