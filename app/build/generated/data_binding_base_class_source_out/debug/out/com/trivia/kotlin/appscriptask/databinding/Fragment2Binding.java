// Generated by data binding compiler. Do not edit!
package com.trivia.kotlin.appscriptask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.trivia.kotlin.appscriptask.R;
import com.trivia.kotlin.appscriptask.modal.Question;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class Fragment2Binding extends ViewDataBinding {
  @NonNull
  public final RadioGroup answer2Rg;

  @NonNull
  public final Button next2;

  @NonNull
  public final RadioButton option1Ques2;

  @NonNull
  public final RadioButton option2Ques2;

  @NonNull
  public final RadioButton option3Ques2;

  @NonNull
  public final RadioButton option4Ques2;

  @NonNull
  public final TextView question2Text;

  @Bindable
  protected Question mQuestion;

  protected Fragment2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioGroup answer2Rg, Button next2, RadioButton option1Ques2, RadioButton option2Ques2,
      RadioButton option3Ques2, RadioButton option4Ques2, TextView question2Text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.answer2Rg = answer2Rg;
    this.next2 = next2;
    this.option1Ques2 = option1Ques2;
    this.option2Ques2 = option2Ques2;
    this.option3Ques2 = option3Ques2;
    this.option4Ques2 = option4Ques2;
    this.question2Text = question2Text;
  }

  public abstract void setQuestion(@Nullable Question question);

  @Nullable
  public Question getQuestion() {
    return mQuestion;
  }

  @NonNull
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<Fragment2Binding>inflateInternal(inflater, R.layout.fragment_2, root, attachToRoot, component);
  }

  @NonNull
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<Fragment2Binding>inflateInternal(inflater, R.layout.fragment_2, null, false, component);
  }

  public static Fragment2Binding bind(@NonNull View view) {
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
  public static Fragment2Binding bind(@NonNull View view, @Nullable Object component) {
    return (Fragment2Binding)bind(component, view, R.layout.fragment_2);
  }
}
