package in.co.books.surpriseme.Parsers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import in.co.books.surpriseme.Datamodel.Book;
import in.co.books.surpriseme.Datamodel.Book.Clue;
import in.co.books.surpriseme.Datamodel.Book.PromoLinks;
import in.co.books.surpriseme.Network.HttpHandler.HttpDataListener;

import static android.R.attr.data;
import static android.R.id.input;

/**
 * Created by paln on 16/5/2017.
 */

public class BookParser extends BaseParser {
	private final String KEY_BOOK_ID = "book_id";
	private final String KEY_BOOK_TITLE = "title";
	private final String KEY_BOOK_AUTHOR = "author";
	private final String KEY_BOOK_PROMO = "promo_links";
	private final String KEY_BOOK_IMAGE_URL = "image_url";
	private final String KEY_BOOK_CLUES = "clues";

	private final String KEY_CLUE_TYPE = "type";
	private final String KEY_CLUE_CONTENT = "content";

	private final String KEY_PROMO_PROVIDER = "provider";
	private final String KEY_PROMO_URL = "url";

	public Object parse(final String data) {
		Book book = new Book();
		try {
			JSONObject root = new JSONObject(data);
			book.mId = root.getString(KEY_BOOK_ID);
			book.mTitle = root.getString(KEY_BOOK_TITLE);
			book.mAuthor = root.getString(KEY_BOOK_AUTHOR);
			book.mThumbnailURL = root.getString(KEY_BOOK_IMAGE_URL);
			book.mClues = parseClues(root.getString(KEY_BOOK_CLUES));
			book.mPromotions = parsePromos(root.getString(KEY_BOOK_PROMO));

		} catch (Exception e){
			e.printStackTrace();
		}
		return book;
	}

	private ArrayList<Clue> parseClues(final String data) {
		ArrayList<Clue> clues = new ArrayList<>();
		try {
			JSONArray cluesArray = new JSONArray(data);
			for(int i=0; i<cluesArray.length(); i++) {
				JSONObject clueJSON = cluesArray.getJSONObject(i);
				Clue clue = parseClue(clueJSON);
				clues.add(clue);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clues;
	}

	private Clue parseClue(final JSONObject data) {
		Clue clue = new Clue();
		try {
			clue.mClueType = Clue.fromString(data.getString(KEY_CLUE_TYPE));
			clue.mContent = data.getString(KEY_CLUE_CONTENT);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return clue;
	}

	private ArrayList<PromoLinks> parsePromos(final String data) {
		ArrayList<PromoLinks> promos = new ArrayList<>();
		try {
			JSONArray promoArray = new JSONArray(data);
			for(int i=0; i<promoArray.length(); i++) {
				JSONObject promoJSON = promoArray.getJSONObject(i);
				PromoLinks promoLinks = parsePromo(promoJSON);
				promos.add(promoLinks);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return promos;
	}

	private PromoLinks parsePromo(final JSONObject data) {
		PromoLinks promos = new PromoLinks();
		try {
			promos.mPromoProvider = PromoLinks.fromString(data.getString(KEY_PROMO_PROVIDER));
			promos.mPromoUrl = data.getString(KEY_PROMO_URL);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return promos;
	}
}
