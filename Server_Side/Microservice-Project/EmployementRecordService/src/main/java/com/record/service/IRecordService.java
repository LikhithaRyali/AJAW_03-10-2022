package com.record.service;

import java.util.List;

import com.record.entity.EmployementRecord;

public interface IRecordService {

	public List<EmployementRecord> getRecordOfEmployee(Long empid);
}
