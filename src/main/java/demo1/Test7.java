package demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test7 {
    public static void main(String[] args) {
        //1下单前进行判断库存大小是否满足下单数量需求
        //  2满足条件进行下单 先添加到order_item表中 进行表关联 更新order表信息和inventory库存表的数量；
        //  （这中间会存在事务问题，如果用springboot开发可以用@Transation注解解决该问题，
        //  如果用原生的jdbc操作可以使用setAutoCommit(false)和commit()来添加事务）
    }
}
