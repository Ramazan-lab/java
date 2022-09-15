package oop;

public interface Crud<T> {

    void read();
    void update(T t,String name);
    void delete(T t);
    void delete(int id);
    void delete(String name);

}
