# crm客户关系管理系统

### 开发环境
windows8+myeclipse10.0+mysql5.5+git+tomcat7.x

### 项目简介
CRM系统用于维护学生与学校之间的关系

### 技术架构
Spring+Hibernate+Struts2<br/>
文件上传下载技术、MD5加密、ajax二级联动、分页查询、json、c3p0等

### 基本模块功能
1、员工登录[表单校验、必须登录拦截器]、修改密码[表单校验]、重新登录

2、人力资源部
- 部门管理（添加部门、编辑部门、查询所有部门[分页]）
- 职务管理（添加职务、编辑职务、查询所有职务）
- 员工管理（添加员工[ajax级联]、编辑员工、查询所有员工[条件查询]）
	
3、教学部
- 课程类别（添加类别、修改类别、查询所有类别[条件查询]）
- 班级管理（添加班级、编辑班级、查询所有班级[分页]、上传课表、下载课表）
	
4、咨询部
- 咨询学生管理（添加咨询[ajax级联]、查看咨询、编辑咨询、添加跟踪、录入学籍[chain]）
- 查询报名学生[分页 + 条件]
	
5、学工部
- 在校学生管理（查询学生[条件查询 | ajax级联]、添加学生[ajax级联]、编辑学生、升级/转班[ajax级联]、流失）	
- 学生升级/转班
- 学生流失情况
	
6、就业部
- 就业情况（添加就业信息[ajax级联]、编辑就业信息、查询所有[分页]）

#### 我的联系
QQ：2570886020             <br/>
邮箱：2570886020@qq.com    </br>
我的博客：https://blog.csdn.net/shaonianbz </br>
版权归作者所有，转载请注明出处
