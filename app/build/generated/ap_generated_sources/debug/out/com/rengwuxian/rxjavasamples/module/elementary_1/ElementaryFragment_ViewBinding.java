// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.module.elementary_1;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.BaseFragment_ViewBinding;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ElementaryFragment_ViewBinding extends BaseFragment_ViewBinding {
  private ElementaryFragment target;

  private View view2131230852;

  private View view2131230853;

  private View view2131230854;

  private View view2131230855;

  @UiThread
  public ElementaryFragment_ViewBinding(final ElementaryFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.gridRv = Utils.findRequiredViewAsType(source, R.id.gridRv, "field 'gridRv'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.searchRb1, "method 'onTagChecked'");
    view2131230852 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onTagChecked(Utils.castParam(p0, "onCheckedChanged", 0, "onTagChecked", 0, RadioButton.class), p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.searchRb2, "method 'onTagChecked'");
    view2131230853 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onTagChecked(Utils.castParam(p0, "onCheckedChanged", 0, "onTagChecked", 0, RadioButton.class), p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.searchRb3, "method 'onTagChecked'");
    view2131230854 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onTagChecked(Utils.castParam(p0, "onCheckedChanged", 0, "onTagChecked", 0, RadioButton.class), p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.searchRb4, "method 'onTagChecked'");
    view2131230855 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onTagChecked(Utils.castParam(p0, "onCheckedChanged", 0, "onTagChecked", 0, RadioButton.class), p1);
      }
    });
  }

  @Override
  public void unbind() {
    ElementaryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.gridRv = null;

    ((CompoundButton) view2131230852).setOnCheckedChangeListener(null);
    view2131230852 = null;
    ((CompoundButton) view2131230853).setOnCheckedChangeListener(null);
    view2131230853 = null;
    ((CompoundButton) view2131230854).setOnCheckedChangeListener(null);
    view2131230854 = null;
    ((CompoundButton) view2131230855).setOnCheckedChangeListener(null);
    view2131230855 = null;

    super.unbind();
  }
}
