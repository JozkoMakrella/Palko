package model;

enum UserType {
    USER_LEVEL_ADMIN,
    USER_LEVEL_1,
    USER_LEVEL_2
}

public abstract class User {

    private String firstName;
    private String surname;
    private UserType userType;

    private int id;
    private int age;

    User(int id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserType getUserType() {
        return userType;
    }

    protected void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getId(){
        return this.id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
