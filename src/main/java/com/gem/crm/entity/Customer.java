package com.gem.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("CRM_CUSTOMER")
public class Customer implements Serializable {

	private static final long serialVersionUID = 4677391873389290950L;
	@TableId(type = IdType.AUTO)
	private Long id;
	private String header;
	private String name;
	private Gender gender;
	private Date birthday;
}
