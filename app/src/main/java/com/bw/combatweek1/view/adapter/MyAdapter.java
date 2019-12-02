package com.bw.combatweek1.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bw.combatweek1.R;
import com.bw.combatweek1.model.bean.LIstBean;
import com.bw.combatweek1.util.Netuitl;

import java.util.List;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class MyAdapter extends BaseAdapter {
    private List<LIstBean.DataBean> data;

    public MyAdapter(List<LIstBean.DataBean> data) {

        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder=null;
        if(view==null){
            view=View.inflate(viewGroup.getContext(), R.layout.item, null);
            viewHolder=new ViewHolder();
            viewHolder.imageView=view.findViewById(R.id.img);
            viewHolder.textView=view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        }else{
             viewHolder = (ViewHolder) view.getTag();

        }
        LIstBean.DataBean dataBean = data.get(i);
        viewHolder.textView.setText(dataBean.getGoods_name());
        Netuitl.getInstance().getPhoto(dataBean.getGoods_thumb(),viewHolder.imageView);
        return view;
    }
    private class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
