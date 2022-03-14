package business;

import java.util.ArrayList;
import java.util.List;

import entities.bases.User;

public class UserManager<T extends User> {

    private List<T> users = new ArrayList<>();

    public List<T> getAll() {
        return users;
    }

    public T getById(int id) {
        T user = null;

        for (T t : users)
            if (t.getId() == id)
                user = t;

        return user;
    }

    public void add(T t) throws Exception {
        if (!users.add(t))
            throw new Exception("Kullanıcı eklenemedi");
    }

    public void remove(T t) throws Exception {
        if (!users.remove(users.get(users.indexOf(t))))
            throw new Exception("Kullanıcı bulunamadı");
    }

}
