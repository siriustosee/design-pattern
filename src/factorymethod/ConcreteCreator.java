package src.factorymethod;



/**
 * 具体工厂
 */
public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return (T) product;
    }
}
