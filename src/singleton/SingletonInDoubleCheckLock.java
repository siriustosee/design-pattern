package src.singleton;

/**
 * DCL实现单例模式 双重检查
 */
public class SingletonInDoubleCheckLock {

    private static SingletonInDoubleCheckLock instance = null;
    private SingletonInDoubleCheckLock() {
    }
    public static SingletonInDoubleCheckLock getInstance() {
        // 两层判空，第一层是为了避免不必要的同步
        // 第二层是为了在null的情况下创建实例
        if (instance == null) {
            synchronized (SingletonInDoubleCheckLock.class) {
                if (instance == null) {
                    instance = new SingletonInDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}

