

# 工程简介
本工程是为了base-admin的改写做准备，因为本人无spring boot开发经验，所以按教程做这个项目感受一下简易的springboot开发。以下是我做的笔记：
## 前端
本项目是用vue搭前端，在cmd中输入
```shell
vue ui
```
### 安装axois
```shell
vue add axois
```
在安装axios后，页面空白且出现了如下的问题：
```shell
in ./src/plugins/axios.js export 'default' (imported as 'Vue') was not found
```
这个是由于vue2.X和vue3.X不兼容，所以需要开始创建vue项目的时候设置为
#### 错误
```shell
vue : 无法加载文件 C:\Users\Xiongruijie\AppData\Roaming\npm\vue.ps1，因为在此系统上禁止
运行脚本。有关详细信息，请
```
这个错误需要用shell的管理员权限
输入命令
```shell
set-ExecutionPolicy RemoteSigned
```


即可进入vue的ui界面，在该界面中创建vue项目（一切设置为默认即可），在idea中打开编辑
## Dao
Dao层是和数据库对接的一层，在dao层中继承JpaRepository类对数据库操作

我在测试Dao时候卡住了，这里总结一下测试Dao的步骤
### 测试
#### Step1 
对测试的类按`ctr+shift+T`自动生成测试文件类
#### Step2
对测试类加标注`@SpringBootTest`不加会报错
```cmd
Cannot invoke "com.example.springbootstudy.repository.BookRepository.findAll()" because "this.bookRepository" is null
```
#### Step3
在测试类中注册beans
```java
@Autowired
private BookRepository bookRepository;
```
#### Step4
添加测试函数
```java
@Test
public void findAll(){
        System.out.println(bookRepository.findAll());
        }
```

补习一下[Restful](https://blog.csdn.net/weixin_44149821/article/details/110399488) 规范


|   HTTP动词  |   URI路径  |  说明   |
|-----|-----|-----|
|   GET  |  http://域名/news   |  获取列表数据   |
|   GET  |   http://域名/news/:id  |  根据id获取一条数据   |
|   POST  |   http://域名/news  |   添加一条数据  |
|  PUT   |  http://域名/news/:id   | 根据id修改一条数据    |
|  DELETE   |  http://域名/news/:id   | 根据id“删除“一条数据    |
# SpringbootStudy
