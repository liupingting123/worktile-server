package com.worktile.dao;

public class Listgroup {
    private Integer listid;

    private Integer pid;

    private String listname;

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname == null ? null : listname.trim();
    }
}