package javaproject.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import javaproject.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
