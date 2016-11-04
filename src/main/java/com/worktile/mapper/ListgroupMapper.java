package com.worktile.mapper;

import com.worktile.dao.Listgroup;
import com.worktile.dao.ListgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListgroupMapper {
    int countByExample(ListgroupExample example);

    int deleteByExample(ListgroupExample example);

    int deleteByPrimaryKey(Integer listid);

    int insert(Listgroup record);

    int insertSelective(Listgroup record);

    List<Listgroup> selectByExample(ListgroupExample example);

    Listgroup selectByPrimaryKey(Integer listid);

    int updateByExampleSelective(@Param("record") Listgroup record, @Param("example") ListgroupExample example);

    int updateByExample(@Param("record") Listgroup record, @Param("example") ListgroupExample example);

    int updateByPrimaryKeySelective(Listgroup record);

    int updateByPrimaryKey(Listgroup record);
}