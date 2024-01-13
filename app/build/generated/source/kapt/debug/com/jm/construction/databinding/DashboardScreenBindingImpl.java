package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashboardScreenBindingImpl extends DashboardScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"toolbar_lyt"},
            new int[] {3},
            new int[] {com.jm.construction.R.layout.toolbar_lyt});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.drawerLayout, 4);
        sViewsWithIds.put(R.id.mainContainerLayout, 5);
        sViewsWithIds.put(R.id.navigationDrawer, 6);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashboardScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DashboardScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.navigation.NavigationView) bindings[6]
            , (com.jm.construction.databinding.ToolbarLytBinding) bindings[3]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.navigationBarList.setTag(null);
        setContainedBinding(this.toolBarLyt);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.jm.construction.screens.dashboard.viewModel.DashboardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.jm.construction.screens.dashboard.viewModel.DashboardViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
                return onChangeViewModel((com.jm.construction.screens.dashboard.viewModel.DashboardViewModel) object, fieldId);
            case 1 :
                return onChangeToolBarLyt((com.jm.construction.databinding.ToolbarLytBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.jm.construction.screens.dashboard.viewModel.DashboardViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolBarLyt(com.jm.construction.databinding.ToolbarLytBinding ToolBarLyt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.jm.construction.screens.dashboard.adapter.NavigationDrawerAdapter viewModelAdapter = null;
        com.jm.construction.screens.dashboard.viewModel.DashboardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.adapter
                    viewModelAdapter = viewModel.getAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.navigationBarList.setAdapter(viewModelAdapter);
        }
        if ((dirtyFlags & 0x9L) != 0) {
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
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): toolBarLyt
        flag 2 (0x3L): viewModel.adapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}