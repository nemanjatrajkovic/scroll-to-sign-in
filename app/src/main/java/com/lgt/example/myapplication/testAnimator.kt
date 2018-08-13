package com.lgt.example.myapplication

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.widget.ScrollView

class testAnimator {
    internal var scrollView: ScrollView? = null
    fun scroolToTop() {
        val x = 0
        val y = 0
        val xTranslate = ObjectAnimator.ofInt(scrollView, "scrollX", x)
        val yTranslate = ObjectAnimator.ofInt(scrollView, "scrollY", y)

        val animators = AnimatorSet()
        animators.duration = 1000L
        animators.playTogether(xTranslate, yTranslate)
        animators.addListener(object : Animator.AnimatorListener {

            override fun onAnimationStart(arg0: Animator) {
                // TODO Auto-generated method stub
            }

            override fun onAnimationRepeat(arg0: Animator) {
                // TODO Auto-generated method stub

            }

            override fun onAnimationEnd(arg0: Animator) {
                // TODO Auto-generated method stub

            }

            override fun onAnimationCancel(arg0: Animator) {
                // TODO Auto-generated method stub

            }
        })
        animators.start()
    }
}
