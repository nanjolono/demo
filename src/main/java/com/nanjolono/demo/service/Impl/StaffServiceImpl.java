package com.nanjolono.demo.service.Impl;

import com.nanjolono.demo.dao.StaffDao;
import com.nanjolono.demo.dto.StaffDto;
import com.nanjolono.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffDao staffDao;

    @Override
    public void add(StaffDto staffDto) {
        staffDao.add(staffDto);
    }

    @Override
    public void edit(StaffDto staffDto) {
        staffDao.edit(staffDto);
    }

    @Override
    public void delete(StaffDto staffDto) {
        staffDao.delete(staffDto);
    }

    @Override
    public List<StaffDto> list(StaffDto staffDto) {
        return staffDao.list(staffDto);
    }
}
