package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entity.Admin;
import com.nagarro.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	public Admin getAdminById(Long adminId) {
		// TODO Auto-generated method stub
		return adminRepository.findByAdminId(adminId);
	}

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	public String deleteAdminById(Long adminId) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(adminId);
		return ("Admin deleted with id ->"+adminId);
	}

}
