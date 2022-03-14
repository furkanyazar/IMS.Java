package business;

import java.util.ArrayList;
import java.util.List;

import entities.bases.Insurance;

public class InsuranceManager<T extends Insurance> {

    private List<T> insurances = new ArrayList<>();

    public List<T> getAll() {
        return insurances;
    }

    public T getById(int id) {
        T insurance = null;

        for (T t : insurances)
            if (t.getId() == id)
                insurance = t;

        return insurance;
    }

    public void add(T t) throws Exception {
        if (!insurances.add(t))
            throw new Exception("Sigorta eklenemedi");
    }

    public void remove(T t) throws Exception {
        if (!insurances.remove(insurances.get(insurances.indexOf(t))))
            throw new Exception("Sigorta bulunamadı");
    }

}
