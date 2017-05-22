package in.co.books.surpriseme.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.co.books.surpriseme.R;

import static android.R.attr.textColor;

/**
 * Created by paln on 18/5/2017.
 */

public class ClueFragment extends BaseFragment {

	String mClueTitle;
	String mClueDescription;
	int mTextColor;

	public static ClueFragment newInstance(final String title, final String description, final int textColor){
		ClueFragment clueFragment = new ClueFragment();

		Bundle args = new Bundle();
		args.putString("title", title);
		args.putString("description", description);
		args.putInt("textColor", textColor);
		clueFragment.setArguments(args);

		return  clueFragment;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fragmentTitle = "";
		mClueTitle = getArguments().getString("title");
		mClueDescription = getArguments().getString("description");
		mTextColor = getArguments().getInt("textColor");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_clue, container, false);

		TextView titleTextView = (TextView) view.findViewById(R.id.title);
		TextView descriptionTextView = (TextView) view.findViewById(R.id.description);

		titleTextView.setText(mClueTitle);
		descriptionTextView.setText(mClueDescription);
		descriptionTextView.setTextColor(mTextColor);
		return view;
	}
}
