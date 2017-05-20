package com.zxn.mvp.lce;

import android.support.annotation.UiThread;

import com.zxn.mvp.MvpView;

/**
 * Created by zxn on 17-5-20.
 */

public interface LceView<M> extends MvpView {

    @UiThread
    public void showLoading();

    @UiThread
    public void dismissLoading();

    @UiThread
    public void showContent(M data);

    @UiThread
    public void showError(Throwable e);

    @UiThread
    public void showEmpty();

}
