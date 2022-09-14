package oop;

public interface Crud<T> extends Query{

    void read();
    void update(T t,String name);
    void delete(T t);

}
