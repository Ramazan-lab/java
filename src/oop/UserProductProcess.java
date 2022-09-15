package oop;

public interface UserProductProcess<T> {
    void buy(T t);
    void buyback(T t);
}
