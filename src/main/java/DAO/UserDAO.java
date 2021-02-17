/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

/**
 *
 * @author ChickDev03
 */
public class UserDAO {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/classicmodels?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    private static String SELECT_USER = "select * from user username=? AND password=?";
    

}
