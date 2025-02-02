package com.example.lostandfound.mapper;

import com.example.lostandfound.model.UserTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int insert(UserTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int insertSelective(UserTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    UserTable selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int updateByPrimaryKeySelective(UserTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserTable
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int updateByPrimaryKey(UserTable record);
    @Select("SELECT * FROM UserTable")
    @Results({
            /*@Result(property = "userId", column = "userId"),*/
            @Result(property = "username", column = "username"),
            @Result(property = "usrpwd", column = "usrpwd"),
            @Result(property = "phonenumber", column = "phonenumber"),
            @Result(property = "credit", column = "credit"),
            @Result(property = "score", column = "score"),
            @Result(property = "portrait", column = "portrait"),
    })
    List<UserTable> queryAll();

    @Select("SELECT * FROM UserTable WHERE username = #{username}")
    /*@Results({
            @Result(property = "usrpwd", column = "usrpwd")
    })*/
    UserTable login(String username);

    @Select("SELECT count(*) FROM UserTable")
    int getCount();

    @Select("SELECT max(userId) FROM UserTable")
    int getMaxId();

    @Select("SELECT username FROM UserTable WHERE userId=#{userId}")
    String getUsername(int userId);
}