package src.singleton;

/**
 * 静态内部类
 */
public class SingletonInStaticInnerClass {

    // 静态内部类
    private static class InnerClass{
        // 初始化实例
        private final static SingletonInStaticInnerClass INSTANCE = new SingletonInStaticInnerClass();
    }

    // 私有构造
    private SingletonInStaticInnerClass() {}

    // 公关获取实例方法（线程安全，延迟加载）
    public static SingletonInStaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}