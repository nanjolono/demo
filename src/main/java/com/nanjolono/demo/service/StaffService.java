package com.nanjolono.demo.service;

import com.nanjolono.demo.dto.StaffDto;

import java.util.List;

public interface StaffService {

    void add(StaffDto staffDto);

    void edit(StaffDto staffDto);

    void delete(StaffDto staffDto);

    List<StaffDto> list(StaffDto staffDto);

}
