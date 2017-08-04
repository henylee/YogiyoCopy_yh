package kr.co.tjeit.yogiyocopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import kr.co.tjeit.yogiyocopy.fragment.SeeMoreFragment;
import kr.co.tjeit.yogiyocopy.fragment.SeeMoreFragment2;
import kr.co.tjeit.yogiyocopy.fragment.StoreListFragment;
import kr.co.tjeit.yogiyocopy.fragment.myProfileFragment;

public class ViewPagerTest3Activity extends AppCompatActivity {

    private android.support.v4.view.ViewPager myViewPaser3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_test3);
        myViewPaser3 = (ViewPager) findViewById(R.id.myViewPager3);
        myViewPaser3.setAdapter(new myViewAdapter3(getSupportFragmentManager()));
    }

    class myViewAdapter3 extends FragmentStatePagerAdapter {
        public myViewAdapter3(FragmentManager fm) {
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
                return new SeeMoreFragment();
            }
            else if (position==2) {
                return new SeeMoreFragment2();
            }
            else {
                return new myProfileFragment();
            }
        }
    }
}
