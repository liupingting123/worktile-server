package com.worktile.dao;

public class ProjectUser extends ProjectUserKey {
    private String permission;

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}