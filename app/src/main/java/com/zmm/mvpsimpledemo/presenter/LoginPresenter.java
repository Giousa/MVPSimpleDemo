package com.zmm.mvpsimpledemo.presenter;

import com.zmm.mvpsimpledemo.model.User;
import com.zmm.mvpsimpledemo.view.LoginView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午1:51
 */

public interface LoginPresenter {

    void attachView(LoginView loginView);

    void detachView();

    void login(User user);
}
