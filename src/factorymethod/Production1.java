package src.factorymethod;

/**
 * 具体产品1
 */
public class Production1 extends Product{
    @Override
    public void create() {
        System.out.println("create product 1");
    }
}
