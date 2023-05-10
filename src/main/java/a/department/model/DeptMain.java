package a.department.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeptMain {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) //mandatory
    private int did;
    private String name;
    private String state;

//    default constructor
    public DeptMain() {
    }

    public DeptMain( String name, String state) {
        this.name = name;
        this.state = state;
    }
//    getter and setter


    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
