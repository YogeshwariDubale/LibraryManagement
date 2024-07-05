package com.yogeshwari.library.dao;
import com.yogeshwari.library.entity.Admin;


public interface AdminDao {
	String registerAdmin(Admin admin);
	public Admin getAdminById(Integer adminId);
    boolean adminLogin(Integer adminId,String adminPassword);
}
