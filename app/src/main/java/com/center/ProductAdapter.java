package com.center;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.apple.housekeepshop.R;

import java.util.List;

/**
 * Created by apple on 16/5/13.
 */
public class ProductAdapter extends ArrayAdapter<Product>{
    private int resourceId;
    public ProductAdapter(Context context, int textViewResourceId,
                          List<Product> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Product product = getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView productName = (TextView) view.findViewById(R.id.product_name);
        productName.setText(product.getName());
        return view;
    }

}
