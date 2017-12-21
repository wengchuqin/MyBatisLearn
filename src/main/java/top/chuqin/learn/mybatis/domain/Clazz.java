package top.chuqin.learn.mybatis.domain;

import java.util.List;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class Clazz {
    private Integer id;
    private String code;
    private List<Student> students;

    public Clazz(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Clazz() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
