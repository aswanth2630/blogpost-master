package com.blog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
    private Integer id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="USER_PASSWD")
    private String password;

    @Column(name="IS_ADMIN")
    private boolean isAdmin;

    @Column(name="USER_STATUS")
    private String status;

    @OneToMany
    @JoinColumn(name="BLOG_ID")
    private List<BlogEntity> blogs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<BlogEntity> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<BlogEntity> blogs) {
        this.blogs = blogs;
    }
}
