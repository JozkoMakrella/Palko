package model;

public class Student extends User {

    private String classId;
    private Subject listOfSubjectsInActualYear[];

    public Student(int id) {
        super(id);
        this.setUserType(UserType.USER_LEVEL_2);
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    //TODO add get of listOfSubjectInActualYear for specific value etc...
}
