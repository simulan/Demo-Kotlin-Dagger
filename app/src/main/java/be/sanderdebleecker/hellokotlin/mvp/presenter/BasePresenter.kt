package be.sanderdebleecker.hellokotlin.mvp.presenter

import be.sanderdebleecker.hellokotlin.mvp.view.views.BaseView
import javax.inject.Inject

/**
 * @author Simulan
 * @version 1.0.0
 * @since 27/05/2017
 */

open class BasePresenter<V : BaseView> {
    @Inject protected lateinit var mView: V

    protected fun getView() : V {
        return mView;
    }
}