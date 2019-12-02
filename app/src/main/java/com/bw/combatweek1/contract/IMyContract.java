package com.bw.combatweek1.contract;

import com.bw.combatweek1.model.bean.LIstBean;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public interface IMyContract {
    interface IView{
        void onSuccess(LIstBean lIstBean);
        void onFilure(Throwable throwable);
    }
    interface IMyCallBack{
        void onSuccess(LIstBean lIstBean);
        void onFilure(Throwable throwable);
    }
}
