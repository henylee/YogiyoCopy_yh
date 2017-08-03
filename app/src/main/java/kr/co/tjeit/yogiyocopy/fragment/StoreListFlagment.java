package kr.co.tjeit.yogiyocopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import kr.co.tjeit.yogiyocopy.R;

/**
 * Created by the on 2017-08-03.
 */

public class StoreListFlagment extends Fragment {

    private ListView storeListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_store_list, container, false);
        storeListView = (ListView) v.findViewById(R.id.storeListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // 우리가 사용하게 될 메쏘드.
    }
}
