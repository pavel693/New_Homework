package com.lesson02;

public enum Role {
    ADMIN("admin"), USER("user"), SUPER_USER("superUser");

    private String permissions;

    Role(String permissions) {
        this.permissions = permissions;
    }

    public String getPermissions() {
        return permissions;
    }
}
