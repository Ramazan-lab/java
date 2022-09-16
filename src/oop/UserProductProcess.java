package oop;

public interface UserProductProcess<T> {
    void buy(T t);
    void buy(Product product, BuyingTypesEnum enumsw);

    void buyback(T t);
}
