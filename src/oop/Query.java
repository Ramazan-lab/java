package oop;

import java.util.ArrayList;

public interface Query<T> {
    T getUsersById(Long id);
    ArrayList<T> getAllUserss();
    T deleteUserById(Long id);
}
