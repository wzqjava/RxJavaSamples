// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.module.map_2;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.BaseFragment_ViewBinding;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MapFragment_ViewBinding extends BaseFragment_ViewBinding {
  private MapFragment target;

  private View view2131230835;

  private View view2131230824;

  @UiThread
  public MapFragment_ViewBinding(final MapFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.pageTv = Utils.findRequiredViewAsType(source, R.id.pageTv, "field 'pageTv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.previousPageBt, "field 'previousPageBt' and method 'previousPage'");
    target.previousPageBt = Utils.castView(view, R.id.previousPageBt, "field 'previousPageBt'", Button.class);
    view2131230835 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.previousPage();
      }
    });
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.gridRv = Utils.findRequiredViewAsType(source, R.id.gridRv, "field 'gridRv'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.nextPageBt, "method 'nextPage'");
    view2131230824 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nextPage();
      }
    });
  }

  @Override
  public void unbind() {
    MapFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pageTv = null;
    target.previousPageBt = null;
    target.swipeRefreshLayout = null;
    target.gridRv = null;

    view2131230835.setOnClickListener(null);
    view2131230835 = null;
    view2131230824.setOnClickListener(null);
    view2131230824 = null;

    super.unbind();
  }
}
