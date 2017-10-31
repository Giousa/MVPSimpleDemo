package com.zmm.mvpsimpledemo.presenter;

import android.text.TextUtils;

import com.zmm.mvpsimpledemo.model.User;
import com.zmm.mvpsimpledemo.view.LoginView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午1:54
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView mLoginView;

    @Override
    public void attachView(LoginView loginView) {
        mLoginView = loginView;
    }

    @Override
    public void detachView() {
        mLoginView = null;
    }

    @Override
    public void login(User user) {

        if(user == null){
            mLoginView.onLoginError();
        }else {
            if(TextUtils.isEmpty(user.getUsername()) || TextUtils.isEmpty(user.getPassword())){
               mLoginView.onLoginEmpty();
            }else {
                if(user.getPassword().equals("123") && user.getUsername().equals("tom")){
                    mLoginView.onLoginSuccess();
                }else {
                    mLoginView.onLoginFailed();
                }
            }
        }
    }
}
