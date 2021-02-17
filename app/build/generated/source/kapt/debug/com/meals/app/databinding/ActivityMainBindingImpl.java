package com.meals.app.databinding;
import com.meals.app.R;
import com.meals.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.recyclerMeal.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.item == variableId) {
            setItem((com.meals.model.Meal) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.meals.app.ui.main.MealViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.meals.model.Meal Item) {
        this.mItem = Item;
    }
    public void setVm(@Nullable com.meals.app.ui.main.MealViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUiMode((androidx.lifecycle.LiveData<com.meals.app.ui.main.MealViewModel.UiMode>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUiMode(androidx.lifecycle.LiveData<com.meals.app.ui.main.MealViewModel.UiMode> VmUiMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        boolean vmUiModeUiModeONPROGRESS = false;
        int vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE = 0;
        androidx.lifecycle.LiveData<com.meals.app.ui.main.MealViewModel.UiMode> vmUiMode = null;
        com.meals.app.ui.main.MealViewModel vm = mVm;
        com.meals.app.ui.main.MealViewModel.UiMode vmUiModeGetValue = null;
        int vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE = 0;
        boolean vmUiModeUiModeNOTFOUND = false;

        if ((dirtyFlags & 0xdL) != 0) {



                if (vm != null) {
                    // read vm.uiMode
                    vmUiMode = vm.getUiMode();
                }
                updateLiveDataRegistration(0, vmUiMode);


                if (vmUiMode != null) {
                    // read vm.uiMode.getValue()
                    vmUiModeGetValue = vmUiMode.getValue();
                }


                // read vm.uiMode.getValue() == UiMode.ON_PROGRESS
                vmUiModeUiModeONPROGRESS = (vmUiModeGetValue) == (com.meals.app.ui.main.MealViewModel.UiMode.ON_PROGRESS);
                // read vm.uiMode.getValue() == UiMode.NOT_FOUND
                vmUiModeUiModeNOTFOUND = (vmUiModeGetValue) == (com.meals.app.ui.main.MealViewModel.UiMode.NOT_FOUND);
            if((dirtyFlags & 0xdL) != 0) {
                if(vmUiModeUiModeONPROGRESS) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xdL) != 0) {
                if(vmUiModeUiModeNOTFOUND) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
                vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE = ((vmUiModeUiModeONPROGRESS) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
                vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE = ((vmUiModeUiModeNOTFOUND) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE);
            this.recyclerMeal.setVisibility(vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.uiMode
        flag 1 (0x2L): item
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
        flag 5 (0x6L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
        flag 6 (0x7L): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
        flag 7 (0x8L): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}