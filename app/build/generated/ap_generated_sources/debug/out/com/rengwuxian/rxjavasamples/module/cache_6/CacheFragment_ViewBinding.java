// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.module.cache_6;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.BaseFragment_ViewBinding;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CacheFragment_ViewBinding extends BaseFragment_ViewBinding {
  private CacheFragment target;

  private View view2131230764;

  private View view2131230763;

  private View view2131230814;

  @UiThread
  public CacheFragment_ViewBinding(final CacheFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.loadingTimeTv = Utils.findRequiredViewAsType(source, R.id.loadingTimeTv, "field 'loadingTimeTv'", TextView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.cacheRv = Utils.findRequiredViewAsType(source, R.id.cacheRv, "field 'cacheRv'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.clearMemoryCacheBt, "method 'clearMemoryCache'");
    view2131230764 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearMemoryCache();
      }
    });
    view = Utils.findRequiredView(source, R.id.clearMemoryAndDiskCacheBt, "method 'clearMemoryAndDiskCache'");
    view2131230763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearMemoryAndDiskCache();
      }
    });
    view = Utils.findRequiredView(source, R.id.loadBt, "method 'load'");
    view2131230814 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.load();
      }
    });
  }

  @Override
  public void unbind() {
    CacheFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.loadingTimeTv = null;
    target.swipeRefreshLayout = null;
    target.cacheRv = null;

    view2131230764.setOnClickListener(null);
    view2131230764 = null;
    view2131230763.setOnClickListener(null);
    view2131230763 = null;
    view2131230814.setOnClickListener(null);
    view2131230814 = null;

    super.unbind();
  }
}
