package src.singleton;

/**
 * 懒汉式实现单例模式
 */
public class SingletonInLazy {

    private  static final SingletonInLazy singleton =  new SingletonInLazy();
    private SingletonInLazy() {}
    private static  synchronized SingletonInLazy getSingleton() {
        if (singleton == null) {
            return new SingletonInLazy();
        }
        return singleton;
    }


}
