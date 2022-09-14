import java.util.ArrayList;

public interface LearningInterfaces<T> extends Querys {
    void create(T t);
    void read(T t);
    void update(T t);
    void delete(T t);
}
 interface Querys<T>{
    T getUsersById(Long id);
    ArrayList<T> getAllUserss();
}


class main implements LearningInterfaces<User>{


    @Override
    public void create(User user) {
        System.out.println("user created");
    }

    @Override
    public void read(User user) {
        System.out.println("user displayed");
    }

    @Override
    public void update(User user) {
        System.out.println("user uptated");
    }

    @Override
    public void delete(User user) {
        System.out.println("user deleted");
    }

    @Override
    public User getUsersById(Long id) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUserss() {
        return null;
    }

    public static void Intrfc(String[] args) {


    }
}


