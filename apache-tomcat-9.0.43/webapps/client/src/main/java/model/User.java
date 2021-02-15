/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ChickDev03
 */
public class User {
    private int Id;
    private string Name;
    private string Username;
    private string Password;
    private int Type;
    private int Status;

    public User(int id, string name, string username, string password, int type, int status){
       this.Id = id;
       this.Name = name;
       this.Username = username;
       this.Password = password;
       this.Type = type;
       this.Status = status;
    }
    
    public int getId(){
        return this.Id;
    }
    public string getName(){
        return this.Name;
    }
    public void  setName(string name){
        this.Name = name;
    }
    public string getName(){
        return this.Name;
    }
    public void  setPassword(string password){
        this.Password = password;
    }

    public int getType(){
        return this.Type;
    }
    public void setType(int type){
        this.Type = type;
    }
    public int getStatus(){
        return this.Type;
    }
    public void setStatus(int status){
        this.Status = status;
    }
}
