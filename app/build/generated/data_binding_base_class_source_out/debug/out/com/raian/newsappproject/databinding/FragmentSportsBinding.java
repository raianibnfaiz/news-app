// Generated by view binder compiler. Do not edit!
package com.raian.newsappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.raian.newsappproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSportsBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final RecyclerView rvRecyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  private FragmentSportsBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull RecyclerView rvRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
    this.rootView = rootView;
    this.rvRecyclerView = rvRecyclerView;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSportsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSportsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sports, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSportsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_recyclerView;
      RecyclerView rvRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (rvRecyclerView == null) {
        break missingId;
      }

      SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) rootView;

      return new FragmentSportsBinding((SwipeRefreshLayout) rootView, rvRecyclerView,
          swipeRefreshLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
