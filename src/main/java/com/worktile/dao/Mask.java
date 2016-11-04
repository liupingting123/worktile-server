package com.worktile.dao;

import java.util.Date;

public class Mask {
    private Integer mid;

    private String markname;

    private Integer listid;

    private Integer parentmark;

    private String creator;

    private Date creatortime;

    private Date uptotime;

    private String markcontext;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMarkname() {
        return markname;
    }

    public void setMarkname(String markname) {
        this.markname = markname == null ? null : markname.trim();
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getParentmark() {
        return parentmark;
    }

    public void setParentmark(Integer parentmark) {
        this.parentmark = parentmark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatortime() {
        return creatortime;
    }

    public void setCreatortime(Date creatortime) {
        this.creatortime = creatortime;
    }

    public Date getUptotime() {
        return uptotime;
    }

    public void setUptotime(Date uptotime) {
        this.uptotime = uptotime;
    }

    public String getMarkcontext() {
        return markcontext;
    }

    public void setMarkcontext(String markcontext) {
        this.markcontext = markcontext == null ? null : markcontext.trim();
    }
}