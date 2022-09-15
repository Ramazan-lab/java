package oop;

import java.util.ArrayList;

public interface Query<T> {
    T getUsersById(int id);
    ArrayList<T> getAllUserss();
    T deleteUserById(Long id);
}
