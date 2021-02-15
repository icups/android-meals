package com.meals.app.databinding;
import com.meals.app.R;
import com.meals.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.meals.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    @NonNull
    private final android.widget.FrameLayout mboundView5;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.Toolbar) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.FrameLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.airbnb.lottie.LottieAnimationView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatButton) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.meals.app.generated.callback.OnClickListener(this, 1);
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
            setVm((com.meals.app.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.meals.model.Meal Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setVm(@Nullable com.meals.app.ui.main.MainViewModel Vm) {
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
                return onChangeVmUiMode((androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiMode>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUiMode(androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiMode> VmUiMode, int fieldId) {
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
        com.meals.model.Meal item = mItem;
        int vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE = 0;
        int vmUiModeUiModeNOTFOUNDViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiMode> vmUiMode = null;
        com.meals.app.ui.main.MainViewModel vm = mVm;
        java.lang.String itemName = null;
        com.meals.app.ui.main.MainViewModel.UiMode vmUiModeGetValue = null;
        java.lang.String itemInstruction = null;
        java.lang.String itemThumbnail = null;
        int vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE = 0;
        boolean vmUiModeUiModeONPROGRESSBooleanFalseBooleanTrue = false;
        boolean vmUiModeUiModeNOTFOUND = false;

        if ((dirtyFlags & 0xaL) != 0) {



                if (item != null) {
                    // read item.name
                    itemName = item.getName();
                    // read item.instruction
                    itemInstruction = item.getInstruction();
                    // read item.thumbnail
                    itemThumbnail = item.getThumbnail();
                }
        }
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
                vmUiModeUiModeONPROGRESS = (vmUiModeGetValue) == (com.meals.app.ui.main.MainViewModel.UiMode.ON_PROGRESS);
                // read vm.uiMode.getValue() == UiMode.NOT_FOUND
                vmUiModeUiModeNOTFOUND = (vmUiModeGetValue) == (com.meals.app.ui.main.MainViewModel.UiMode.NOT_FOUND);
            if((dirtyFlags & 0xdL) != 0) {
                if(vmUiModeUiModeONPROGRESS) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xdL) != 0) {
                if(vmUiModeUiModeNOTFOUND) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
                vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE = ((vmUiModeUiModeONPROGRESS) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.uiMode.getValue() == UiMode.ON_PROGRESS ? false : true
                vmUiModeUiModeONPROGRESSBooleanFalseBooleanTrue = ((vmUiModeUiModeONPROGRESS) ? (false) : (true));
                // read vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
                vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE = ((vmUiModeUiModeNOTFOUND) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.VISIBLE : View.GONE
                vmUiModeUiModeNOTFOUNDViewVISIBLEViewGONE = ((vmUiModeUiModeNOTFOUND) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(vmUiModeUiModeNOTFOUNDViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(vmUiModeUiModeONPROGRESSViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(vmUiModeUiModeNOTFOUNDViewVISIBLEViewGONE);
            this.mboundView7.setEnabled(vmUiModeUiModeONPROGRESSBooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.meals.app.binding.ImageBinding.loadImageFromUrl(this.mboundView2, itemThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemInstruction);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.meals.app.ui.main.MainViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.clickGetRandomMeal();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.uiMode
        flag 1 (0x2L): item
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
        flag 5 (0x6L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.GONE : View.VISIBLE
        flag 6 (0x7L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.VISIBLE : View.GONE
        flag 7 (0x8L): vm.uiMode.getValue() == UiMode.NOT_FOUND ? View.VISIBLE : View.GONE
        flag 8 (0x9L): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
        flag 9 (0xaL): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? View.VISIBLE : View.GONE
        flag 10 (0xbL): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? false : true
        flag 11 (0xcL): vm.uiMode.getValue() == UiMode.ON_PROGRESS ? false : true
    flag mapping end*/
    //end
}