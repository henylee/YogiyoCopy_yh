package kr.co.tjeit.yogiyocopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.zip.Inflater;

import kr.co.tjeit.yogiyocopy.R;
import kr.co.tjeit.yogiyocopy.data.OrderData;
import kr.co.tjeit.yogiyocopy.data.StoreData;

/**
 * Created by the on 2017-08-03.
 */

public class OrderAdapter extends ArrayAdapter<OrderData> {

    Context mContext;
    List<OrderData> mList;
    LayoutInflater inf;

    public OrderAdapter (Context context, List<OrderData> list) {

        super(context, R.layout.order_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.order_list_item, null);
        }

        OrderData data = mList.get(position);

        TextView orderNameTxt = (TextView) row.findViewById(R.id.orderNameTxt);
        TextView orderDateTxt = (TextView) row.findViewById(R.id.orderDateTxt);
        TextView orderTownTxt = (TextView) row.findViewById(R.id.orderTownTxt);
        TextView orderPayTxt = (TextView) row.findViewById(R.id.orderPayTxt);
        TextView reviewTxt = (TextView) row.findViewById(R.id.reviewTxt);
        TextView ordersTxt = (TextView) row.findViewById(R.id.ordersTxt);

        orderNameTxt.setText(data.getOrderStore().getStoreName());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
        orderDateTxt.setText(sdf.format(data.getOrderDate().getTime()));

        orderTownTxt.setText(data.getLocation());

        String orderPayStr = String.format("%,d원", data.getCost());
        orderPayTxt.setText(orderPayStr);

        return row;
    }

}
