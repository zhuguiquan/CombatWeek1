package com.bw.combatweek1.persenter;

import com.bw.combatweek1.contract.IMyContract;
import com.bw.combatweek1.model.IModel;
import com.bw.combatweek1.model.bean.LIstBean;

/**
 * DateTime:2019/12/2 0002
 * author:朱贵全(Administrator)
 * function:
 */
public class MyPersenter {
    public void onHomeData(final IMyContract.IView iView){
        IModel iModel = new IModel();
      iModel.onHomeData(new IMyContract.IMyCallBack() {
          @Override
          public void onSuccess(LIstBean lIstBean) {
              iView.onSuccess(lIstBean);
          }

          @Override
          public void onFilure(Throwable throwable) {
              iView.onFilure(throwable);

          }
      });

    }
}
