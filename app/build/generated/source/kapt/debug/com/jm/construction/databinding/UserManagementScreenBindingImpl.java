package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserManagementScreenBindingImpl extends UserManagementScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_lyt"},
            new int[] {4},
            new int[] {com.jm.construction.R.layout.toolbar_lyt});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserManagementScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private UserManagementScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3]
            , (com.jm.construction.databinding.ToolbarLytBinding) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.addUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.toolBarLyt);
        this.userListRecyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        toolBarLyt.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolBarLyt.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.jm.construction.screens.userManagement.viewModel.UserManagementViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.jm.construction.screens.userManagement.viewModel.UserManagementViewModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolBarLyt.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolBarLyt((com.jm.construction.databinding.ToolbarLytBinding) object, fieldId);
            case 1 :
                return onChangeViewModel((com.jm.construction.screens.userManagement.viewModel.UserManagementViewModel) object, fieldId);
            case 2 :
                return onChangeViewModelAreUserAvailable((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelRoleFilterVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolBarLyt(com.jm.construction.databinding.ToolbarLytBinding ToolBarLyt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(com.jm.construction.screens.userManagement.viewModel.UserManagementViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAreUserAvailable(androidx.databinding.ObservableBoolean ViewModelAreUserAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRoleFilterVisibility(androidx.databinding.ObservableBoolean ViewModelRoleFilterVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean viewModelAreUserAvailableBooleanTrue = false;
        int viewModelAreUserAvailableBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelAreUserAvailableBooleanFalse = false;
        int viewModelAreUserAvailableBooleanTrueViewVISIBLEViewGONE = 0;
        int viewModelRoleFilterVisibilityViewVISIBLEViewGONE = 0;
        boolean viewModelAreUserAvailableGet = false;
        boolean viewModelRoleFilterVisibilityGet = false;
        com.jm.construction.screens.userManagement.viewModel.UserManagementViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelAreUserAvailable = null;
        androidx.databinding.ObservableBoolean viewModelRoleFilterVisibility = null;

        if ((dirtyFlags & 0x1eL) != 0) {


            if ((dirtyFlags & 0x16L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.areUserAvailable
                        viewModelAreUserAvailable = viewModel.getAreUserAvailable();
                    }
                    updateRegistration(2, viewModelAreUserAvailable);


                    if (viewModelAreUserAvailable != null) {
                        // read viewModel.areUserAvailable.get()
                        viewModelAreUserAvailableGet = viewModelAreUserAvailable.get();
                    }


                    // read viewModel.areUserAvailable.get() == true
                    viewModelAreUserAvailableBooleanTrue = (viewModelAreUserAvailableGet) == (true);
                    // read viewModel.areUserAvailable.get() == false
                    viewModelAreUserAvailableBooleanFalse = (viewModelAreUserAvailableGet) == (false);
                if((dirtyFlags & 0x16L) != 0) {
                    if(viewModelAreUserAvailableBooleanTrue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x16L) != 0) {
                    if(viewModelAreUserAvailableBooleanFalse) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.areUserAvailable.get() == true ? View.VISIBLE : View.GONE
                    viewModelAreUserAvailableBooleanTrueViewVISIBLEViewGONE = ((viewModelAreUserAvailableBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.areUserAvailable.get() == false ? View.VISIBLE : View.GONE
                    viewModelAreUserAvailableBooleanFalseViewVISIBLEViewGONE = ((viewModelAreUserAvailableBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.roleFilterVisibility
                        viewModelRoleFilterVisibility = viewModel.getRoleFilterVisibility();
                    }
                    updateRegistration(3, viewModelRoleFilterVisibility);


                    if (viewModelRoleFilterVisibility != null) {
                        // read viewModel.roleFilterVisibility.get()
                        viewModelRoleFilterVisibilityGet = viewModelRoleFilterVisibility.get();
                    }
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelRoleFilterVisibilityGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
                    viewModelRoleFilterVisibilityViewVISIBLEViewGONE = ((viewModelRoleFilterVisibilityGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.addUser.setVisibility(viewModelRoleFilterVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelAreUserAvailableBooleanFalseViewVISIBLEViewGONE);
            this.userListRecyclerView.setVisibility(viewModelAreUserAvailableBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.toolBarLyt.setBaseViewModel(viewModel);
        }
        executeBindingsOn(toolBarLyt);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolBarLyt
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): viewModel.areUserAvailable
        flag 3 (0x4L): viewModel.roleFilterVisibility
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.areUserAvailable.get() == false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.areUserAvailable.get() == false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.areUserAvailable.get() == true ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.areUserAvailable.get() == true ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.roleFilterVisibility.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}