package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.entity.EmployementRecord;

@Service
public class RecordServiceImpl implements IRecordService {

	List<EmployementRecord> list = List.of(new EmployementRecord(101L, "Samsung", "samsung@gmail.com", 7, 12349L),
			new EmployementRecord(102L, "LG", "lg@gmail.com", 2, 12350L),
			new EmployementRecord(103L, "Hyundai", "hyundai@gmail.com", 5, 12351L),
			new EmployementRecord(104L, "Wipro", "wipro@gmail.com", 3, 12349L),
			new EmployementRecord(105L, "Capgemini", "capgemini@gmail.com", 2, 12352L),
			new EmployementRecord(106L, "Cognizant", "cognizant@gmail.com", 4, 12353L),
			new EmployementRecord(107L, "TCS", "tcs@gmail.com", 5, 12351L),
			new EmployementRecord(108L, "Amazon", "amazong@gmail.com", 9, 12354L),
			new EmployementRecord(109L, "Google", "google@gmail.com", 6, 12355L));

	@Override
	public List<EmployementRecord> getRecordOfEmployee(Long empid) {
		// TODO Auto-generated method stub
		return list.stream().filter(employementRecord -> employementRecord.getEmpId().equals(empid))
				.collect(Collectors.toList());
	}

}
