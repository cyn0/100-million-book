package in.co.books.surpriseme.Fragments;

/**
 * Created by paln on 13/5/2017.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import in.co.books.surpriseme.Card.FuckYouMaterialLargeCard;
import in.co.books.surpriseme.Card.MyBookStackCard;
import in.co.books.surpriseme.Card.MyCardThumbnail;
import in.co.books.surpriseme.Datamodel.Book;
import in.co.books.surpriseme.R;
import it.gmariotti.cardslib.library.cards.actions.BaseSupplementalAction;
import it.gmariotti.cardslib.library.cards.actions.TextSupplementalAction;
import it.gmariotti.cardslib.library.cards.material.MaterialLargeImageCard;
import it.gmariotti.cardslib.library.cards.material.MaterialLargeImageCardThumbnail;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.recyclerview.internal.CardArrayRecyclerViewAdapter;
import it.gmariotti.cardslib.library.recyclerview.view.CardRecyclerView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class HomeFragment extends BaseFragment {

	CardArrayRecyclerViewAdapter mBookStackOneCardArrayAdapter;
	protected boolean mBookStackOneListShown;
	protected View mBookStackOneProgressContainer;
	protected View mBookStackOneListContainer;

	CardArrayRecyclerViewAdapter mBookStackTwoCardArrayAdapter;
	protected boolean mBookStackTwoListShown;
	protected View mBookStackTwoProgressContainer;
	protected View mBookStackTwoListContainer;

	protected final String TAG = "HomeFragment";

	public static HomeFragment newInstance() {
		HomeFragment fragment = new HomeFragment();

		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fragmentTitle = "SurpriseMe";
	}

	@Override
	public void onStart() {
		super.onStart();

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home, container, false);

		setupStackOne(view);
		setupStackTwo(view);
		displayList();


		return view;
	}

	private void setupStackOne(final View view){
		//stack 1
		CardRecyclerView bookStackOneRecyclerView = (CardRecyclerView) view.findViewById(R.id.book_stack_one_recyclerview);
		mBookStackOneListContainer = view.findViewById(R.id.book_stack_one_list_container);
		mBookStackOneProgressContainer = view.findViewById(R.id.carddemo_progressContainer);


		ArrayList<Card> stackOneCards = new ArrayList<Card>();
		mBookStackOneCardArrayAdapter = new CardArrayRecyclerViewAdapter(mContext, stackOneCards);
		bookStackOneRecyclerView.setHasFixedSize(false);
		bookStackOneRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));

		if (bookStackOneRecyclerView != null) {
			bookStackOneRecyclerView.setAdapter(mBookStackOneCardArrayAdapter);
		}

		ArrayList<Card> cards = initStackOneCards();
		mBookStackOneCardArrayAdapter.addAll(cards);
	}

	private void setupStackTwo(final View view) {
		//stack 2
		CardRecyclerView bookStackTwoRecyclerView = (CardRecyclerView) view.findViewById(R.id.book_stack_two_recyclerview);
		mBookStackTwoListContainer = view.findViewById(R.id.book_stack_two_list_container);
		mBookStackOneProgressContainer = view.findViewById(R.id.carddemo_progressContainer);


		ArrayList<Card> stackTwoCards = new ArrayList<Card>();
		mBookStackTwoCardArrayAdapter = new CardArrayRecyclerViewAdapter(mContext, stackTwoCards);
		bookStackTwoRecyclerView.setHasFixedSize(false);
		bookStackTwoRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));

		if (bookStackTwoRecyclerView != null) {
			bookStackTwoRecyclerView.setAdapter(mBookStackTwoCardArrayAdapter);
		}

		ArrayList<Card> cards2 = initStackTwoCards();
		mBookStackTwoCardArrayAdapter.addAll(cards2);
	}

	private ArrayList<Card> initStackOneCards() {
		//Init an array of Cards
		ArrayList<Card> cards = new ArrayList<Card>();

		for (int i = 0; i < 200; i++) {
			Book book = Book.getDummyBook();

			FuckYouMaterialLargeCard card =
					FuckYouMaterialLargeCard.with(mContext)
							.build()
							.setBook(book);;

			cards.add(card);
		}

		return cards;
	}

	private ArrayList<Card> initStackTwoCards() {
		//Init an array of Cards
		ArrayList<Card> cards = new ArrayList<Card>();

		for (int i = 0; i < 200; i++) {
			Book book = Book.getDummyBook2();

			FuckYouMaterialLargeCard card =
					FuckYouMaterialLargeCard.with(mContext)
							.build()
							.setBook(book);;

			cards.add(card);
		}

		return cards;
	}

	private void updateAdapter(ArrayList<Card> cards) {
		if (cards != null) {
			mBookStackOneCardArrayAdapter.addAll(cards);
		}
	}

	protected void displayList(){
//		if (isResumed()) {
		setListShown(true, true);
//		} else {
//			setListShownNoAnimation(true);
//		}
	}

	protected void setListShown(boolean shown, boolean animate) {
//		mBookStackTwoProgressContainer.setVisibility(View.GONE);

		mBookStackTwoListContainer.setVisibility(View.VISIBLE);
		if (mBookStackOneListShown == shown) {
			return;
		}
		mBookStackOneListShown = shown;
		if (shown) {
			if (animate) {
				mBookStackOneProgressContainer.startAnimation(AnimationUtils.loadAnimation(
						mContext, android.R.anim.fade_out));
				mBookStackOneListContainer.startAnimation(AnimationUtils.loadAnimation(
						mContext, android.R.anim.fade_in));
			}
			mBookStackOneProgressContainer.setVisibility(View.GONE);
			mBookStackOneListContainer.setVisibility(View.VISIBLE);
		} else {
			if (animate) {
				mBookStackOneProgressContainer.startAnimation(AnimationUtils.loadAnimation(
						mContext, android.R.anim.fade_in));
				mBookStackOneListContainer.startAnimation(AnimationUtils.loadAnimation(
						mContext, android.R.anim.fade_out));
			}
			mBookStackOneProgressContainer.setVisibility(View.VISIBLE);
			mBookStackOneListContainer.setVisibility(View.INVISIBLE);
		}
	}

}
