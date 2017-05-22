package in.co.books.surpriseme.Card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import in.co.books.surpriseme.R;
import it.gmariotti.cardslib.library.cards.material.MaterialLargeImageCardThumbnail;

/**
 * Created by paln on 13/5/2017.
 */

public class MyCardThumbnail extends MaterialLargeImageCardThumbnail {
	final String mUrl;
	public MyCardThumbnail(final String url, Context context) {
		super(context);
		setExternalUsage(true);
		mUrl = url;
	}
	@Override
	public void setupInnerViewElements(ViewGroup parent, View imageView) {
		super.setupInnerViewElements(parent, imageView);
		Picasso.with(mContext)
				.load(mUrl)
				.placeholder(R.drawable.book_placeholder)
				.resize(125, 180)
				.error(R.drawable.book_placeholder)
				.into((ImageView) imageView);
	}
}