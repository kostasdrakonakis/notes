package com.kostasdrakonakis.notes.mvp

abstract class ActivityPresenter<V : IActivityView> : AbstractPresenter<V>(), IActivityPresenter<V> {

    override fun onClose() {
        view?.goBack()
    }
}