// Generated by data binding compiler. Do not edit!
package com.meals.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.meals.app.R;
import com.meals.app.ui.main.MealViewModel;
import com.meals.model.Meal;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMealBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imageMeal;

  @NonNull
  public final AppCompatTextView textInstruction;

  @NonNull
  public final AppCompatTextView textName;

  @Bindable
  protected MealViewModel mVm;

  @Bindable
  protected Meal mItem;

  protected ItemMealBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imageMeal, AppCompatTextView textInstruction, AppCompatTextView textName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageMeal = imageMeal;
    this.textInstruction = textInstruction;
    this.textName = textName;
  }

  public abstract void setVm(@Nullable MealViewModel vm);

  @Nullable
  public MealViewModel getVm() {
    return mVm;
  }

  public abstract void setItem(@Nullable Meal item);

  @Nullable
  public Meal getItem() {
    return mItem;
  }

  @NonNull
  public static ItemMealBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_meal, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMealBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMealBinding>inflateInternal(inflater, R.layout.item_meal, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMealBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_meal, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMealBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMealBinding>inflateInternal(inflater, R.layout.item_meal, null, false, component);
  }

  public static ItemMealBinding bind(@NonNull View view) {
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
  public static ItemMealBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMealBinding)bind(component, view, R.layout.item_meal);
  }
}
