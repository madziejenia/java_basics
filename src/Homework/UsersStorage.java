package Homework;


public class UsersStorage extends Users {
    private String name;

    public UsersStorage(String name) {
        this.name = name;
    }

    public void setFirstName(String newName){name = newName;}
    public String getFirstName(){return name;}


    public String toString(){
        String s = "Users \n";
        s += "\nName: " + getFirstName();
        return s;
    }


}