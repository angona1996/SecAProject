package controller;

import model.StudentModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ango")
@SessionScoped
public class StudentController {
    StudentModel obj=new StudentModel();

    public StudentController() {
    }

    public StudentModel getObj() {
        return obj;
    }

    public void setObj(StudentModel obj) {
        this.obj = obj;
    }
    public String isNext()
    {
        return "success";
    }
}
