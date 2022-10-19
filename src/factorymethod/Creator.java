package src.factorymethod;



/**
 * 抽象工厂类
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
