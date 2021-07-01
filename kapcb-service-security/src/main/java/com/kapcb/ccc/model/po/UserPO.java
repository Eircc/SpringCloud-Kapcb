package com.kapcb.ccc.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <a>Title: UserPO </a>
 * <a>Author: Kapcb <a>
 * <a>Description:  <a>
 *
 * @author Kapcb
 * @version 1.0.0
 * @date 2021/6/28 21:23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "access_user")
public class UserPO implements Serializable {

    private static final long serialVersionUID=1L;

    private Long userId;

    private Long supplierId;

    private String username;
}