package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ToolbarLytBindingImpl extends ToolbarLytBinding implements com.jm.construction.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.appbar.AppBarLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ToolbarLytBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ToolbarLytBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Spinner) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            );
        this.back.setTag(null);
        this.hamburger.setTag(null);
        this.mboundView0 = (com.google.android.material.appbar.AppBarLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.rolesSpinner.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.jm.construction.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.baseViewModel == variableId) {
            setBaseViewModel((com.jm.construction.baseClasses.BaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBaseViewModel(@Nullable com.jm.construction.baseClasses.BaseViewModel BaseViewModel) {
        updateRegistration(0, BaseViewModel);
        this.mBaseViewModel = BaseViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.baseViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBaseViewModel((com.jm.construction.baseClasses.BaseViewModel) object, fieldId);
            case 1 :
                return onChangeBaseViewModelHamburgerVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeBaseViewModelBackButtonVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeBaseViewModelViewTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeBaseViewModelRoleFilterVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBaseViewModel(com.jm.construction.baseClasses.BaseViewModel BaseViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.viewTitle) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBaseViewModelHamburgerVisibility(androidx.databinding.ObservableBoolean BaseViewModelHamburgerVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBaseViewModelBackButtonVisibility(androidx.databinding.ObservableBoolean BaseViewModelBackButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBaseViewModelViewTitle(androidx.databinding.ObservableField<java.lang.String> BaseViewModelViewTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBaseViewModelRoleFilterVisibility(androidx.databinding.ObservableBoolean BaseViewModelRoleFilterVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        int baseViewModelHamburgerVisibilityViewVISIBLEViewGONE = 0;
        boolean baseViewModelRoleFilterVisibilityGet = false;
        int baseViewModelRoleFilterVisibilityViewVISIBLEViewGONE = 0;
        com.jm.construction.baseClasses.BaseViewModel baseViewModel = mBaseViewModel;
        androidx.databinding.ObservableBoolean baseViewModelHamburgerVisibility = null;
        java.lang.String baseViewModelViewTitleGet = null;
        androidx.databinding.ObservableBoolean baseViewModelBackButtonVisibility = null;
        androidx.databinding.ObservableField<java.lang.String> baseViewModelViewTitle = null;
        boolean baseViewModelBackButtonVisibilityGet = false;
        int baseViewModelBackButtonVisibilityViewVISIBLEViewGONE = 0;
        boolean baseViewModelHamburgerVisibilityGet = false;
        androidx.databinding.ObservableBoolean baseViewModelRoleFilterVisibility = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (baseViewModel != null) {
                        // read baseViewModel.hamburgerVisibility
                        baseViewModelHamburgerVisibility = baseViewModel.getHamburgerVisibility();
                    }
                    updateRegistration(1, baseViewModelHamburgerVisibility);


                    if (baseViewModelHamburgerVisibility != null) {
                        // read baseViewModel.hamburgerVisibility.get()
                        baseViewModelHamburgerVisibilityGet = baseViewModelHamburgerVisibility.get();
                    }
                if((dirtyFlags & 0x23L) != 0) {
                    if(baseViewModelHamburgerVisibilityGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read baseViewModel.hamburgerVisibility.get() ? View.VISIBLE : View.GONE
                    baseViewModelHamburgerVisibilityViewVISIBLEViewGONE = ((baseViewModelHamburgerVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (baseViewModel != null) {
                        // read baseViewModel.backButtonVisibility
                        baseViewModelBackButtonVisibility = baseViewModel.getBackButtonVisibility();
                    }
                    updateRegistration(2, baseViewModelBackButtonVisibility);


                    if (baseViewModelBackButtonVisibility != null) {
                        // read baseViewModel.backButtonVisibility.get()
                        baseViewModelBackButtonVisibilityGet = baseViewModelBackButtonVisibility.get();
                    }
                if((dirtyFlags & 0x25L) != 0) {
                    if(baseViewModelBackButtonVisibilityGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read baseViewModel.backButtonVisibility.get() ? View.VISIBLE : View.GONE
                    baseViewModelBackButtonVisibilityViewVISIBLEViewGONE = ((baseViewModelBackButtonVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (baseViewModel != null) {
                        // read baseViewModel.viewTitle
                        baseViewModelViewTitle = baseViewModel.getViewTitle();
                    }
                    updateRegistration(3, baseViewModelViewTitle);


                    if (baseViewModelViewTitle != null) {
                        // read baseViewModel.viewTitle.get()
                        baseViewModelViewTitleGet = baseViewModelViewTitle.get();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (baseViewModel != null) {
                        // read baseViewModel.roleFilterVisibility
                        baseViewModelRoleFilterVisibility = baseViewModel.getRoleFilterVisibility();
                    }
                    updateRegistration(4, baseViewModelRoleFilterVisibility);


                    if (baseViewModelRoleFilterVisibility != null) {
                        // read baseViewModel.roleFilterVisibility.get()
                        baseViewModelRoleFilterVisibilityGet = baseViewModelRoleFilterVisibility.get();
                    }
                if((dirtyFlags & 0x31L) != 0) {
                    if(baseViewModelRoleFilterVisibilityGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read baseViewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
                    baseViewModelRoleFilterVisibilityViewVISIBLEViewGONE = ((baseViewModelRoleFilterVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.back.setVisibility(baseViewModelBackButtonVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.hamburger.setVisibility(baseViewModelHamburgerVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, baseViewModelViewTitleGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.rolesSpinner.setVisibility(baseViewModelRoleFilterVisibilityViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // baseViewModel != null
        boolean baseViewModelJavaLangObjectNull = false;
        // baseViewModel
        com.jm.construction.baseClasses.BaseViewModel baseViewModel = mBaseViewModel;



        baseViewModelJavaLangObjectNull = (baseViewModel) != (null);
        if (baseViewModelJavaLangObjectNull) {


            baseViewModel.onBackPressed();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): baseViewModel
        flag 1 (0x2L): baseViewModel.hamburgerVisibility
        flag 2 (0x3L): baseViewModel.backButtonVisibility
        flag 3 (0x4L): baseViewModel.viewTitle
        flag 4 (0x5L): baseViewModel.roleFilterVisibility
        flag 5 (0x6L): null
        flag 6 (0x7L): baseViewModel.hamburgerVisibility.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): baseViewModel.hamburgerVisibility.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): baseViewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): baseViewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): baseViewModel.backButtonVisibility.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): baseViewModel.backButtonVisibility.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}