package model;

public class Teacher extends User {

    private Subject listOfSubjectsInActualYear[];

    public Teacher(int id) {
        super(id);
        this.setUserType(UserType.USER_LEVEL_1);
    }
}
