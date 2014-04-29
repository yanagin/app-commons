package orz.yanagin.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * リストを操作するクラス
 * @author k-yanagihara
 */
public final class Lists {

	/**
	 * コンストラクタ
	 */
	private Lists() {
	}

	/**
	 * 配列からリストを生成する
	 * @param array 配列
	 * @return リスト
	 */
	public static <E> List<E> build(E... array) {
		if (array == null || array.length == 0) {
			return null;
		}
		List<E> result = new ArrayList<E>();
		for (E element : array) {
			result.add(element);
		}
		return result;
	}

}
