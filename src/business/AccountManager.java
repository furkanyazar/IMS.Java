package business;

import java.util.ArrayList;
import java.util.List;

import entities.bases.Account;
import entities.bases.User;

public class AccountManager<T extends Account> {

    private List<T> accounts = new ArrayList<>();

    public List<T> getAll() {
        return accounts;
    }

    public T getById(int id) {
        T account = null;

        for (T t : accounts)
            if (t.getId() == id)
                account = t;

        return account;
    }

    public T getByUser(User user) {
        T account = null;

        for (T t : accounts)
            if (t.getUser() == user)
                account = t;

        return account;
    }

    public void add(T t) throws Exception {
        if (!accounts.add(t))
            throw new Exception("Hesap eklenemedi");
    }

    public void remove(T t) throws Exception {
        if (!accounts.remove(accounts.get(accounts.indexOf(t))))
            throw new Exception("Hesap bulunamadı");
    }

}
