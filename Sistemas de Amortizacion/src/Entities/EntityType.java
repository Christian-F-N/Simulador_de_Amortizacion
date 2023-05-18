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
public class EntityType {

int ID_Ent_Typ;
   String Nam_Ent_Typ;

    public EntityType() {
    }

    public EntityType(int ID_Ent_Typ, String Nam_Ent_Typ) {
        this.ID_Ent_Typ = ID_Ent_Typ;
        this.Nam_Ent_Typ = Nam_Ent_Typ;
    }

    public int getID_Ent_Typ() {
        return ID_Ent_Typ;
    }

    public void setID_Ent_Typ(int ID_Ent_Typ) {
        this.ID_Ent_Typ = ID_Ent_Typ;
    }

    public String getNam_Ent_Typ() {
        return Nam_Ent_Typ;
    }

    public void setNam_Ent_Typ(String Nam_Ent_Typ) {
        this.Nam_Ent_Typ = Nam_Ent_Typ;
    }
   
   
}
