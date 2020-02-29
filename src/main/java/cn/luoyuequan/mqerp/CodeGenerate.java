package cn.luoyuequan.mqerp;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author luoyuequan
 * @time 2020/1/4 12:46
 */
public class CodeGenerate {
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入" + tip + "：");
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

//         全局配置
        GlobalConfig gc = new GlobalConfig();
//        当前项目根路径
        String projectPath = System.getProperty("user.dir");
//        生成文件的输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
//        是否覆盖已有文件
        gc.setFileOverride(true);
//        开发作者 默认值：null
        gc.setAuthor("luoyuequan");
//        是否打开输入目录
        gc.setOpen(false);
//        是否在xml中添加二级缓存配置，默认值false
        gc.setEnableCache(false);
//        关闭 Kotlin 模式，默认false
        gc.setKotlin(false);
//        开启实体属性Swagger2注解，默认值false
        gc.setSwagger2(true);
//        关闭ActiveRecord，默认值false
        gc.setActiveRecord(false);
//        是否在xml中添加BaseResultMap
        gc.setBaseResultMap(true);
//        是否在xml中添加BaseColumnList
        gc.setBaseColumnList(true);
//        时间类型对应策略，默认值TIME_PACK
        gc.setDateType(DateType.TIME_PACK);
//        指定生成的主键的ID类型 默认值：null
        gc.setIdType(IdType.AUTO);
//        实体命名方式 默认值：null 例如：%sEntity 生成 UserEntity
//        gc.setEntityName("%sEntity");
//        mapper 命名方式 默认值：null 例如：%sDao 生成 UserDao
        gc.setMapperName("%sMapper");
//        Mapper xml 命名方式 默认值：null 例如：%sDao 生成 UserDao.xml
        gc.setXmlName("%sMapper");
        /*gc.setServiceName("");
        gc.setServiceImplName("");
        gc.setControllerName("");*/
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/mqerp?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=true");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("dev");
        dsc.setPassword("dev123456.");
        dsc.setDbType(DbType.MYSQL);
        //自定义类型转换
        /*dsc.setTypeConvert(new MySqlTypeConvert() {
            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                String t = fieldType.toLowerCase();
                if (t.contains("json")) {
                    return DbColumnType.OBJECT;
                }
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });*/
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
//    pc.setModuleName(scanner("模块名"));
        pc.setParent("cn.luoyuequan.mqerp");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
//                    + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
//        cfg.setFileCreate(new IFileCreate() {
//            @Override
//            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
//                // 判断自定义文件夹是否需要创建
//                checkDir("调用默认方法创建的目录");
//                return false;
//            }
//        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();
        //自定义xml时，此处设为null
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置-----------------------------------------
        StrategyConfig strategy = new StrategyConfig();
        // 是否大写命名
        strategy.setCapitalMode(false);
        // 是否跳过视图
        strategy.setSkipView(false);
        // 数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 数据库表字段映射到实体的命名策略, 未指定按照 naming 执行
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 表前缀
        // strategy.setTablePrefix(pc.getModuleName() + "_");
        // 字段前缀
        //strategy.setFieldPrefix()
        // strategy.setSuperEntityClass("自定义继承的Entity类全称，带包名");
        // 写于父类中的公共字段 strategy.setSuperEntityColumns("id");
//        strategy.setSuperControllerClass("cn.luoyuequan.mqerp.common.BaseController");
        // 【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
        // 【实体】是否生成字段名常量（默认 false）
        strategy.setEntityColumnConstant(false);
        // Boolean类型字段是否移除is前缀（默认 false）
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        // 生成 @RestController 控制器
        strategy.setRestControllerStyle(true);
        // 需要包含的表名，允许正则表达式（与exclude二选一配置
        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        // 是否生成实体时，生成字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
        //乐观锁字段名称
        strategy.setVersionFieldName("version");
        // 逻辑删除字段名称
        strategy.setLogicDeleteFieldName("is_deleted");
        // 表填充字段
        List<TableFill> fillList = List.of(new TableFill("update_time", FieldFill.UPDATE));
        strategy.setTableFillList(fillList);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
