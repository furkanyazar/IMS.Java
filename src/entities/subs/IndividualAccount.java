package entities.subs;

import entities.bases.Account;
import entities.bases.User;

public class IndividualAccount extends Account {

    public IndividualAccount(User user) {
        super("Individual Account", user);
    }

}
