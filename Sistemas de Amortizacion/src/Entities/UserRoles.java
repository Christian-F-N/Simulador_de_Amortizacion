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
public class UserRoles {
    int ID_User_Rol;
    String Name_Rol;

    public UserRoles() {
    }

    public UserRoles(int ID_User_Rol, String Name_Rol) {
        this.ID_User_Rol = ID_User_Rol;
        this.Name_Rol = Name_Rol;
    }

    public int getID_User_Rol() {
        return ID_User_Rol;
    }

    public void setID_User_Rol(int ID_User_Rol) {
        this.ID_User_Rol = ID_User_Rol;
    }

    public String getName_Rol() {
        return Name_Rol;
    }

    public void setName_Rol(String Name_Rol) {
        this.Name_Rol = Name_Rol;
    }
    
    
    
    
}
