package in.co.books.surpriseme.Datamodel;

import java.util.ArrayList;

/**
 * Created by paln on 13/5/2017.
 */

public class Book {
	public String mId = "";
	public String mTitle = "A very long book title.";
	public String mAuthor = "";
	public String mThumbnailURL = "http://www.creativindie.com/wp-content/uploads/2013/10/Enchantment-Book-Cover-Best-Seller1.jpg";
	public ArrayList<Clue> mClues = new ArrayList<>();
	public ArrayList<PromoLinks> mPromotions = new ArrayList<>();

	public enum PROMO_TYPE {
		UNKOWN,
		AMAZON
	};

	public enum CLUE_TYPE {
		UNKNOWN,
		EXERCEPT
	};

	public static Book getDummyBook() {
		return new Book();
	}

	public static Book getDummyBook2() {
		Book book = new Book();
		book.mTitle = "Some other book name";
		book.mThumbnailURL = "https://about.canva.com/wp-content/uploads/sites/3/2015/01/business_bookcover.png";

		return book;
	}

	public static class Clue {
		public CLUE_TYPE mClueType;
		public String mContent;

		public static CLUE_TYPE fromString(final String clueType) {
			if(clueType.equals("excerpt")) {
				return CLUE_TYPE.EXERCEPT;
			} else {
				return CLUE_TYPE.UNKNOWN;
			}
		}
	}

	public static class PromoLinks {
		public PROMO_TYPE mPromoProvider;
		public String mPromoUrl;

		public static PROMO_TYPE fromString(final String promoType){
			if(promoType.equalsIgnoreCase("amazon")) {
				return PROMO_TYPE.AMAZON;
			} else {
				return PROMO_TYPE.UNKOWN;
			}
		}
	}
}
