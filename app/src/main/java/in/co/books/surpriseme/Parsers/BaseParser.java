package in.co.books.surpriseme.Parsers;

import in.co.books.surpriseme.Network.HttpHandler.HttpDataListener;

/**
 * Created by paln on 16/5/2017.
 */

public abstract class BaseParser {
	public abstract Object parse(final String data);

}
