package src.factorymethod;

/**
 * 抽象产品
 */
public abstract class Product {

    public void production() {
        System.out.println("公共方法");
    }
    // 抽象方法
    public abstract void create();
}
