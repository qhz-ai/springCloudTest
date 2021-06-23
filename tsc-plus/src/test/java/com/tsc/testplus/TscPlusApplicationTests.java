package com.tsc.testplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.service.USERervice;
import com.baomidou.service.impl.UserServiceImpl;
import com.tsc.Mapper.UserMapper;
import com.tsc.entity.User;
import com.tsc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TscPlusApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserServiceImpl useRervice;
	@Test
	void contextLoads() {
	}
	@Test
	public void testSelect(){
		System.out.println("-----selectAll method test-----");
	//	List<User> users = userMapper.selectList(null);
		List<com.baomidou.entity.User> users1 =userMapper.selectList(null);
		for (com.baomidou.entity.User user : users1) {
			System.out.println(user);
		}
	}
	@Test
	public void  testAll(){

		System.out.println(this.useRervice.list());
	}
	@Test
	public void CodeGenerator(){
		//创建代码生成器
		AutoGenerator mpg = new AutoGenerator();
		//全局配置
		GlobalConfig gc = new GlobalConfig();
		//此处建议写项目/src/main/java源代码的绝对路径
		gc.setOutputDir("E:\\baidudownload\\leyouTest\\tsc-plus"+"/src/main/java");
		//生成注释的作者
		gc.setAuthor("scorpios");
		//生成后是否打开资源管理器
		gc.setOpen(false);
		gc.setFileOverride(true);//重新生成文件是否覆盖
		gc.setServiceName("%Service");//去掉service接口的首字母
		gc.setIdType(IdType.AUTO);//主键策略
		gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
		//如果开启swagger,需要引入相应的包
		//gc.setSwagger2(true);
		mpg.setGlobalConfig(gc);
		//数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl("jdbc:mysql://localhost:3306/mybites?useUnicode=true&characterEncoding=utf8");
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("123456");
		dsc.setDbType(DbType.MYSQL);
		mpg.setDataSource(dsc);
		//包配置
		PackageConfig pc = new PackageConfig();
		//此处注意：parent+moduleName为包的名字，在这个包下，创建对应的Controller
		pc.setParent("com.tsc");
		pc.setModuleName("tscTest");
		pc.setController("controller");
		pc.setEntity("entity");
		pc.setService("service");
		pc.setMapper("Mapper");

		//策略配置
		StrategyConfig strategy = new StrategyConfig();
		//数据库中表的名字，表示要对哪些表进行自动生成controller,service,mapper....
		strategy.setInclude("user");
		//数据库表映射到实体的命名策略，驼峰命名法
		strategy.setNaming(NamingStrategy.underline_to_camel);
		//生成实体时去掉表前缀，比如edu_course,如果不加下面这句，生成实体类的名字就是EduCourse
		//数据库表字段映射到实体的命名策略
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		strategy.setEntityLombokModel(true);//lombok模型@Accessors(chain=true) setter链式操作
		strategy.setRestControllerStyle(true); //restful api风格控制器
		strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

		mpg.setStrategy(strategy);
		// 6、执行
		mpg.execute();



	}


}
