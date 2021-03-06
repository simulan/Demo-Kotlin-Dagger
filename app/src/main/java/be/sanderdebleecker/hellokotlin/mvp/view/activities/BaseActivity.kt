package be.sanderdebleecker.hellokotlin.mvp.view.activities

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import be.sanderdebleecker.hellokotlin.core.application.SolitaireApplication
import be.sanderdebleecker.hellokotlin.core.di.components.ApplicationComponent
import butterknife.ButterKnife
import butterknife.Unbinder

/**
 * @author Simulan
 * @version 1.0.0
 * @since 26/05/2017
 */


open class BaseActivity : AppCompatActivity() {
    private lateinit var mBinder: Unbinder

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        mBinder = ButterKnife.bind(this)
        onViewReady(savedInstanceState, intent)
    }

    @CallSuper
    protected open fun onViewReady(savedInstanceState: Bundle?, intent: Intent?) {
        resolveDaggerDependencies()
    }

    override fun onDestroy() {
        mBinder.unbind()
        super.onDestroy()
    }

    protected fun getApplicationComponent(): ApplicationComponent {
        val application: Application = application
        if (application is SolitaireApplication) {
            return application.getApplicationComponent()
        } else {
            throw Exception("BaseActivity depends on SolitaireApplication to be defined!")
        }
    }
     open fun resolveDaggerDependencies() {

     }
     open fun getContentView(): Int {
         TODO("implement")
     }
}