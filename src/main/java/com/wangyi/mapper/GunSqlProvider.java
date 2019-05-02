package com.wangyi.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.wangyi.entity.Gun;

public class GunSqlProvider {

    public String insertSelective(Gun record) {
        BEGIN();
        INSERT_INTO("b_gun");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getGunCode() != null) {
            VALUES("GUN_CODE", "#{gunCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGunNum() != null) {
            VALUES("GUN_NUM", "#{gunNum,jdbcType=VARCHAR}");
        }
        
        if (record.getInternalNum() != null) {
            VALUES("INTERNAL_NUM", "#{internalNum,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyDate() != null) {
            VALUES("BUY_DATE", "#{buyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGunType() != null) {
            VALUES("GUN_TYPE", "#{gunType,jdbcType=VARCHAR}");
        }
        
        if (record.getGunStatus() != null) {
            VALUES("GUN_STATUS", "#{gunStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateUserId() != null) {
            VALUES("CREATE_USER_ID", "#{createUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateDate() != null) {
            VALUES("UPDATE_DATE", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getManMark() != null) {
            VALUES("MAN_MARK", "#{manMark,jdbcType=VARCHAR}");
        }
        
        if (record.getUseCount() != null) {
            VALUES("USE_COUNT", "#{useCount,jdbcType=DECIMAL}");
        }
        
        if (record.getIsClean() != null) {
            VALUES("IS_CLEAN", "#{isClean,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCheck() != null) {
            VALUES("IS_CHECK", "#{isCheck,jdbcType=VARCHAR}");
        }
        
        if (record.getCleanDate() != null) {
            VALUES("CLEAN_DATE", "#{cleanDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckDate() != null) {
            VALUES("CHECK_DATE", "#{checkDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperaterId() != null) {
            VALUES("OPERATER_ID", "#{operaterId,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Gun record) {
        BEGIN();
        UPDATE("b_gun");
        
        if (record.getGunCode() != null) {
            SET("GUN_CODE = #{gunCode,jdbcType=VARCHAR}");
        }
        
        if (record.getGunNum() != null) {
            SET("GUN_NUM = #{gunNum,jdbcType=VARCHAR}");
        }
        
        if (record.getInternalNum() != null) {
            SET("INTERNAL_NUM = #{internalNum,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyDate() != null) {
            SET("BUY_DATE = #{buyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGunType() != null) {
            SET("GUN_TYPE = #{gunType,jdbcType=VARCHAR}");
        }
        
        if (record.getGunStatus() != null) {
            SET("GUN_STATUS = #{gunStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateUserId() != null) {
            SET("CREATE_USER_ID = #{createUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateDate() != null) {
            SET("UPDATE_DATE = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getManMark() != null) {
            SET("MAN_MARK = #{manMark,jdbcType=VARCHAR}");
        }
        
        if (record.getUseCount() != null) {
            SET("USE_COUNT = #{useCount,jdbcType=DECIMAL}");
        }
        
        if (record.getIsClean() != null) {
            SET("IS_CLEAN = #{isClean,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCheck() != null) {
            SET("IS_CHECK = #{isCheck,jdbcType=VARCHAR}");
        }
        
        if (record.getCleanDate() != null) {
            SET("CLEAN_DATE = #{cleanDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckDate() != null) {
            SET("CHECK_DATE = #{checkDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperaterId() != null) {
            SET("OPERATER_ID = #{operaterId,jdbcType=VARCHAR}");
        }
        
        WHERE("ID = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }
}