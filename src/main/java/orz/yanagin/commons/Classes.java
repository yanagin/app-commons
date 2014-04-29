package orz.yanagin.commons;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * クラスを操作するクラス
 * @author k-yanagihara
 */
public final class Classes {

	/**
	 * コンストラクタ
	 */
	private Classes() {
	}

	/**
	 * オブジェクトをキャストする
	 * @param target キャストするオブジェクト
	 * @param type キャストする型
	 * @return キャストされたオブジェクト
	 */
	@SuppressWarnings("unchecked")
	public static <T> T cast(Object target, T... type) {
		return (T)target;
	}

	/**
	 * パッケージ名とクラス名を指定して、インスタンスを生成する
	 * @param packageName パッケージ名
	 * @param className クラス名
	 * @return クラスのインスタンス
	 */
	@SuppressWarnings("unchecked")
	public static <T> T create(String packageName, String className) {
		try {
			Class<?> clazz = Class.forName(packageName + "." + className);
			return (T)clazz.newInstance();
		} catch (ClassNotFoundException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (InstantiationException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (IllegalAccessException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		}
	}

	/**
	 * @param type クラスの型
	 * @return クラスの名称
	 */
	public static <T> String fullName(Class<T> type) {
		return type.getName();
	}

	/**
	 * 引数の有るメソッドを実行する
	 * @param target 操作対象のオブジェクト
	 * @param name メソッドの名前
	 * @param returnType 戻り値の型
	 * @param parameterTypes 引数の型
	 * @param parameters 引数のオブジェクト
	 * @return 戻り値
	 */
	@SuppressWarnings("unchecked")
	public static <T> T method(Object target, String name, T returnType,
			Class<?>[] parameterTypes, Object[] parameters) {
		try {
			Class<?> clazz = Class.forName(target.getClass().getName());
			Method method = clazz.getDeclaredMethod(name, parameterTypes);
			method.setAccessible(true);
			return (T)method.invoke(target, parameters);
		} catch (SecurityException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (IllegalArgumentException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (ClassNotFoundException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (NoSuchMethodException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (IllegalAccessException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (InvocationTargetException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		}
	}

	/**
	 * 引数の無いメソッドを実行する
	 * @param target 操作対象のオブジェクト
	 * @param name メソッドの名前
	 * @param returnType 戻り値の型
	 * @return 戻り値
	 */
	public static <T> T method(Object target, String name, T returnType) {
		return method(target, name, returnType, null, null);
	}

	/**
	 * フィールドの値を返却する
	 * @param target 操作対象のオブジェクト
	 * @param name フィールドの名前
	 * @param returnType フィールドの型
	 * @return フィールドの値
	 */
	@SuppressWarnings("unchecked")
	public static <T> T field(Object target, String name, T returnType) {
		try {
			Class<?> clazz = Class.forName(target.getClass().getName());
			Field field = clazz.getDeclaredField(name);
			field.setAccessible(true);
			return (T)field.get(target);
		} catch (SecurityException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (IllegalArgumentException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (ClassNotFoundException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (NoSuchFieldException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		} catch (IllegalAccessException e) {
			throw new UnnecessaryCatchExceptionWrapper(e);
		}
	}

}
