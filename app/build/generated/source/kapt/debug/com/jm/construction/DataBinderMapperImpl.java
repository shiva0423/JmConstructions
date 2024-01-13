package com.jm.construction;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jm.construction.databinding.ActivityAuthScreenBindingImpl;
import com.jm.construction.databinding.AddUserBindingImpl;
import com.jm.construction.databinding.DashboardScreenBindingImpl;
import com.jm.construction.databinding.FragmentCreateRoleBottomSheetBindingImpl;
import com.jm.construction.databinding.FragmentLoginBindingImpl;
import com.jm.construction.databinding.FragmentProjectManagementBindingImpl;
import com.jm.construction.databinding.FragmentShowAvailableRolesBindingImpl;
import com.jm.construction.databinding.NavHeaderBindingImpl;
import com.jm.construction.databinding.NavigationDrawerListSingleViewBindingImpl;
import com.jm.construction.databinding.ProjectManagementListSingleViewBindingImpl;
import com.jm.construction.databinding.RoleSingleViewBindingImpl;
import com.jm.construction.databinding.ToolbarLytBindingImpl;
import com.jm.construction.databinding.UserManagementScreenBindingImpl;
import com.jm.construction.databinding.UserRoleListSingleViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAUTHSCREEN = 1;

  private static final int LAYOUT_ADDUSER = 2;

  private static final int LAYOUT_DASHBOARDSCREEN = 3;

  private static final int LAYOUT_FRAGMENTCREATEROLEBOTTOMSHEET = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTPROJECTMANAGEMENT = 6;

  private static final int LAYOUT_FRAGMENTSHOWAVAILABLEROLES = 7;

  private static final int LAYOUT_NAVHEADER = 8;

  private static final int LAYOUT_NAVIGATIONDRAWERLISTSINGLEVIEW = 9;

  private static final int LAYOUT_PROJECTMANAGEMENTLISTSINGLEVIEW = 10;

  private static final int LAYOUT_ROLESINGLEVIEW = 11;

  private static final int LAYOUT_TOOLBARLYT = 12;

  private static final int LAYOUT_USERMANAGEMENTSCREEN = 13;

  private static final int LAYOUT_USERROLELISTSINGLEVIEW = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.activity_auth_screen, LAYOUT_ACTIVITYAUTHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.add_user, LAYOUT_ADDUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.dashboard_screen, LAYOUT_DASHBOARDSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.fragment_create_role_bottom_sheet, LAYOUT_FRAGMENTCREATEROLEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.fragment_project_management, LAYOUT_FRAGMENTPROJECTMANAGEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.fragment_show_available_roles, LAYOUT_FRAGMENTSHOWAVAILABLEROLES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.nav_header, LAYOUT_NAVHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.navigation_drawer_list_single_view, LAYOUT_NAVIGATIONDRAWERLISTSINGLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.project_management_list_single_view, LAYOUT_PROJECTMANAGEMENTLISTSINGLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.role_single_view, LAYOUT_ROLESINGLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.toolbar_lyt, LAYOUT_TOOLBARLYT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.user_management_screen, LAYOUT_USERMANAGEMENTSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jm.construction.R.layout.user_role_list_single_view, LAYOUT_USERROLELISTSINGLEVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAUTHSCREEN: {
          if ("layout/activity_auth_screen_0".equals(tag)) {
            return new ActivityAuthScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_auth_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ADDUSER: {
          if ("layout/add_user_0".equals(tag)) {
            return new AddUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_user is invalid. Received: " + tag);
        }
        case  LAYOUT_DASHBOARDSCREEN: {
          if ("layout/dashboard_screen_0".equals(tag)) {
            return new DashboardScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dashboard_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEROLEBOTTOMSHEET: {
          if ("layout/fragment_create_role_bottom_sheet_0".equals(tag)) {
            return new FragmentCreateRoleBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_role_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTMANAGEMENT: {
          if ("layout/fragment_project_management_0".equals(tag)) {
            return new FragmentProjectManagementBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project_management is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOWAVAILABLEROLES: {
          if ("layout/fragment_show_available_roles_0".equals(tag)) {
            return new FragmentShowAvailableRolesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_show_available_roles is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADER: {
          if ("layout/nav_header_0".equals(tag)) {
            return new NavHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVIGATIONDRAWERLISTSINGLEVIEW: {
          if ("layout/navigation_drawer_list_single_view_0".equals(tag)) {
            return new NavigationDrawerListSingleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for navigation_drawer_list_single_view is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTMANAGEMENTLISTSINGLEVIEW: {
          if ("layout/project_management_list_single_view_0".equals(tag)) {
            return new ProjectManagementListSingleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_management_list_single_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ROLESINGLEVIEW: {
          if ("layout/role_single_view_0".equals(tag)) {
            return new RoleSingleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for role_single_view is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARLYT: {
          if ("layout/toolbar_lyt_0".equals(tag)) {
            return new ToolbarLytBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_lyt is invalid. Received: " + tag);
        }
        case  LAYOUT_USERMANAGEMENTSCREEN: {
          if ("layout/user_management_screen_0".equals(tag)) {
            return new UserManagementScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_management_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_USERROLELISTSINGLEVIEW: {
          if ("layout/user_role_list_single_view_0".equals(tag)) {
            return new UserRoleListSingleViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_role_list_single_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(1, "OnItemClick");
      sKeys.put(0, "_all");
      sKeys.put(2, "adapter");
      sKeys.put(3, "baseViewModel");
      sKeys.put(4, "model");
      sKeys.put(5, "title");
      sKeys.put(6, "userData");
      sKeys.put(7, "viewModel");
      sKeys.put(8, "viewTitle");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_auth_screen_0", com.jm.construction.R.layout.activity_auth_screen);
      sKeys.put("layout/add_user_0", com.jm.construction.R.layout.add_user);
      sKeys.put("layout/dashboard_screen_0", com.jm.construction.R.layout.dashboard_screen);
      sKeys.put("layout/fragment_create_role_bottom_sheet_0", com.jm.construction.R.layout.fragment_create_role_bottom_sheet);
      sKeys.put("layout/fragment_login_0", com.jm.construction.R.layout.fragment_login);
      sKeys.put("layout/fragment_project_management_0", com.jm.construction.R.layout.fragment_project_management);
      sKeys.put("layout/fragment_show_available_roles_0", com.jm.construction.R.layout.fragment_show_available_roles);
      sKeys.put("layout/nav_header_0", com.jm.construction.R.layout.nav_header);
      sKeys.put("layout/navigation_drawer_list_single_view_0", com.jm.construction.R.layout.navigation_drawer_list_single_view);
      sKeys.put("layout/project_management_list_single_view_0", com.jm.construction.R.layout.project_management_list_single_view);
      sKeys.put("layout/role_single_view_0", com.jm.construction.R.layout.role_single_view);
      sKeys.put("layout/toolbar_lyt_0", com.jm.construction.R.layout.toolbar_lyt);
      sKeys.put("layout/user_management_screen_0", com.jm.construction.R.layout.user_management_screen);
      sKeys.put("layout/user_role_list_single_view_0", com.jm.construction.R.layout.user_role_list_single_view);
    }
  }
}
