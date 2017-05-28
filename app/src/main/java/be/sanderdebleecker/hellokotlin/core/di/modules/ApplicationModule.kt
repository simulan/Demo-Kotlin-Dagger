package be.sanderdebleecker.hellokotlin.core.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Simulan
 * @version 1.0.0
 * @since 28/05/2017
 */
@Module
class ApplicationModule(private val mContext: Context) {
    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return mContext
    }
}
