package javaproject.reggie.dto;

import javaproject.reggie.entity.Setmeal;
import javaproject.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
