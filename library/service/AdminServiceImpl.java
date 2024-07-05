package com.yogeshwari.library.service;

import com.yogeshwari.library.dao.AdminDao;
import com.yogeshwari.library.dao.AdminDaoImpl;
import com.yogeshwari.library.entity.Admin;

public class AdminServiceImpl implements AdminService{
	private static AdminDao adminDao=new AdminDaoImpl();

	@Override
	public String registerAdmin(Admin admin) {
		return adminDao.registerAdmin(admin);
	}

	@Override
	public Admin getAdminById(Integer adminId) {
		return adminDao.getAdminById(adminId);
	}

	@Override
	public boolean adminLogin(Integer adminId, String adminPassword) {
		return adminDao.adminLogin(adminId, adminPassword);
	}

}
