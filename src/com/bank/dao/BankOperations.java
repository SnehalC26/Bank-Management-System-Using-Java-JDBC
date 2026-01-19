package com.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.model.Account;
import com.bank.util.DBConnection;

public class BankOperations {
	
	public void createAccount(Account acc) {
		try(Connection con = DBConnection.getConnection())
		{
		String sql=("insert into account values(?,?,?)");
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setInt(1,acc.getAccNo());
		ps.setString(2, acc.getHolderName());
		ps.setDouble(3, acc.getBalance());
		ps.executeUpdate();
		syso
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	public void showAccount(int accNo) {
		String sql ="select * from account where id=? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 3);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int accNo1= rs.getInt(1);
				System.out.println(accNo1);
				String holderName=rs.getString(2);
				System.out.println(holderName);
				double balance = rs.getDouble(3);
				System.out.println(balance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void deposit(int accNo, double amount) {
		String sql = ("update account set balance += ? where accNo=?");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(2, accNo);
			ps.setDouble(1, amount);
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				System.out.println("Updated successfully!");
			}
			else {
				System.out.println("Account number invalid.");
			}
		ps.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void withdraw(int accNo, double amount) {
		6
		try {
			PreparedStatement ps = con.prepareStatement(select balance from account where accNo= ?);
			ps.setInt(1, accNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				double balance = rs.getDouble(1);
				if(balance=rs.getDouble(accNo)e)
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
