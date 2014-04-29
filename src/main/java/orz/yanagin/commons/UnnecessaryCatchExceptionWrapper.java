package orz.yanagin.commons;

/**
 * Exceptionをキャッチ不要にするラッパー
 * 通常は発生しない例外の処理を簡略化するために利用
 * @author k-yanagihara
 */
public class UnnecessaryCatchExceptionWrapper extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @param throwable Throwable
	 */
	public UnnecessaryCatchExceptionWrapper(Throwable throwable) {
		super(throwable);
	}

}
