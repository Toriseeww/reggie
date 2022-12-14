package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveSetmealDto(SetmealDto setmealDto);

    void deleteSetmealDto(List<Long> ids);

    void updateSetmealDto(SetmealDto setmealDto);
}
