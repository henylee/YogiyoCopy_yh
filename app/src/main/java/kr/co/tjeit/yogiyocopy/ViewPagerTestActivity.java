package kr.co.tjeit.yogiyocopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import kr.co.tjeit.yogiyocopy.fragment.OrderListFragment;
import kr.co.tjeit.yogiyocopy.fragment.SeeMoreFragment;
import kr.co.tjeit.yogiyocopy.fragment.StoreListFragment;
import kr.co.tjeit.yogiyocopy.fragment.myProfileFragment;

public class ViewPagerTestActivity extends AppCompatActivity {

    ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_test);
        mainViewPager = (ViewPager) findViewById(R.id.mainViewPager);
        mainViewPager.setAdapter(new myPagerAdapter(getSupportFragmentManager()));
    }

    class myPagerAdapter extends FragmentStatePagerAdapter {

        public myPagerAdapter(FragmentManager fm) {
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
            else if (position==1) {
                return new OrderListFragment();
            }
            else if (position==2) {
                return new SeeMoreFragment();
            }
            else {
                return new myProfileFragment();
            }
        }

    }
}
