# MQERP系统
> 预期后端技术支持:SpringBoot+(Mybatis/JPA/Mybatis-Plus)+Druid+Redis+Quartz+消息队列RabbitMQ+WebSocket+工作流Activiti+DataExchange  
> 日志:ELK/SLF4J+(Log4j2/Logback)+MongoDB   
> 预期前端技术支持:Vue2/Layui
> 开发环境:IDEA+Tomcat+(MySQL8/Oracle)  
> 测试:Swagger2+Postman
 - [ ] 业务流程管理
 - [ ] 成本管理
 - [ ] 产品数据管理
 - [ ] 生产管理
 - [ ] 供应商关系管理
 - [ ] 供应链管理
 - [ ] 客户关系管理
 - [ ] 人力资源管理
 - [ ] 财务管理
 - [ ] 销售管理
 - [ ] 仓储管理
## 1.生产系统
### 1.1.采购和订购
 - [ ] 采购计划【采购材料（生产加工之前，所需的材料和零件），采购量，采购预期成本（单位：分），采购实际成本（单位：分），采购人员（名字，电话），采购日期，采购点（线上、线下），出行工具（步行，摩托车，汽车）】
 - [ ] 采购发票单
 - [ ] 订购【针对企业临时缺货急需情况，通过其他有货源的企业，以及时补缺；】
### 1.2.加工生产
 - [ ] 生产计划【产品，数量，开始日期，截止日期，急需性】
> 下料是指确定制作某个设备或产品所需的材料形状、数量或质量后，从整个或整批材料中取下一定形状、数量或质量的材料的操作过程
 - [ ] 下料计划【如何定制计划，计划内容是什么，计划安排是否可自动化】
 - [ ] 框架组装
 - [ ] 打磨抛光【打磨纸消耗量，工作环境的安全环保合法性】
 - [ ] 油漆上色【油漆消耗量，工作环境的安全环保合法性】
 - [ ] 质检【质检记录，出现问题的，进行返工（由谁来对问题产品修复？指定某人员或造成此问题人员）】
 - [ ] 成品包装【成品数量进行入库，统计记录；成品贴上标签【一、二维码】，形成信息网络化，方便以后核对查看与统计】
 - [ ] 成品入库，根据仓库产品区域分布规定，进行放置
## 2.仓储系统
> 采用人员、网络、硬件设备相互结合的信息化管理模式
 - [ ] 仓库基本信息【编号，admin（name，Tel，Email），position】
 - [ ] 库存量查看方式【根据相关参数，条件式检索】
 - [ ] 库存量展示形式【表格文字+图表】
 - [ ] 库存量紧缺通知【临近设定值，页面通知（可能不切实际）；低于设定值，发送消息（电话、短信、邮件）于仓库管理员】
 - [ ] 成品入库模式【手动电子枪扫描或输入，进行入库信息录入；自动（待探究）】
 - [ ] 仓库内部产品分布区域信息【以便迅速定位产品位置，提高管理效率和出库效率（结合物理设备，室内导航模式）】
 - [ ] 库存成品量支持冻结功能【针对已订购的产品未出库之前可能存在退货、库存紧缺临时调用情况】
 - [ ] 成品出库记录【出库产品量，事因】
 - [ ] 仓库位置以及分布信息【发展到多位置多仓库模式，可能仓库内产品单一性】
 - [ ] 仓库实时监控【影像记录】
 - [ ] 仓库用电监控【峰值警告...等】
 - [ ] 仓库安全监控
 - [ ] 仓库信息、库存信息、入库信息，出库信息，仓库用电信息支持文档生成与打印
## 3.销售系统
> 包含线上和线下模式
 - [ ] 订购产品【线上：客户自行选购与咨询，最终进行下单；线下：客户通过销售人员进行下单】
 - [ ] 客户订单【订单号，订购日期，客户信息（名字，性别，电话，收货地址），订购产品信息（产品，单价，数量），订单类型（零售或批发），交易额信息（优惠率，预付、实付、应付、未付金额）】
 - [ ] 订单自检【检查订单货源量充足性，及时进行货源补充通知】
 - [ ] 订单支持分批次发货
 - [ ] 业绩【总销售量、不同的产品销售量（月度，季度，年度）；对业绩图进行查看分析，以便未来进行合理有效的生产计划，提高最大有效生产价值】 
## 4.物流系统
> 包含短途和长途模式  
> 短途：企业内部交通工具进行短途运输  
> 长途：企业通过物流公司（货运部）进行长途代运
 - [ ] 货运单【单号，发货日期，收货地址（优先依据订单收货地址，可二次修改），收货人信息，货物信息，货运单类型（短途或长途），物流公司（针对长途），货运司机（有待考究）】
 - [ ] 物流公司（货运部）信息管理【名字，地址，途径地址（业务范围）】
## 5.售后系统
### 5.1.产品退货
 - [ ] 退货单【退货产品，数量，退货日期，退货客户，订单号，退款金额，退货原因】
### 5.2.产品返工
 - [ ] 返工单【返工产品，数量，返工日期，返工客户，订单号，返工原因】
### 5.3.产品问题咨询
 - [ ] 【咨询电话，咨询问题】
## 6.财务系统
### 6.1.支出
使用人员，使用时间，使用原因，发票单
### 6.2.收入
时间，地点，资金来源
### 6.3.赊账/欠款
赊账/欠款日期，总赊账/欠款金额，买方【欠款者】，卖方【债主】，是否还清，已还金额，未还金额，还清日期  
注：对财务不了解，未做详细探究
## 7.人员系统
### 7.1.部门
部门信息【部门名字，上级部门，部门组长（正，副）】  
采购部，生产部，质检部，销售部，运输部，财务部，清洁部
### 7.2.职员
职员信息【名字，联系电话，职位，居住地址，所属部门】
