package in.co.books.surpriseme.Card;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import in.co.books.surpriseme.Datamodel.Book;
import in.co.books.surpriseme.R;
import it.gmariotti.cardslib.library.cards.actions.BaseSupplementalAction;
import it.gmariotti.cardslib.library.cards.actions.TextSupplementalAction;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;

/**
 * Created by paln on 13/5/2017.
 */

public class MyBookStackCard extends in.co.books.surpriseme.Card.FuckYouMaterialLargeCard {
	public MyBookStackCard(Context context) {
		super(context);
	}

	Book mBook;

	public static in.co.books.surpriseme.Card.FuckYouMaterialLargeCard create(final Context context, final Book book) {

		ArrayList<BaseSupplementalAction> actions = new ArrayList<BaseSupplementalAction>();

		TextSupplementalAction t1 = new TextSupplementalAction(context, R.id.ic1);
		t1.setOnActionClickListener(new BaseSupplementalAction.OnActionClickListener() {
			@Override
			public void onClick(Card card, View view) {
				Toast.makeText(context," Click on SHARE "+card.getCardHeader().getTitle(),Toast.LENGTH_SHORT).show();
			}
		});
		actions.add(t1);

		TextSupplementalAction t2 = new TextSupplementalAction(context, R.id.ic2);
		t2.setOnActionClickListener(new BaseSupplementalAction.OnActionClickListener() {
			@Override
			public void onClick(Card card, View view) {
				Toast.makeText(context," Click on Text LEARN "+card.getTitle(),Toast.LENGTH_SHORT).show();
			}
		});
		actions.add(t2);

		in.co.books.surpriseme.Card.FuckYouMaterialLargeCard card =  MyBookStackCard.with(context)
						.setupSupplementalActions(R.layout.card_supplemental_actions, actions)
						.build()
						;



//		card.mBook = book;
//		card.setupCard();
		return card;
	}



	private void setupCard() {
		addCardThumbnail(new in.co.books.surpriseme.Card.MyCardThumbnail(mBook.mThumbnailURL,mContext));

		CardHeader header = new CardHeader(mContext);
		header.setTitle(mBook.mTitle);
		addCardHeader(header);

		setOnClickListener(new Card.OnCardClickListener() {
			@Override
			public void onClick(Card card, View view) {
				Toast.makeText(mContext," Click on ActionArea ",Toast.LENGTH_SHORT).show();
			}
		});
	}
	
}
