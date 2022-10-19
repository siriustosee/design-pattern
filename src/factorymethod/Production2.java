package src.factorymethod;

/**
 * 具体产品2
 */
public class Production2 extends Product{
    @Override
    public void create() {
        System.out.println("create product 2");
    }
}
