package com.wangyi.mapper;

import com.wangyi.entity.Device;
import com.wangyi.entity.DeviceWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DeviceMapper {
    @Delete({
        "delete from e_device",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into e_device (ID, DEVICE_NUMBER, ",
        "LOCK_TYPE, STATUS, ",
        "UNLOCK_TYPE, SHORT_ADDRESS, ",
        "AREA_ID, DEVICE_NAME, ",
        "TRANSFERBOX, DEVICE_TYPE, ",
        "CASHBOX_MODEL, OPEN_TIME, ",
        "CLOSE_TIME, LAST_CASH, ",
        "LAST_BOX, QRCODE, ",
        "WEANING_TIME, RESTART_TIME, ",
        "DEVICE_ROOM, LOCK_ID, ",
        "IS_URBAN, INTER_CITY, ",
        "PICK_UP_TIME, DEVICE_BELONG, ",
        "DEVICE_PRO, ORGANIZATION_ID, ",
        "ADDRESS, NOTES, ",
        "PAY_CARD_ADDRESS)",
        "values (#{id,jdbcType=VARCHAR}, #{deviceNumber,jdbcType=VARCHAR}, ",
        "#{lockType,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{unlockType,jdbcType=VARCHAR}, #{shortAddress,jdbcType=VARCHAR}, ",
        "#{areaId,jdbcType=VARCHAR}, #{deviceName,jdbcType=VARCHAR}, ",
        "#{transferbox,jdbcType=VARCHAR}, #{deviceType,jdbcType=VARCHAR}, ",
        "#{cashboxModel,jdbcType=VARCHAR}, #{openTime,jdbcType=VARCHAR}, ",
        "#{closeTime,jdbcType=VARCHAR}, #{lastCash,jdbcType=DECIMAL}, ",
        "#{lastBox,jdbcType=VARCHAR}, #{qrcode,jdbcType=VARCHAR}, ",
        "#{weaningTime,jdbcType=TIMESTAMP}, #{restartTime,jdbcType=TIMESTAMP}, ",
        "#{deviceRoom,jdbcType=VARCHAR}, #{lockId,jdbcType=VARCHAR}, ",
        "#{isUrban,jdbcType=VARCHAR}, #{interCity,jdbcType=VARCHAR}, ",
        "#{pickUpTime,jdbcType=TIMESTAMP}, #{deviceBelong,jdbcType=VARCHAR}, ",
        "#{devicePro,jdbcType=VARCHAR}, #{organizationId,jdbcType=LONGVARCHAR}, ",
        "#{address,jdbcType=LONGVARCHAR}, #{notes,jdbcType=LONGVARCHAR}, ",
        "#{payCardAddress,jdbcType=LONGVARCHAR})"
    })
    int insert(DeviceWithBLOBs record);

    int insertSelective(DeviceWithBLOBs record);

    @Select({
        "select",
        "ID, DEVICE_NUMBER, LOCK_TYPE, STATUS, UNLOCK_TYPE, SHORT_ADDRESS, AREA_ID, DEVICE_NAME, ",
        "TRANSFERBOX, DEVICE_TYPE, CASHBOX_MODEL, OPEN_TIME, CLOSE_TIME, LAST_CASH, LAST_BOX, ",
        "QRCODE, WEANING_TIME, RESTART_TIME, DEVICE_ROOM, LOCK_ID, IS_URBAN, INTER_CITY, ",
        "PICK_UP_TIME, DEVICE_BELONG, DEVICE_PRO, ORGANIZATION_ID, ADDRESS, NOTES, PAY_CARD_ADDRESS",
        "from e_device",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("ResultMapWithBLOBs")
    DeviceWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DeviceWithBLOBs record);

    @Update({
        "update e_device",
        "set DEVICE_NUMBER = #{deviceNumber,jdbcType=VARCHAR},",
          "LOCK_TYPE = #{lockType,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "UNLOCK_TYPE = #{unlockType,jdbcType=VARCHAR},",
          "SHORT_ADDRESS = #{shortAddress,jdbcType=VARCHAR},",
          "AREA_ID = #{areaId,jdbcType=VARCHAR},",
          "DEVICE_NAME = #{deviceName,jdbcType=VARCHAR},",
          "TRANSFERBOX = #{transferbox,jdbcType=VARCHAR},",
          "DEVICE_TYPE = #{deviceType,jdbcType=VARCHAR},",
          "CASHBOX_MODEL = #{cashboxModel,jdbcType=VARCHAR},",
          "OPEN_TIME = #{openTime,jdbcType=VARCHAR},",
          "CLOSE_TIME = #{closeTime,jdbcType=VARCHAR},",
          "LAST_CASH = #{lastCash,jdbcType=DECIMAL},",
          "LAST_BOX = #{lastBox,jdbcType=VARCHAR},",
          "QRCODE = #{qrcode,jdbcType=VARCHAR},",
          "WEANING_TIME = #{weaningTime,jdbcType=TIMESTAMP},",
          "RESTART_TIME = #{restartTime,jdbcType=TIMESTAMP},",
          "DEVICE_ROOM = #{deviceRoom,jdbcType=VARCHAR},",
          "LOCK_ID = #{lockId,jdbcType=VARCHAR},",
          "IS_URBAN = #{isUrban,jdbcType=VARCHAR},",
          "INTER_CITY = #{interCity,jdbcType=VARCHAR},",
          "PICK_UP_TIME = #{pickUpTime,jdbcType=TIMESTAMP},",
          "DEVICE_BELONG = #{deviceBelong,jdbcType=VARCHAR},",
          "DEVICE_PRO = #{devicePro,jdbcType=VARCHAR},",
          "ORGANIZATION_ID = #{organizationId,jdbcType=LONGVARCHAR},",
          "ADDRESS = #{address,jdbcType=LONGVARCHAR},",
          "NOTES = #{notes,jdbcType=LONGVARCHAR},",
          "PAY_CARD_ADDRESS = #{payCardAddress,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(DeviceWithBLOBs record);

    @Update({
        "update e_device",
        "set DEVICE_NUMBER = #{deviceNumber,jdbcType=VARCHAR},",
          "LOCK_TYPE = #{lockType,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "UNLOCK_TYPE = #{unlockType,jdbcType=VARCHAR},",
          "SHORT_ADDRESS = #{shortAddress,jdbcType=VARCHAR},",
          "AREA_ID = #{areaId,jdbcType=VARCHAR},",
          "DEVICE_NAME = #{deviceName,jdbcType=VARCHAR},",
          "TRANSFERBOX = #{transferbox,jdbcType=VARCHAR},",
          "DEVICE_TYPE = #{deviceType,jdbcType=VARCHAR},",
          "CASHBOX_MODEL = #{cashboxModel,jdbcType=VARCHAR},",
          "OPEN_TIME = #{openTime,jdbcType=VARCHAR},",
          "CLOSE_TIME = #{closeTime,jdbcType=VARCHAR},",
          "LAST_CASH = #{lastCash,jdbcType=DECIMAL},",
          "LAST_BOX = #{lastBox,jdbcType=VARCHAR},",
          "QRCODE = #{qrcode,jdbcType=VARCHAR},",
          "WEANING_TIME = #{weaningTime,jdbcType=TIMESTAMP},",
          "RESTART_TIME = #{restartTime,jdbcType=TIMESTAMP},",
          "DEVICE_ROOM = #{deviceRoom,jdbcType=VARCHAR},",
          "LOCK_ID = #{lockId,jdbcType=VARCHAR},",
          "IS_URBAN = #{isUrban,jdbcType=VARCHAR},",
          "INTER_CITY = #{interCity,jdbcType=VARCHAR},",
          "PICK_UP_TIME = #{pickUpTime,jdbcType=TIMESTAMP},",
          "DEVICE_BELONG = #{deviceBelong,jdbcType=VARCHAR},",
          "DEVICE_PRO = #{devicePro,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Device record);
}