package orz.yanagin.commons;

/**
 * タイマークラス
 * @author k-yanagihara
 */
public class Timer {

	/**
	 * 指定時間待つ
	 * @param millis 待ち時間（ミリ秒）
	 */
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

}
