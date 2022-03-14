package business;

import java.util.ArrayList;
import java.util.List;

import entities.bases.Address;

public class AddressManager<T extends Address> {

    private List<T> addresses = new ArrayList<>();

    public List<T> getAll() {
        return addresses;
    }

    public T getById(int id) {
        T address = null;

        for (T t : addresses)
            if (t.getId() == id)
                address = t;

        return address;
    }

    public void add(T t) throws Exception {
        if (!addresses.add(t))
            throw new Exception("Adres eklenemedi");
    }

    public void remove(T t) throws Exception {
        if (!addresses.remove(addresses.get(addresses.indexOf(t))))
            throw new Exception("Adres bulunamadı");
    }

}
