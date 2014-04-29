package orz.yanagin.commons;

/**
 * 文字列を操作するクラス
 * @author k-yanagihara
 */
public final class Strings {

	/**
	 * コンストラクタ
	 */
	private Strings() {
	}

	/**
	 * 文字列がカラもしくはnullはチェックする
	 * @param s 文字列
	 * @return 文字列がカラもしくはnullの場合true
	 */
	public static boolean isEmptyOrNull(String s) {
		return (s == null || s.trim().isEmpty());
	}

}
