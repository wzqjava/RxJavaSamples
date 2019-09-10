// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.module.zip_3;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.BaseFragment_ViewBinding;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ZipFragment_ViewBinding extends BaseFragment_ViewBinding {
  private ZipFragment target;

  private View view2131230916;

  @UiThread
  public ZipFragment_ViewBinding(final ZipFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.gridRv = Utils.findRequiredViewAsType(source, R.id.gridRv, "field 'gridRv'", RecyclerView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.zipLoadBt, "method 'load'");
    view2131230916 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.load();
      }
    });
  }

  @Override
  public void unbind() {
    ZipFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gridRv = null;
    target.swipeRefreshLayout = null;

    view2131230916.setOnClickListener(null);
    view2131230916 = null;

    super.unbind();
  }
}
