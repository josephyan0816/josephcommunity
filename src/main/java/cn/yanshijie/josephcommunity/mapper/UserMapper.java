package cn.yanshijie.josephcommunity.mapper;

import cn.yanshijie.josephcommunity.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author Joseph
 * @version 1.0
 * 2019/11/5 22:29
 **/

@Mapper
public interface UserMapper {


    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified)values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    public void insert(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
