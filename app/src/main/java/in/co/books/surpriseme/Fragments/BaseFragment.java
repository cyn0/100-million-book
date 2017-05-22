package in.co.books.surpriseme.Fragments;

//import android.app.Fragment;
//import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import in.co.books.surpriseme.R;

/**
 * Created by paln on 13/5/2017.
 */

public class BaseFragment extends Fragment {
	protected String fragmentTitle = "eRailway";
	protected Context mContext;

	protected FragmentManager mFragmentManager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mContext = getActivity();
		mFragmentManager = getFragmentManager();

	}

	@Override
	public void onStart() {
		super.onStart();
		Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
//		toolbar.setVisibility(View.VISIBLE);
		ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
		if(actionBar != null) {
			actionBar.setTitle(fragmentTitle);
		}
	}
}
