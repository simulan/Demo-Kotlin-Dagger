package be.sanderdebleecker.hellokotlin.mvp.view.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import be.sanderdebleecker.hellokotlin.R
import be.sanderdebleecker.hellokotlin.core.di.components.DaggerSolitaireComponent
import be.sanderdebleecker.hellokotlin.core.di.modules.SolitaireModule
import be.sanderdebleecker.hellokotlin.mvp.model.GameModel
import be.sanderdebleecker.hellokotlin.mvp.presenter.SolitairePresenter
import be.sanderdebleecker.hellokotlin.mvp.view.views.SolitaireView
import javax.inject.Inject

open class SolitaireActivity : BaseActivity(), SolitaireView {

    @Inject protected lateinit var mPresenter: SolitairePresenter

    //BaseActivity
    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent?) {
        super.onViewReady(savedInstanceState, intent)
        mPresenter.start()
        //bind things here if necessary
    }

    override fun resolveDaggerDependencies() {
        DaggerSolitaireComponent.builder()
                .applicationComponent(getApplicationComponent())
                .solitaireModule(SolitaireModule(this))
                .build().inject(this)
    }

    override fun getContentView(): Int {
        return R.layout.activity_solitaire
    }

    //SolitaireView
    override fun showToast(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
    override fun update(model: GameModel) {
    }

}
