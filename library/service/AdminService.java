package com.yogeshwari.library.service;

import com.yogeshwari.library.entity.Admin;

public interface AdminService {
	String registerAdmin(Admin admin);
	Admin getAdminById(Integer adminId);
        boolean adminLogin(Integer adminId,String adminPassword);
}
