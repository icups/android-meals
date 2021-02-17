package com.meals.app.databinding;
import com.meals.app.R;
import com.meals.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMealBindingImpl extends ItemMealBinding implements com.meals.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMealBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemMealBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.imageMeal.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textInstruction.setTag(null);
        this.textName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.meals.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.meals.app.ui.main.MealViewModel) variable);
        }
        else if (BR.item == variableId) {
            setItem((com.meals.model.Meal) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.meals.app.ui.main.MealViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setItem(@Nullable com.meals.model.Meal Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.meals.app.ui.main.MealViewModel vm = mVm;
        java.lang.String itemName = null;
        com.meals.model.Meal item = mItem;
        java.lang.String itemInstruction = null;
        java.lang.String itemThumbnail = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (item != null) {
                    // read item.name
                    itemName = item.getName();
                    // read item.instruction
                    itemInstruction = item.getInstruction();
                    // read item.thumbnail
                    itemThumbnail = item.getThumbnail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.meals.app.binding.ImageBinding.loadImageFromUrl(this.imageMeal, itemThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textInstruction, itemInstruction);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textName, itemName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.meals.app.ui.main.MealViewModel vm = mVm;
        // item.id
        long itemId = 0;
        // item
        com.meals.model.Meal item = mItem;
        // item != null
        boolean itemJavaLangObjectNull = false;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {


                itemId = item.getId();

                vm.clickDetailMeal(itemId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): item
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}