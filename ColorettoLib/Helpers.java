package Coloretto;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//import CardManagement.Coloretto.CardCollection;

/**
 */
public final class Helpers {
	/**
	 */
	private Helpers() {
	}

	/**
	 */
	public static <T> List<T> CloneAndAppend(List<T> source, T addition) {
		if (source == null) {
			List<T> list = new ArrayList<T>(1);
			
			list.add(addition);

			return Collections.unmodifiableList(list);
		} else {
			List<T> list = new ArrayList<T>(source.size() + 1);
			
			list.addAll(source);
			list.add(addition);

			return Collections.unmodifiableList(list);
		}
	}

	/**
	 */
	public static boolean AllPilesPickedUp(List<CardCollection> piles) {
		for (CardCollection collection : piles) {
			if (collection != null) {
				return false;
			}
		}

		return true;
	}
}
