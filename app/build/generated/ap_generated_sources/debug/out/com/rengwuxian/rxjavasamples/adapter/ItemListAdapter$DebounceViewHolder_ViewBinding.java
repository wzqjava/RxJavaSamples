// Generated code from Butter Knife. Do not modify!
package com.rengwuxian.rxjavasamples.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.rengwuxian.rxjavasamples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ItemListAdapter$DebounceViewHolder_ViewBinding implements Unbinder {
  private ItemListAdapter.DebounceViewHolder target;

  @UiThread
  public ItemListAdapter$DebounceViewHolder_ViewBinding(ItemListAdapter.DebounceViewHolder target,
      View source) {
    this.target = target;

    target.imageIv = Utils.findRequiredViewAsType(source, R.id.imageIv, "field 'imageIv'", ImageView.class);
    target.descriptionTv = Utils.findRequiredViewAsType(source, R.id.descriptionTv, "field 'descriptionTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ItemListAdapter.DebounceViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageIv = null;
    target.descriptionTv = null;
  }
}
