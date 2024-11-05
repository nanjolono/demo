package com.nanjolono.demo.dao;

import com.nanjolono.demo.dto.StaffDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffDao {

    void add(StaffDto staffDto);

    void edit(StaffDto staffDto);

    void delete(StaffDto staffDto);

    List<StaffDto> list(StaffDto staffDto);

}
