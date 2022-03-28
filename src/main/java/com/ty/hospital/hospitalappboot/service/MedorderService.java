package com.ty.hospital.hospitalappboot.service;

import org.springframework.stereotype.Service;

import com.ty.hospital.hospitalappboot.dao.MedorderDao;
import com.ty.hospital.hospitalappboot.dto.Medorder;
import com.ty.hospital.hospitalappboot.exception.NoIdFoundException;

@Service
public class MedorderService {
	
	private MedorderDao medorderDao;
	
	public Medorder saveMedorder(int id,Medorder medorder) {
		return medorderDao.saveMedorder(id, medorder);
	}
	public Medorder getMedorderById(int id) {
		return medorderDao.getMedorderById(id);
	}
	public Medorder updateMedorderById(int id) {
		Medorder medOrder = medorderDao.getMedorderById(id);
		if(medOrder == null) {
			throw new NoIdFoundException("GIVEN ID:"+id+"DOESNT EXIXIST");
		}
		return medOrder;
	}
	public void deleteMedorderById(int id) {
		medorderDao.deleteMedorderById(id);
	}

}
