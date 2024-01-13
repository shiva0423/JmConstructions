package com.jm.construction.databinding;
import com.jm.construction.R;
import com.jm.construction.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserRoleListSingleViewBindingImpl extends UserRoleListSingleViewBinding implements com.jm.construction.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.deleteUserSpinner, 6);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserRoleListSingleViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private UserRoleListSingleViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Spinner) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.extraDot.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mobileNumberTextView.setTag(null);
        this.roleTextView.setTag(null);
        this.userNameTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.jm.construction.generated.callback.OnClickListener(this, 1);
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
            setModel((com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad) variable);
        }
        else if (BR.OnItemClick == variableId) {
            setOnItemClick((kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad,kotlin.Unit>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setOnItemClick(@Nullable kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad,kotlin.Unit> OnItemClick) {
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
        com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad model = mModel;
        int modelRoleIdRoleEqualsJavaLangStringSuperAdminViewGONEViewVISIBLE = 0;
        com.jm.construction.screens.userManagement.apiModels.RoleId modelRoleId = null;
        kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad,kotlin.Unit> onItemClick = mOnItemClick;
        java.lang.String modelFullName = null;
        java.lang.String modelStatus = null;
        boolean modelStatusEqualsStringValueOfJavaLangStringACTIVE = false;
        java.lang.String modelPhoneNumber = null;
        boolean modelRoleIdRoleEqualsJavaLangStringSuperAdmin = false;
        android.graphics.drawable.Drawable modelStatusEqualsStringValueOfJavaLangStringACTIVEImageViewAndroidDrawableIcUserImageViewAndroidDrawableIcInUser = null;
        java.lang.String modelRoleIdRole = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.roleId
                    modelRoleId = model.getRoleId();
                    // read model.fullName
                    modelFullName = model.getFullName();
                    // read model.status
                    modelStatus = model.getStatus();
                    // read model.phoneNumber
                    modelPhoneNumber = model.getPhoneNumber();
                }


                if (modelRoleId != null) {
                    // read model.roleId.role
                    modelRoleIdRole = modelRoleId.getRole();
                }
                if (modelStatus != null) {
                    // read model.status.equals(String.valueOf("ACTIVE"))
                    modelStatusEqualsStringValueOfJavaLangStringACTIVE = modelStatus.equals(java.lang.String.valueOf("ACTIVE"));
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelStatusEqualsStringValueOfJavaLangStringACTIVE) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                if (modelRoleIdRole != null) {
                    // read model.roleId.role.equals("Super Admin")
                    modelRoleIdRoleEqualsJavaLangStringSuperAdmin = modelRoleIdRole.equals("Super Admin");
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelRoleIdRoleEqualsJavaLangStringSuperAdmin) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                // read model.status.equals(String.valueOf("ACTIVE")) ? @android:drawable/ic_user : @android:drawable/ic_in_user
                modelStatusEqualsStringValueOfJavaLangStringACTIVEImageViewAndroidDrawableIcUserImageViewAndroidDrawableIcInUser = ((modelStatusEqualsStringValueOfJavaLangStringACTIVE) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageView.getContext(), R.drawable.ic_user)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageView.getContext(), R.drawable.ic_in_user)));


                // read model.roleId.role.equals("Super Admin") ? View.GONE : View.VISIBLE
                modelRoleIdRoleEqualsJavaLangStringSuperAdminViewGONEViewVISIBLE = ((modelRoleIdRoleEqualsJavaLangStringSuperAdmin) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.extraDot.setVisibility(modelRoleIdRoleEqualsJavaLangStringSuperAdminViewGONEViewVISIBLE);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageView, modelStatusEqualsStringValueOfJavaLangStringACTIVEImageViewAndroidDrawableIcUserImageViewAndroidDrawableIcInUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mobileNumberTextView, modelPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.roleTextView, modelRoleIdRole);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userNameTextView, modelFullName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad model = mModel;
        // OnItemClick.invoke(model)
        kotlin.Unit onItemClickInvokeModel = null;
        // OnItemClick != null
        boolean onItemClickJavaLangObjectNull = false;
        // OnItemClick
        kotlin.jvm.functions.Function1<com.jm.construction.screens.userManagement.apiModels.GetUserListResponsePayLoad,kotlin.Unit> onItemClick = mOnItemClick;



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
        flag 3 (0x4L): model.roleId.role.equals("Super Admin") ? View.GONE : View.VISIBLE
        flag 4 (0x5L): model.roleId.role.equals("Super Admin") ? View.GONE : View.VISIBLE
        flag 5 (0x6L): model.status.equals(String.valueOf("ACTIVE")) ? @android:drawable/ic_user : @android:drawable/ic_in_user
        flag 6 (0x7L): model.status.equals(String.valueOf("ACTIVE")) ? @android:drawable/ic_user : @android:drawable/ic_in_user
    flag mapping end*/
    //end
}