/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author ChickDev03
 */
public class CustomerDataContext {
    public CustomerDataContext(){
		// La création du DriverManagerDataSource
		        DriverManagerDataSource ds= new DriverManagerDataSource("jdbc:mysql://localhost:3306/classicmodels?useSSL=false");
		        ds.setDriverClassName("com.mysql.jdbc.Driver");
		        // La création jdbctemplate
		        this.jdbcTemplate = new JdbcTemplate(ds);
		    }
		    public List<Customer> select(){
		        
		        List<Customer> liste=this.jdbcTemplate.query("select * from Products", new CustomerMapper() );
		        return liste;

		    }

		    public void insert(Customer p){
		                // exécuter la requete
		       
		        jdbcTemplate.update("insert into customers(customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2,city, state, postalCode, creditLimit ) values(?,?,?,?,?,?,?,?,?,?)",
		                new Object[]{p.getCustomerName(), p.getContactLastName(), p.getContactLastName(), p.getPhone(), p.getAddressLine1(),p.getAddressLine2(),p.getCity(), p.getState(), p.getPostalCode(),p.getCreditLimit()});
		       
		    }
		public Customer selectByID(int customerNumber) {
		        Customer produit=this.jdbcTemplate.queryForObject("select * from customers where customerNumber=?", new Object[]{customerNumber}, new CustomerMapper());
		                return produit;
		    }
		public void update(Customer p) {
		        jdbcTemplate.update("update customers set customerName=?,  contactLastName=?, contactFirstName=?, phone=?, addressLine1=?, addressLine2=?, city=?, state=?, postalCode=?, creditLimit=? where customerNumber=?",
		                new Object[]{p.getCustomerName(), p.getContactLastName(), p.getContactLastName(), p.getPhone(), p.getAddressLine1(),p.getAddressLine2(),p.getCity(), p.getState(), p.getPostalCode(),p.getCreditLimit()});
		    }

		public void delete(int customerNumber) {
		        jdbcTemplate.update("delete from Products where customerNumber=?",
		                new Object[]{customerNumber});
		    }

		private class CustomerMapper implements RowMapper<Customer>{
		        @Override
		        public Customer mapRow(ResultSet rs, int i) throws SQLException {
		            return new Customer(rs.getInt("customerNumber"),rs.getString("customerName"),rs.getString("contactLastName"),rs.getString("contactFirstName"),rs.getString("phone"),rs.getString("addressLine1"),rs.getString("addressLine2"),rs.getString("city"),rs.getString("state"),rs.getString("postalCode"),rs.getDouble("creditLimit"));
		        }
		    }
}
