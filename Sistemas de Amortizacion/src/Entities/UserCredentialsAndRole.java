/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author User
 */
public class UserCredentialsAndRole {
    private int ID_Cred_Adv;
        private String name;
    private String lastName;
    private String roleName;

    public UserCredentialsAndRole() {
    }

    public UserCredentialsAndRole(int ID_Cred_Adv, String name, String lastName, String roleName) {
        this.ID_Cred_Adv = ID_Cred_Adv;
        this.name = name;
        this.lastName = lastName;
        this.roleName = roleName;
    }

    public int getID_Cred_Adv() {
        return ID_Cred_Adv;
    }

    public void setID_Cred_Adv(int ID_Cred_Adv) {
        this.ID_Cred_Adv = ID_Cred_Adv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


}
