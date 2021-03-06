// Generated by data binding compiler. Do not edit!
package com.trivia.kotlin.appscriptask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.trivia.kotlin.appscriptask.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class Fragment1Binding extends ViewDataBinding {
  @NonNull
  public final EditText answer1Et;

  @NonNull
  public final Button next1;

  @NonNull
  public final TextView question1Text;

  protected Fragment1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText answer1Et, Button next1, TextView question1Text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.answer1Et = answer1Et;
    this.next1 = next1;
    this.question1Text = question1Text;
  }

  @NonNull
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<Fragment1Binding>inflateInternal(inflater, R.layout.fragment_1, root, attachToRoot, component);
  }

  @NonNull
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static Fragment1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<Fragment1Binding>inflateInternal(inflater, R.layout.fragment_1, null, false, component);
  }

  public static Fragment1Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static Fragment1Binding bind(@NonNull View view, @Nullable Object component) {
    return (Fragment1Binding)bind(component, view, R.layout.fragment_1);
  }
}
