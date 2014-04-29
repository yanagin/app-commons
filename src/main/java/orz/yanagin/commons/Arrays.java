package orz.yanagin.commons;

/**
 * 配列を操作するクラス
 * @author k-yanagihara
 */
public final class Arrays {

	/**
	 * コンストラクタ
	 */
	private Arrays() {
	}

	/**
	 * 配列を生成する
	 * @param array 配列
	 * @return 配列
	 */
	public static <E> E[] build(E... array) {
		if (array == null || array.length == 0) {
			return null;
		}
		return array;
	}

}
