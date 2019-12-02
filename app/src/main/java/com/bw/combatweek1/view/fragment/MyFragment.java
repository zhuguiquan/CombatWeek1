package com.bw.combatweek1.view.fragment;

import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.bw.combatweek1.R;
import com.bw.combatweek1.base.BaseFragment;
import com.bw.combatweek1.contract.IMyContract;
import com.bw.combatweek1.model.bean.LIstBean;
import com.bw.combatweek1.persenter.MyPersenter;
import com.bw.combatweek1.view.adapter.MyAdapter;

import java.util.List;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class MyFragment extends BaseFragment implements IMyContract.IView {

    private GridView gridView;

    @Override
    protected void initData() {
        MyPersenter myPersenter = new MyPersenter();
        myPersenter.onHomeData(this);

    }

    @Override
    protected void initView(View inflate) {
        gridView = inflate.findViewById(R.id.gv);

    }

    @Override
    protected int layoutId() {
        return R.layout.myfragment;
    }


    @Override
    public void onSuccess(LIstBean lIstBean) {
        List<LIstBean.DataBean> data = lIstBean.getData();
        Toast.makeText(getContext(), "成功", Toast.LENGTH_SHORT).show();
        MyAdapter myAdapter = new MyAdapter(data);
        gridView.setAdapter(myAdapter);

    }

    @Override
    public void onFilure(Throwable throwable) {
        Toast.makeText(getContext(), "失败", Toast.LENGTH_SHORT).show();

    }
}
