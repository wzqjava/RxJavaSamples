// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.module.token_advanced_5;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.BaseFragment_ViewBinding;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TokenAdvancedFragment_ViewBinding extends BaseFragment_ViewBinding {
  private TokenAdvancedFragment target;

  private View view2131230805;

  private View view2131230839;

  @UiThread
  public TokenAdvancedFragment_ViewBinding(final TokenAdvancedFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.tokenTv = Utils.findRequiredViewAsType(source, R.id.tokenTv, "field 'tokenTv'", TextView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.invalidateTokenBt, "method 'invalidateToken'");
    view2131230805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.invalidateToken();
      }
    });
    view = Utils.findRequiredView(source, R.id.requestBt, "method 'upload'");
    view2131230839 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.upload();
      }
    });
  }

  @Override
  public void unbind() {
    TokenAdvancedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tokenTv = null;
    target.swipeRefreshLayout = null;

    view2131230805.setOnClickListener(null);
    view2131230805 = null;
    view2131230839.setOnClickListener(null);
    view2131230839 = null;

    super.unbind();
  }
}
