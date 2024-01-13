package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RoleSingleViewBindingImpl extends RoleSingleViewBinding implements com.jm.construction.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.deleteRoleImageView, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RoleSingleViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RoleSingleViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.jm.construction.generated.callback.OnClickListener(this, 1);
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
        if (BR.model == variableId) {
            setModel((com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad) variable);
        }
        else if (BR.OnItemClick == variableId) {
            setOnItemClick((kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad,kotlin.Unit>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setOnItemClick(@Nullable kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad,kotlin.Unit> OnItemClick) {
        this.mOnItemClick = OnItemClick;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.OnItemClick);
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
        com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad model = mModel;
        java.lang.String modelRole = null;
        kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad,kotlin.Unit> onItemClick = mOnItemClick;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.role
                    modelRole = model.getRole();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, modelRole);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad model = mModel;
        // OnItemClick.invoke(model)
        kotlin.Unit onItemClickInvokeModel = null;
        // OnItemClick != null
        boolean onItemClickJavaLangObjectNull = false;
        // OnItemClick
        kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetRolesResponsePayLoad,kotlin.Unit> onItemClick = mOnItemClick;



        onItemClickJavaLangObjectNull = (onItemClick) != (null);
        if (onItemClickJavaLangObjectNull) {



            onItemClickInvokeModel = onItemClick.invoke(model);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): OnItemClick
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}