package com.bw.combatweek1.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.combatweek1.R;
import com.bw.combatweek1.base.BaseFragment;
import com.bw.combatweek1.util.Netuitl;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class HomeFragment extends BaseFragment {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View inflate) {
        imageView = inflate.findViewById(R.id.image);
        textView = inflate.findViewById(R.id.text);
        if(Netuitl.getInstance().hasNet(getContext())){
            imageView.setVisibility(View.GONE);
            textView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
        }

    }

    @Override
    protected int layoutId() {
        return R.layout.home;
    }
}
