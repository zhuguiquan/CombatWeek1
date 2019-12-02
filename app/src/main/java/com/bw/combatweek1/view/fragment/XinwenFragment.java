package com.bw.combatweek1.view.fragment;

import android.view.View;
import android.widget.Button;

import com.bw.combatweek1.R;
import com.bw.combatweek1.base.BaseFragment;
import com.bw.combatweek1.view.activity.MainActivity;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class XinwenFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.onTiao();
            }
        });

    }

    @Override
    protected int layoutId() {
        return R.layout.xinwen;
    }
}
