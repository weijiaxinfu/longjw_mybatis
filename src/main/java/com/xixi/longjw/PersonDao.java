package com.xixi.longjw;


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface PersonDao  {

    @Insert(value="insert into person (user_name,age,birthday) values (#{userName,jdbcType=VARCHAR},#{age,jdbcType=INTEGER},#{birthday,jdbcType=TIMESTAMP})")
    int addPerson(Person person);

    @Select(value="select * from person where id=#{id,jdbcType=INTEGER}")
    @Results(value={@Result(column = "birthday",property = "birthday",jdbcType = JdbcType.TIMESTAMP)})
    Person findPersonById(int id);
}

