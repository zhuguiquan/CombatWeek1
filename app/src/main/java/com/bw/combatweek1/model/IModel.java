package com.bw.combatweek1.model;

import com.bw.combatweek1.contract.IMyContract;
import com.bw.combatweek1.model.bean.LIstBean;
import com.bw.combatweek1.util.Netuitl;
import com.google.gson.Gson;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class IModel {
    public void onHomeData(final IMyContract.IMyCallBack iMyCallBack){
        Netuitl.getInstance().getJson("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new Netuitl.MyCaallBack() {
            @Override
            public void ongetJosn(String json) {
                LIstBean lIstBean = new Gson().fromJson(json, LIstBean.class);
                iMyCallBack.onSuccess(lIstBean);
            }

            @Override
            public void onError(Throwable throwable) {
                iMyCallBack.onFilure(throwable);

            }
        });

    }
}
