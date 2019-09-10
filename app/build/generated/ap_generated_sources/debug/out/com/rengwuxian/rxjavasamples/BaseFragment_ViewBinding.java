// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseFragment_ViewBinding implements Unbinder {
  private BaseFragment target;

  private View view2131230894;

  @UiThread
  public BaseFragment_ViewBinding(final BaseFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tipBt, "method 'tip'");
    view2131230894 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tip();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230894.setOnClickListener(null);
    view2131230894 = null;
  }
}
