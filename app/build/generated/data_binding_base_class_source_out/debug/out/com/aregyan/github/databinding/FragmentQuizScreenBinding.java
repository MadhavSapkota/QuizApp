// Generated by view binder compiler. Do not edit!
package com.aregyan.github.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aregyan.github.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQuizScreenBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RelativeLayout rLTimer;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final TextView tvTimer;

  private FragmentQuizScreenBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivImage,
      @NonNull ProgressBar progressBar, @NonNull RelativeLayout rLTimer,
      @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout,
      @NonNull TextView tvTimer) {
    this.rootView = rootView;
    this.ivImage = ivImage;
    this.progressBar = progressBar;
    this.rLTimer = rLTimer;
    this.recyclerView = recyclerView;
    this.relativeLayout = relativeLayout;
    this.tvTimer = tvTimer;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuizScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuizScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quiz_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuizScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivImage;
      ImageView ivImage = ViewBindings.findChildViewById(rootView, id);
      if (ivImage == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rLTimer;
      RelativeLayout rLTimer = ViewBindings.findChildViewById(rootView, id);
      if (rLTimer == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      RelativeLayout relativeLayout = (RelativeLayout) rootView;

      id = R.id.tvTimer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      return new FragmentQuizScreenBinding((RelativeLayout) rootView, ivImage, progressBar, rLTimer,
          recyclerView, relativeLayout, tvTimer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}