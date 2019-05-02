package com.wangyi.mapper;

import com.wangyi.entity.Gun;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GunMapper {
    @Delete({
        "delete from b_gun",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into b_gun (ID, GUN_CODE, ",
        "GUN_NUM, INTERNAL_NUM, ",
        "BUY_DATE, GUN_TYPE, ",
        "GUN_STATUS, CREATE_USER_ID, ",
        "UPDATE_DATE, REMARK, ",
        "MAN_MARK, USE_COUNT, ",
        "IS_CLEAN, IS_CHECK, ",
        "CLEAN_DATE, CHECK_DATE, ",
        "OPERATER_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{gunCode,jdbcType=VARCHAR}, ",
        "#{gunNum,jdbcType=VARCHAR}, #{internalNum,jdbcType=VARCHAR}, ",
        "#{buyDate,jdbcType=TIMESTAMP}, #{gunType,jdbcType=VARCHAR}, ",
        "#{gunStatus,jdbcType=VARCHAR}, #{createUserId,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{manMark,jdbcType=VARCHAR}, #{useCount,jdbcType=DECIMAL}, ",
        "#{isClean,jdbcType=VARCHAR}, #{isCheck,jdbcType=VARCHAR}, ",
        "#{cleanDate,jdbcType=TIMESTAMP}, #{checkDate,jdbcType=TIMESTAMP}, ",
        "#{operaterId,jdbcType=VARCHAR})"
    })
    int insert(Gun record);

    @InsertProvider(type=GunSqlProvider.class, method="insertSelective")
    int insertSelective(Gun record);

    @Select({
        "select",
        "ID, GUN_CODE, GUN_NUM, INTERNAL_NUM, BUY_DATE, GUN_TYPE, GUN_STATUS, CREATE_USER_ID, ",
        "UPDATE_DATE, REMARK, MAN_MARK, USE_COUNT, IS_CLEAN, IS_CHECK, CLEAN_DATE, CHECK_DATE, ",
        "OPERATER_ID",
        "from b_gun",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="GUN_CODE", property="gunCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="GUN_NUM", property="gunNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTERNAL_NUM", property="internalNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUY_DATE", property="buyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GUN_TYPE", property="gunType", jdbcType=JdbcType.VARCHAR),
        @Result(column="GUN_STATUS", property="gunStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_USER_ID", property="createUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_DATE", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAN_MARK", property="manMark", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_COUNT", property="useCount", jdbcType=JdbcType.DECIMAL),
        @Result(column="IS_CLEAN", property="isClean", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_CHECK", property="isCheck", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLEAN_DATE", property="cleanDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_DATE", property="checkDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATER_ID", property="operaterId", jdbcType=JdbcType.VARCHAR)
    })
    Gun selectByPrimaryKey(String id);

    @UpdateProvider(type=GunSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Gun record);

    @Update({
        "update b_gun",
        "set GUN_CODE = #{gunCode,jdbcType=VARCHAR},",
          "GUN_NUM = #{gunNum,jdbcType=VARCHAR},",
          "INTERNAL_NUM = #{internalNum,jdbcType=VARCHAR},",
          "BUY_DATE = #{buyDate,jdbcType=TIMESTAMP},",
          "GUN_TYPE = #{gunType,jdbcType=VARCHAR},",
          "GUN_STATUS = #{gunStatus,jdbcType=VARCHAR},",
          "CREATE_USER_ID = #{createUserId,jdbcType=VARCHAR},",
          "UPDATE_DATE = #{updateDate,jdbcType=TIMESTAMP},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "MAN_MARK = #{manMark,jdbcType=VARCHAR},",
          "USE_COUNT = #{useCount,jdbcType=DECIMAL},",
          "IS_CLEAN = #{isClean,jdbcType=VARCHAR},",
          "IS_CHECK = #{isCheck,jdbcType=VARCHAR},",
          "CLEAN_DATE = #{cleanDate,jdbcType=TIMESTAMP},",
          "CHECK_DATE = #{checkDate,jdbcType=TIMESTAMP},",
          "OPERATER_ID = #{operaterId,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Gun record);
}