// Generated by view binder compiler. Do not edit!
package com.aregyan.github.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aregyan.github.R;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentResultLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cVResult;

  @NonNull
  public final PieChart chHallTgold;

  @NonNull
  public final ImageView iVWinner;

  @NonNull
  public final LinearLayout rLUserName;

  @NonNull
  public final RelativeLayout rlPieChart;

  @NonNull
  public final Button submitButtonT;

  @NonNull
  public final TextView tvUserMarks;

  @NonNull
  public final TextView tvUserName;

  @NonNull
  public final TextView welcomeText;

  private FragmentResultLayoutBinding(@NonNull RelativeLayout rootView, @NonNull CardView cVResult,
      @NonNull PieChart chHallTgold, @NonNull ImageView iVWinner, @NonNull LinearLayout rLUserName,
      @NonNull RelativeLayout rlPieChart, @NonNull Button submitButtonT,
      @NonNull TextView tvUserMarks, @NonNull TextView tvUserName, @NonNull TextView welcomeText) {
    this.rootView = rootView;
    this.cVResult = cVResult;
    this.chHallTgold = chHallTgold;
    this.iVWinner = iVWinner;
    this.rLUserName = rLUserName;
    this.rlPieChart = rlPieChart;
    this.submitButtonT = submitButtonT;
    this.tvUserMarks = tvUserMarks;
    this.tvUserName = tvUserName;
    this.welcomeText = welcomeText;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentResultLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResultLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_result_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResultLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cVResult;
      CardView cVResult = ViewBindings.findChildViewById(rootView, id);
      if (cVResult == null) {
        break missingId;
      }

      id = R.id.ch_hall_tgold;
      PieChart chHallTgold = ViewBindings.findChildViewById(rootView, id);
      if (chHallTgold == null) {
        break missingId;
      }

      id = R.id.iVWinner;
      ImageView iVWinner = ViewBindings.findChildViewById(rootView, id);
      if (iVWinner == null) {
        break missingId;
      }

      id = R.id.rLUserName;
      LinearLayout rLUserName = ViewBindings.findChildViewById(rootView, id);
      if (rLUserName == null) {
        break missingId;
      }

      id = R.id.rlPieChart;
      RelativeLayout rlPieChart = ViewBindings.findChildViewById(rootView, id);
      if (rlPieChart == null) {
        break missingId;
      }

      id = R.id.submit_buttonT;
      Button submitButtonT = ViewBindings.findChildViewById(rootView, id);
      if (submitButtonT == null) {
        break missingId;
      }

      id = R.id.tvUserMarks;
      TextView tvUserMarks = ViewBindings.findChildViewById(rootView, id);
      if (tvUserMarks == null) {
        break missingId;
      }

      id = R.id.tvUserName;
      TextView tvUserName = ViewBindings.findChildViewById(rootView, id);
      if (tvUserName == null) {
        break missingId;
      }

      id = R.id.welcome_text;
      TextView welcomeText = ViewBindings.findChildViewById(rootView, id);
      if (welcomeText == null) {
        break missingId;
      }

      return new FragmentResultLayoutBinding((RelativeLayout) rootView, cVResult, chHallTgold,
          iVWinner, rLUserName, rlPieChart, submitButtonT, tvUserMarks, tvUserName, welcomeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
