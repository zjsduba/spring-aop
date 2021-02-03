package com.example.springaop.beanLifecycle.auto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 集装箱出站单表(TCymCzd)实体类
 *
 * @author lsp
 * @since 2020-06-15 14:26:38
 */
@Data
public class TCymCzd implements Serializable {
    private static final long serialVersionUID = -53876019538521707L;
    /**
     * 记录ID，PK
     **/
    private String id;
    /**
     * 车站电报码
     **/
    private String czdbm;
    /**
     * 车站TMIS码
     **/
    private String cztms;
    /**
     * 车站名称
     **/
    private String czmc;
    /**
     * 出站单编号CZDBM+序列号
     **/
    private String djbh;
    /**
     * 集装箱号
     **/
    private String jzxh;
    /**
     * 收货人
     **/
    private String shr;
    /**
     * 发货人
     **/
    private String fhr;
    /**
     * 箱型
     **/
    private String xx;
    /**
     * 箱类
     **/
    private String xl;
    /**
     * 出站单状态0-生成 1-出站 2-回站
     **/
    private String czdzt;
    /**
     * 出站类型0-下水箱 1-公路发
     **/
    private String czlx;
    /**
     * 调度命令号
     **/
    private String ddmlh;
    /**
     * 接收站
     **/
    private String jszm;
    /**
     * 打印标记0-未打印 1-已打印
     **/
    private String dybj;
    /**
     * 运单货票对应门证条码编号
     **/
    private String ydhptmbh;
    /**
     * 出站单条码编号
     **/
    private String tmbh;
    /**
     * 门卫扫描日期时间
     **/
    private Date mwsmrqsj;
    /**
     * 集装办扫描日期时间
     **/
    private Date jzbsmrqsj;
    /**
     * 空重状态0-空 1-重
     **/
    private String kzzt;
    /**
     * 使用人员
     **/
    private String syry;
    /**
     * 搬运车号
     **/
    private String bych;
    /**
     * 车站经办人代码
     **/
    private String czjbrdm;
    /**
     * 车站经办人姓名
     **/
    private String czjbrxm;
    /**
     * 箱体状态说明
     **/
    private String xtztsm;
    /**
     * 施封号码
     **/
    private String sfhm;
    /**
     * 记事内容
     **/
    private String jsnr;
    /**
     * 记录录入日期
     **/
    private Date lrrq;
    /**
     * 是否回站，默认0
     **/
    private String sfhz;
    /**
     * 回站日期
     **/
    private Date hzrq;
    /**
     * 记录最后更新人员
     **/
    private String lastModifyName;
    /**
     * 记录最后更新时间，默认SYSDATE
     **/
    private Date lastModifyTime;
}