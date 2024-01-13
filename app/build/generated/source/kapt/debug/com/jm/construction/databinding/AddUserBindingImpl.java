package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddUserBindingImpl extends AddUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.noteTextView, 3);
        sViewsWithIds.put(R.id.activeStatusSwitch, 4);
        sViewsWithIds.put(R.id.nameLayout, 5);
        sViewsWithIds.put(R.id.phoneLayout, 6);
        sViewsWithIds.put(R.id.spinnerLayout, 7);
        sViewsWithIds.put(R.id.rolesSpinner, 8);
        sViewsWithIds.put(R.id.addUserButton, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private AddUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Switch) bindings[4]
            , (android.widget.Button) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.Spinner) bindings[8]
            , (android.widget.RelativeLayout) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameEditTextView.setTag(null);
        this.phoneEditTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setModel((com.jm.construction.screens.userManagement.apiModels.AddUserRequestPayLoad) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.jm.construction.screens.userManagement.apiModels.AddUserRequestPayLoad Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        com.jm.construction.screens.userManagement.apiModels.AddUserRequestPayLoad model = mModel;
        java.lang.String modelPhoneNumber = null;
        java.lang.String modelFullName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.phoneNumber
                    modelPhoneNumber = model.getPhoneNumber();
                    // read model.fullName
                    modelFullName = model.getFullName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameEditTextView, modelFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phoneEditTextView, modelPhoneNumber);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}