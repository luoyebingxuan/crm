package com.gem.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**用户实体*/
@Data
@NoArgsConstructor
@AllArgsConstructor
//设置实体和表名对应
@TableName("CRM_USER")
public class User implements Serializable {
	private static final long serialVersionUID = -2808363615728865097L;
	//设置id自动增加
	@TableId(type = IdType.AUTO)
	private Long id;
	private String username;
	private String password;
}
