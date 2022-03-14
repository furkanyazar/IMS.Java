package entities.subs;

import entities.bases.Account;
import entities.bases.User;

public class EnterpriseAccount extends Account {

    public EnterpriseAccount(User user) {
        super("Enterprise Account", user);
    }

}
