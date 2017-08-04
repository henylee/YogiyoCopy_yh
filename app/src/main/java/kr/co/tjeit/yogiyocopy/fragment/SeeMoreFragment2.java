package kr.co.tjeit.yogiyocopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.co.tjeit.yogiyocopy.R;

/**
 * Created by the on 2017-08-04.
 */

public class SeeMoreFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.franment_see_more_item, container,false);
        return v;
    }
}
