package model;

public class Admin extends Student {

    public Admin(int id) {
        super(id);
        this.setUserType(UserType.USER_LEVEL_ADMIN);
    }
}
