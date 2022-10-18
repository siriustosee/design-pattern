package src.singleton;

/**
 * 饿汉式实现单例模式
 */
public class SingletonInHunger {

    private  static final SingletonInHunger singleton =  new SingletonInHunger();
    private SingletonInHunger() {}
    private SingletonInHunger getSingleton() {
        return singleton;
    }


}
